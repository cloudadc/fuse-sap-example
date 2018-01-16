package com.redhat.poc.processor;

import java.util.Map;
import java.util.stream.Collectors;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public abstract class MappingProcessor implements Processor {
	
	protected static final String PROPS_MAPPING = "PropertiesMappingProcessor";
	protected static final String DB_MAPPING = "DBMappingProcessor";
	
	String[] registory = new String[]{PROPS_MAPPING, DB_MAPPING};
	
	public abstract void process(Exchange exchange) throws Exception;
	
	@SuppressWarnings("unchecked")
	protected Map<String, Object> getPresMap(Exchange exchange) {
		Object obj = null;
		for(String key : registory) {
			obj = exchange.getProperty(key);
			if(obj != null) {
				break;
			}
		}
		return (Map<String, Object>)obj;
	}

	protected Map<String, Object> clone(Map<String, Object> map) {
		return map.entrySet()
				  .stream()
				  .collect(Collectors.toMap(Map.Entry::getKey, e -> e.getValue()));
	}

}
