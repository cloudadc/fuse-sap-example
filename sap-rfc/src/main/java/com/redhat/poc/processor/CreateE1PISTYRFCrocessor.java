package com.redhat.poc.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.fusesource.camel.component.sap.SapSynchronousRfcDestinationEndpoint;
import org.fusesource.camel.component.sap.model.rfc.Structure;
import org.fusesource.camel.component.sap.model.rfc.impl.StructureImpl;

import com.redhat.poc.jaxb.EKSEKS01;
import com.redhat.poc.jaxb.EKSEKS01.IDOC.E1PISTY.E1PISHO;
import com.redhat.poc.jaxb.ObjectFactory;
import com.redhat.poc.model.Poline;

public class CreateE1PISTYRFCrocessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {

		// do some bridge links
		Poline poline = (Poline) exchange.getIn().getBody();
		EKSEKS01.IDOC.E1PISTY.E1PISHO e1 = new ObjectFactory().createEKSEKS01IDOCE1PISTYE1PISHO();
		e1.setBEDAT(poline.getStoreloc());
		
//		buildRequest(exchange, e1);
		
		StructureImpl request = new StructureImpl();
		request.put("CUSTOMER_NAME", "*");
		request.put("MAX_ROWS", 10);
		request.put("WEB_USER", "*");
		
		// Set the request in in the body of the exchange's message.
        exchange.getIn().setBody(request);
	}

	protected Structure buildRequest(Exchange exchange, E1PISHO e1) throws Exception {

		// Create a request message from the endpoint to the GetList method of the FlightCustomer BAPI
		SapSynchronousRfcDestinationEndpoint endpoint = exchange.getContext().getEndpoint("sap-srfc-destination:pocDest:BAPI_FLCUST_GETLIST", SapSynchronousRfcDestinationEndpoint.class);
		Structure request = endpoint.createRequest();
				
		// Add query parameters to the request to retrieve upto 10 Customer records including Web Users.
		request.put("CUSTOMER_NAME", "*");
		request.put("MAX_ROWS", 10);
		request.put("WEB_USER", "*");
		
		return request;
	}

}
