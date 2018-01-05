package com.redhat.poc.model;

import java.util.ArrayList;
import java.util.List;

public class Factory {
		
	public static Mxpo mxpo() {
		
		Mxpo m = new Mxpo();
		
		m.setChangedate("1997-04-14T19:58:00-04:00");
		m.setExchangedate("1997-04-14T00:00:00-04:00");
		m.setPo10(false);
		m.setRevisionnum(0);
		m.setStatusDescription("Approved");
		m.setHistoryflag(false);
		m.setReceiptsDescription("All Parts Received");
		m.setExchangerate(1.0);
		m.setTotaltax5(0.0);
		m.setTotaltax4(0.0);
		m.setTotaltax3(0.0);
		m.setTotaltax2(0.0);
		m.setTotaltax1(60.2);
		m.setRowstamp("[0 0 0 0 0 3 -61 -107]");
		m.setOrgid("EAGLENA");
		m.setDescription("Store Replenishment");
		m.setPriority(0);
		m.setShipvia("UPS-GR");
		m.setInspectionrequired(false);
		m.setSiteid("BEDFORD");
		m.setHref("http:\\/\\/USO12DMXANY01.use.ucdp.net:9080\\/maximo\\/oslc\\/os\\/mxpo\\/_MTAwMC8wL0JFREZPUkQ-");
		m.setPotermCollectionref("http:\\/\\/USO12DMXANY01.use.ucdp.net:9080\\/maximo\\/oslc\\/os\\/mxpo\\/_MTAwMC8wL0JFREZPUkQ-\\/poterm");
		m.setPayonreceipt(false);
		m.setPotype("STD");
		m.setStatus("APPR");
		m.setStatusdate("1997-04-14T19:58:00-04:00");
		m.setCustomernum("SC2343");
		m.setPaymentterms("NET 30");
		m.setStatusiface(false);
		m.setInclusive5(false);
		m.setInclusive4(false);
		m.setInclusive3(false);
		m.setInclusive2(false);
		m.setInclusive1(true);
		m.setAllowreceipt(true);
		m.setTotalcost(1264.2);
		
		List<Poline> poline = new ArrayList<>();
		poline.add(polin0());
		poline.add(polin1());
		poline.add(polin2());
		
		m.setPoline(poline);
		
		m.setBuyahead(false);
		m.setContact("BRIAN ARENA");
		m.setIgnorecntrev(false);
		m.setPolineCollectionref("http:\\/\\/USO12DMXANY01.use.ucdp.net:9080\\/maximo\\/oslc\\/os\\/mxpo\\/_MTAwMC8wL0JFREZPUkQ-\\/poline");
		m.setInternal(false);
		m.setCurrencycode("USD");
		m.setOrderdate("1997-12-08T17:27:00-05:00");
		m.setChangeby("LIBERI");
		m.setVendor("ATI");
		m.setReceipts("COMPLETE");
		m.setShipviaDescription("UPS Ground Delivery");
		m.setFob("SOMERVILLE, MA");
		m.setPonum("1000");
		m.setPoid(14);
		m.setInternalchange(false);
		m.setPurchaseagent("NANKIN");
		
		return m;
	}
	

	private static Poline polin2() {
		
		Poline p = new Poline();
		p.setTax1(14.9);
		p.setTax2(0.0);
		p.setTax3(0.0);
		p.setTax4(0.0);
		p.setTax5(0.0);
		p.setChargestore(false);
		p.setOrderunit("ROLL");
		p.setLinecost(298.0);
		p.setRowstamp("[0 0 0 0 0 3 -60 -73]");
		p.setOrgid("EAGLENA");
		p.setPocostCollectionref("http:\\/\\/USO12DMXANY01.use.ucdp.net:9080\\/maximo\\/oslc\\/os\\/mxpo\\/_MTAwMC8wL0JFREZPUkQ-\\/poline\\/2-10003\\/pocost");
		p.setDescription("Tubing, Copper- 1-1\\/16 In ID X .030 In Wall");
		p.setItemnum("0-0048");
		p.setGlcreditacct("6800-930-600");
		p.setInspectionrequired(false);
		p.setTositeid("BEDFORD");
		p.setHref("http:\\/\\/childkey#UE8vUE9MSU5FLzMvMTAwMC8wL0JFREZPUkQ-");
		p.setLinetype("ITEM");
		p.setPolinenum(3);
		p.setReceivedtotalcost(298.0);
		p.setConsignment(false);
		p.setReceivedunitcost(12.0);
		p.setCatalogcode("RH-445R");
		p.setTax1code("MA");
		p.setReceivedqty(1.0);
		
		List<Pocost> pocost = new ArrayList<>();
		Pocost e = new Pocost();
		e.setRowstamp("[0 0 0 0 0 3 -60 13]");
		e.setPocostid(10004);
		e.setOrgid("EAGLENA");
		e.setGldebitacct("6600-800-800");
		e.setPercentage(100.0);
		e.setLoadedcost(298.0);
		e.setLocalref("http:\\/\\/USO12DMXANY01.use.ucdp.net:9080\\/maximo\\/oslc\\/os\\/mxpo\\/_MTAwMC8wL0JFREZPUkQ-\\/poline\\/2-10003\\/pocost\\/0-10004");
		e.setPolineid(10003);
		e.setCostlinenum(1);
		e.setHref("http:\\/\\/childkey#UE8vUE9MSU5FL1BPQ09TVC8x");
		e.setLinecost(298.0);
		pocost.add(e);
		
		p.setPocost(pocost);
		p.setCategory("STK");
		p.setMktplcitem(false);
		p.setManufacturer("P-H");
		p.setOrderqty(1.0);
		p.setRejectedqty(0.0);
		p.setRestypeDescription(null);
		p.setConversion(1.0);
		p.setTaxexempt(false);
		p.setGldebitacct("6600-800-800");
		p.setIssue(false);
//		p.setModelnum("1A-030");
		p.setItemsetid("SET1");
		p.setEnterby("LIBERI");
		p.setIsdistributed(false);
		p.setPolineid(10003);
		p.setEnteredastask(false);
		p.setUnitcost(12.0);
		p.setLocalref("http:\\/\\/USO12DMXANY01.use.ucdp.net:9080\\/maximo\\/oslc\\/os\\/mxpo\\/_MTAwMC8wL0JFREZPUkQ-\\/poline\\/2-10003");
		p.setCategoryDescription("Stocked Item");
		p.setTaxed(false);
		p.setProrateservice(false);
		p.setReceiptreqd(true);
		p.setEnterdate("1997-12-08T17:27:00-05:00");
		p.setStoreloc("CENTRAL");
		p.setLoadedcost(12.0);
		p.setReceiptscomplete(true);
		p.setRestype("AUTOMATIC");
		return p;
	}


	private static Poline polin1() {

		Poline p = new Poline();
		p.setTax1(0.6);
		p.setTax2(0.0);
		p.setTax3(0.0);
		p.setTax4(0.0);
		p.setTax5(0.0);
		p.setChargestore(false);
		p.setOrderunit("BOX");
		p.setLinecost(12.0);
		p.setRowstamp("[0 0 0 0 0 3 -60 -53]");
		p.setOrgid("EAGLENA");
		p.setPocostCollectionref("http:\\/\\/USO12DMXANY01.use.ucdp.net:9080\\/maximo\\/oslc\\/os\\/mxpo\\/_MTAwMC8wL0JFREZPUkQ-\\/poline\\/1-10002\\/pocost");
		p.setDescription("Washer, 1\\/2 In");
		p.setItemnum("4-2100");
		p.setGlcreditacct("6800-930-600");
		p.setInspectionrequired(false);
		p.setTositeid("BEDFORD");
		p.setHref("http:\\/\\/childkey#UE8vUE9MSU5FLzIvMTAwMC8wL0JFREZPUkQ-");
		p.setLinetype("ITEM");
		p.setPolinenum(2);
		p.setReceivedtotalcost(12.0);
		p.setConsignment(false);
		p.setReceivedunitcost(298.0);
		p.setCatalogcode("RH-445R");
		p.setTax1code("MA");
		p.setReceivedqty(1.0);
		
		List<Pocost> pocost = new ArrayList<>();
		Pocost e = new Pocost();
		e.setRowstamp("[0 0 0 0 0 3 -60 12]");
		e.setPocostid(10003);
		e.setOrgid("EAGLENA");
		e.setGldebitacct("6600-800-800");
		e.setPercentage(100.0);
		e.setLoadedcost(12.0);
		e.setLocalref("http:\\/\\/USO12DMXANY01.use.ucdp.net:9080\\/maximo\\/oslc\\/os\\/mxpo\\/_MTAwMC8wL0JFREZPUkQ-\\/poline\\/1-10002\\/pocost\\/0-10003");
		e.setPolineid(10002);
		e.setCostlinenum(1);
		e.setHref("http:\\/\\/childkey#UE8vUE9MSU5FL1BPQ09TVC8x");
		e.setLinecost(12.0);
		pocost.add(e);
		
		p.setPocost(pocost);
		p.setCategory("STK");
		p.setMktplcitem(false);
		p.setManufacturer("P-H");
		p.setOrderqty(1.0);
		p.setRejectedqty(0.0);
		p.setRestypeDescription(null);
		p.setConversion(1.0);
		p.setTaxexempt(false);
		p.setGldebitacct("6600-800-800");
		p.setIssue(false);
//		p.setModelnum("1A-030");
		p.setItemsetid("SET1");
		p.setEnterby("LIBERI");
		p.setIsdistributed(false);
		p.setPolineid(10002);
		p.setEnteredastask(false);
		p.setUnitcost(298.0);
		p.setLocalref("http:\\/\\/USO12DMXANY01.use.ucdp.net:9080\\/maximo\\/oslc\\/os\\/mxpo\\/_MTAwMC8wL0JFREZPUkQ-\\/poline\\/1-10002");
		p.setCategoryDescription("Stocked Item");
		p.setTaxed(false);
		p.setProrateservice(false);
		p.setReceiptreqd(true);
		p.setEnterdate("1997-12-08T17:27:00-05:00");
		p.setStoreloc("CENTRAL");
		p.setLoadedcost(298.0);
		p.setReceiptscomplete(true);
		p.setRestype("AUTOMATIC");
		return p;
	}


	private static Poline polin0() {

		Poline p = new Poline();
		p.setTax1(44.7);
		p.setTax2(0.0);
		p.setTax3(0.0);
		p.setTax4(0.0);
		p.setTax5(0.0);
		p.setChargestore(false);
		p.setOrderunit("ROLL");
		p.setLinecost(894.0);
		p.setRowstamp("[0 0 0 0 0 3 -60 101]");
		p.setOrgid("EAGLENA");
		p.setPocostCollectionref("http:\\/\\/USO12DMXANY01.use.ucdp.net:9080\\/maximo\\/oslc\\/os\\/mxpo\\/_MTAwMC8wL0JFREZPUkQ-\\/poline\\/0-10001\\/pocost");
		p.setDescription("Tubing, Copper-1 In ID X .030 In Wall");
		p.setItemnum("560-00");
		p.setGlcreditacct("6800-930-600");
		p.setInspectionrequired(false);
		p.setTositeid("BEDFORD");
		p.setHref("http:\\/\\/childkey#UE8vUE9MSU5FLzEvMTAwMC8wL0JFREZPUkQ-");
		p.setLinetype("ITEM");
		p.setPolinenum(1);
		p.setReceivedtotalcost(894.0);
		p.setConsignment(false);
		p.setReceivedunitcost(298.0);
		p.setCatalogcode("RH-445R");
		p.setTax1code("MA");
		p.setReceivedqty(3.0);
		
		List<Pocost> pocost = new ArrayList<>();
		Pocost e = new Pocost();
		e.setRowstamp("[0 0 0 0 0 3 -60 11]");
		e.setPocostid(10002);
		e.setOrgid("EAGLENA");
		e.setGldebitacct("6600-800-800");
		e.setPercentage(100.0);
		e.setLoadedcost(894.0);
		e.setLocalref("http:\\/\\/USO12DMXANY01.use.ucdp.net:9080\\/maximo\\/oslc\\/os\\/mxpo\\/_MTAwMC8wL0JFREZPUkQ-\\/poline\\/0-10001\\/pocost\\/0-10002");
		e.setPolineid(10001);
		e.setCostlinenum(1);
		e.setHref("http:\\/\\/childkey#UE8vUE9MSU5FL1BPQ09TVC8x");
		e.setLinecost(894.0);
		pocost.add(e);
		
		p.setPocost(pocost);
		p.setCategory("STK");
		p.setMktplcitem(false);
		p.setManufacturer("P-H");
		p.setOrderqty(3.0);
		p.setRejectedqty(0.0);
		p.setRestypeDescription(null);
		p.setConversion(1.0);
		p.setTaxexempt(false);
		p.setGldebitacct("6600-800-800");
		p.setIssue(false);
		p.setModelnum("1A-030");
		p.setItemsetid("SET1");
		p.setEnterby("LIBERI");
		p.setIsdistributed(false);
		p.setPolineid(10001);
		p.setEnteredastask(false);
		p.setUnitcost(298.0);
		p.setLocalref("http:\\/\\/USO12DMXANY01.use.ucdp.net:9080\\/maximo\\/oslc\\/os\\/mxpo\\/_MTAwMC8wL0JFREZPUkQ-\\/poline\\/0-10001");
		p.setCategoryDescription("Stocked Item");
		p.setTaxed(false);
		p.setProrateservice(false);
		p.setReceiptreqd(true);
		p.setEnterdate("1997-12-08T17:27:00-05:00");
		p.setStoreloc("CENTRAL");
		p.setLoadedcost(894.0);
		p.setReceiptscomplete(true);
		p.setRestype("AUTOMATIC");
		return p;
	}


	public static void main(String[] args) {

		System.out.println(Factory.mxpo());
	}

}
