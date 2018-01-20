package com.redhat.poc.processor;

import java.util.Date;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.fusesource.camel.component.sap.SapTransactionalIDocDestinationEndpoint;
import org.fusesource.camel.component.sap.model.idoc.Document;
import org.fusesource.camel.component.sap.model.idoc.IdocFactory;
import org.fusesource.camel.component.sap.model.idoc.Segment;
import org.fusesource.camel.component.sap.model.idoc.impl.DocumentImpl;
import org.fusesource.camel.component.sap.model.idoc.impl.SegmentImpl;

import com.redhat.poc.jaxb.EKSEKS01;
import com.redhat.poc.jaxb.EKSEKS01.IDOC.E1PISTY.E1PISHO;
import com.redhat.poc.jaxb.ObjectFactory;
import com.redhat.poc.model.Poline;

public class CreateE1PISTYIDOCProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {

		// do some bridge links
		Poline poline = (Poline) exchange.getIn().getBody();
		EKSEKS01.IDOC.E1PISTY.E1PISHO e1 = new ObjectFactory().createEKSEKS01IDOCE1PISTYE1PISHO();
		e1.setBEDAT(poline.getStoreloc());
		
		// real iDoc
//		DocumentImpl iDoc = buildIdoc(exchange, e1);
		
		// mock iDoc
		DocumentImpl iDoc = (DocumentImpl)IdocFactory.eINSTANCE.createDocument();
		Segment segment =  IdocFactory.eINSTANCE.createSegment();
		iDoc.setRootSegment(segment);
		((SegmentImpl) segment).setDocument(iDoc);
		iDoc.setCreationDate(new Date());
		iDoc.setCreationTime(new Date());
		
		iDoc.setMessageType("EKSEKS01");
		iDoc.setRecipientPartnerNumber("QUICKCLNT");
		iDoc.setRecipientPartnerType("LS");
		iDoc.setSenderPartnerNumber("QUICKSTART");
		iDoc.setSenderPartnerType("LS");
		
		exchange.getOut().setBody(iDoc);
	}

	protected Document buildIdoc(Exchange exchange, E1PISHO e) throws Exception {

		// Create document and initialize transmission parameters
        SapTransactionalIDocDestinationEndpoint endpoint = exchange.getContext().getEndpoint("sap-idoc-destination:pocDest:FLCUSTOMER_CREATEFROMDATA01", SapTransactionalIDocDestinationEndpoint.class);
        Document document = endpoint.createDocument();
        document.setMessageType("FLCUSTOMER_CREATEFROMDATA");
        document.setRecipientPartnerNumber("QUICKCLNT");
        document.setRecipientPartnerType("LS");
        document.setSenderPartnerNumber("QUICKSTART");
        document.setSenderPartnerType("LS");

        // Retrieve document segments.
        Segment rootSegment = document.getRootSegment();
        Segment headerSegment = rootSegment.getChildren("E1SCU_CRE").add();
        Segment newCustomerSegment = headerSegment.getChildren("E1BPSCUNEW").add();

        // Fill in New Customer Info
        newCustomerSegment.put("CUSTNAME", "Fred Flintstone");
        newCustomerSegment.put("FORM", "Mr.");
        newCustomerSegment.put("STREET", "123 Rubble Lane");
        newCustomerSegment.put("POSTCODE", "01234");
        newCustomerSegment.put("CITY", "Bedrock");
        newCustomerSegment.put("COUNTR", "US");
        newCustomerSegment.put("PHONE", "800-555-1212");
        newCustomerSegment.put("EMAIL", "fred@bedrock.com");
        newCustomerSegment.put("CUSTTYPE", "P");
        newCustomerSegment.put("DISCOUNT", "005");
        newCustomerSegment.put("LANGU", "E");
	
		return document;
	}

}
