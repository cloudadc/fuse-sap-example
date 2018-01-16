package com.redhat.poc.processor;

import java.util.List;
import java.util.Map;

import org.apache.camel.Exchange;

public class DBMappingProcessor extends MappingProcessor {
	
	private static final String ORDER_UNIT = "orderunit";

	@Override
	public void process(Exchange exchange) throws Exception {
		
		Map<String, Object> map = getPresMap(exchange);
		if(map != null) {
			List<?> list = (List<?>) exchange.getIn().getBody();
			list.forEach(e -> {
				Map<?,?> rowMap = (Map<?, ?>) e;
				if(map.get(ORDER_UNIT).equals(rowMap.get(ORDER_UNIT))) {
					rowMap.forEach((k,v) -> {
						map.put((String)k, v);
					});
				}
			});
		}
		exchange.setProperty(DB_MAPPING, clone(map));
		exchange.getIn().setBody(map);
		exchange.setOut(exchange.getIn());
	}

}
