
package com.redhat.poc.maximo.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "tax2",
    "tax1",
    "chargestore",
    "tax4",
    "orderunit",
    "tax3",
    "linecost",
    "tax5",
    "_rowstamp",
    "orgid",
    "pocost_collectionref",
    "description",
    "itemnum",
    "glcreditacct",
    "inspectionrequired",
    "tositeid",
    "href",
    "linetype",
    "polinenum",
    "receivedtotalcost",
    "consignment",
    "receivedunitcost",
    "catalogcode",
    "tax1code",
    "receivedqty",
    "pocost",
    "category",
    "mktplcitem",
    "manufacturer",
    "orderqty",
    "rejectedqty",
    "restype_description",
    "conversion",
    "taxexempt",
    "gldebitacct",
    "issue",
    "modelnum",
    "itemsetid",
    "enterby",
    "isdistributed",
    "polineid",
    "enteredastask",
    "unitcost",
    "localref",
    "category_description",
    "taxed",
    "prorateservice",
    "receiptreqd",
    "enterdate",
    "storeloc",
    "loadedcost",
    "receiptscomplete",
    "restype"
})
public class Poline {

    @JsonProperty("tax2")
    private Double tax2;
    @JsonProperty("tax1")
    private Double tax1;
    @JsonProperty("chargestore")
    private Boolean chargestore;
    @JsonProperty("tax4")
    private Double tax4;
    @JsonProperty("orderunit")
    private String orderunit;
    @JsonProperty("tax3")
    private Double tax3;
    @JsonProperty("linecost")
    private Double linecost;
    @JsonProperty("tax5")
    private Double tax5;
    @JsonProperty("_rowstamp")
    private String rowstamp;
    @JsonProperty("orgid")
    private String orgid;
    @JsonProperty("pocost_collectionref")
    private String pocostCollectionref;
    @JsonProperty("description")
    private String description;
    @JsonProperty("itemnum")
    private String itemnum;
    @JsonProperty("glcreditacct")
    private String glcreditacct;
    @JsonProperty("inspectionrequired")
    private Boolean inspectionrequired;
    @JsonProperty("tositeid")
    private String tositeid;
    @JsonProperty("href")
    private String href;
    @JsonProperty("linetype")
    private String linetype;
    @JsonProperty("polinenum")
    private Integer polinenum;
    @JsonProperty("receivedtotalcost")
    private Double receivedtotalcost;
    @JsonProperty("consignment")
    private Boolean consignment;
    @JsonProperty("receivedunitcost")
    private Double receivedunitcost;
    @JsonProperty("catalogcode")
    private String catalogcode;
    @JsonProperty("tax1code")
    private String tax1code;
    @JsonProperty("receivedqty")
    private Double receivedqty;
    @JsonProperty("pocost")
    private List<Pocost> pocost = null;
    @JsonProperty("category")
    private String category;
    @JsonProperty("mktplcitem")
    private Boolean mktplcitem;
    @JsonProperty("manufacturer")
    private String manufacturer;
    @JsonProperty("orderqty")
    private Double orderqty;
    @JsonProperty("rejectedqty")
    private Double rejectedqty;
    @JsonProperty("restype_description")
    private Object restypeDescription;
    @JsonProperty("conversion")
    private Double conversion;
    @JsonProperty("taxexempt")
    private Boolean taxexempt;
    @JsonProperty("gldebitacct")
    private String gldebitacct;
    @JsonProperty("issue")
    private Boolean issue;
    @JsonProperty("modelnum")
    private String modelnum;
    @JsonProperty("itemsetid")
    private String itemsetid;
    @JsonProperty("enterby")
    private String enterby;
    @JsonProperty("isdistributed")
    private Boolean isdistributed;
    @JsonProperty("polineid")
    private Integer polineid;
    @JsonProperty("enteredastask")
    private Boolean enteredastask;
    @JsonProperty("unitcost")
    private Double unitcost;
    @JsonProperty("localref")
    private String localref;
    @JsonProperty("category_description")
    private String categoryDescription;
    @JsonProperty("taxed")
    private Boolean taxed;
    @JsonProperty("prorateservice")
    private Boolean prorateservice;
    @JsonProperty("receiptreqd")
    private Boolean receiptreqd;
    @JsonProperty("enterdate")
    private String enterdate;
    @JsonProperty("storeloc")
    private String storeloc;
    @JsonProperty("loadedcost")
    private Double loadedcost;
    @JsonProperty("receiptscomplete")
    private Boolean receiptscomplete;
    @JsonProperty("restype")
    private String restype;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("tax2")
    public Double getTax2() {
        return tax2;
    }

    @JsonProperty("tax2")
    public void setTax2(Double tax2) {
        this.tax2 = tax2;
    }

    @JsonProperty("tax1")
    public Double getTax1() {
        return tax1;
    }

    @JsonProperty("tax1")
    public void setTax1(Double tax1) {
        this.tax1 = tax1;
    }

    @JsonProperty("chargestore")
    public Boolean getChargestore() {
        return chargestore;
    }

    @JsonProperty("chargestore")
    public void setChargestore(Boolean chargestore) {
        this.chargestore = chargestore;
    }

    @JsonProperty("tax4")
    public Double getTax4() {
        return tax4;
    }

    @JsonProperty("tax4")
    public void setTax4(Double tax4) {
        this.tax4 = tax4;
    }

    @JsonProperty("orderunit")
    public String getOrderunit() {
        return orderunit;
    }

    @JsonProperty("orderunit")
    public void setOrderunit(String orderunit) {
        this.orderunit = orderunit;
    }

    @JsonProperty("tax3")
    public Double getTax3() {
        return tax3;
    }

    @JsonProperty("tax3")
    public void setTax3(Double tax3) {
        this.tax3 = tax3;
    }

    @JsonProperty("linecost")
    public Double getLinecost() {
        return linecost;
    }

    @JsonProperty("linecost")
    public void setLinecost(Double linecost) {
        this.linecost = linecost;
    }

    @JsonProperty("tax5")
    public Double getTax5() {
        return tax5;
    }

    @JsonProperty("tax5")
    public void setTax5(Double tax5) {
        this.tax5 = tax5;
    }

    @JsonProperty("_rowstamp")
    public String getRowstamp() {
        return rowstamp;
    }

    @JsonProperty("_rowstamp")
    public void setRowstamp(String rowstamp) {
        this.rowstamp = rowstamp;
    }

    @JsonProperty("orgid")
    public String getOrgid() {
        return orgid;
    }

    @JsonProperty("orgid")
    public void setOrgid(String orgid) {
        this.orgid = orgid;
    }

    @JsonProperty("pocost_collectionref")
    public String getPocostCollectionref() {
        return pocostCollectionref;
    }

    @JsonProperty("pocost_collectionref")
    public void setPocostCollectionref(String pocostCollectionref) {
        this.pocostCollectionref = pocostCollectionref;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("itemnum")
    public String getItemnum() {
        return itemnum;
    }

    @JsonProperty("itemnum")
    public void setItemnum(String itemnum) {
        this.itemnum = itemnum;
    }

    @JsonProperty("glcreditacct")
    public String getGlcreditacct() {
        return glcreditacct;
    }

    @JsonProperty("glcreditacct")
    public void setGlcreditacct(String glcreditacct) {
        this.glcreditacct = glcreditacct;
    }

    @JsonProperty("inspectionrequired")
    public Boolean getInspectionrequired() {
        return inspectionrequired;
    }

    @JsonProperty("inspectionrequired")
    public void setInspectionrequired(Boolean inspectionrequired) {
        this.inspectionrequired = inspectionrequired;
    }

    @JsonProperty("tositeid")
    public String getTositeid() {
        return tositeid;
    }

    @JsonProperty("tositeid")
    public void setTositeid(String tositeid) {
        this.tositeid = tositeid;
    }

    @JsonProperty("href")
    public String getHref() {
        return href;
    }

    @JsonProperty("href")
    public void setHref(String href) {
        this.href = href;
    }

    @JsonProperty("linetype")
    public String getLinetype() {
        return linetype;
    }

    @JsonProperty("linetype")
    public void setLinetype(String linetype) {
        this.linetype = linetype;
    }

    @JsonProperty("polinenum")
    public Integer getPolinenum() {
        return polinenum;
    }

    @JsonProperty("polinenum")
    public void setPolinenum(Integer polinenum) {
        this.polinenum = polinenum;
    }

    @JsonProperty("receivedtotalcost")
    public Double getReceivedtotalcost() {
        return receivedtotalcost;
    }

    @JsonProperty("receivedtotalcost")
    public void setReceivedtotalcost(Double receivedtotalcost) {
        this.receivedtotalcost = receivedtotalcost;
    }

    @JsonProperty("consignment")
    public Boolean getConsignment() {
        return consignment;
    }

    @JsonProperty("consignment")
    public void setConsignment(Boolean consignment) {
        this.consignment = consignment;
    }

    @JsonProperty("receivedunitcost")
    public Double getReceivedunitcost() {
        return receivedunitcost;
    }

    @JsonProperty("receivedunitcost")
    public void setReceivedunitcost(Double receivedunitcost) {
        this.receivedunitcost = receivedunitcost;
    }

    @JsonProperty("catalogcode")
    public String getCatalogcode() {
        return catalogcode;
    }

    @JsonProperty("catalogcode")
    public void setCatalogcode(String catalogcode) {
        this.catalogcode = catalogcode;
    }

    @JsonProperty("tax1code")
    public String getTax1code() {
        return tax1code;
    }

    @JsonProperty("tax1code")
    public void setTax1code(String tax1code) {
        this.tax1code = tax1code;
    }

    @JsonProperty("receivedqty")
    public Double getReceivedqty() {
        return receivedqty;
    }

    @JsonProperty("receivedqty")
    public void setReceivedqty(Double receivedqty) {
        this.receivedqty = receivedqty;
    }

    @JsonProperty("pocost")
    public List<Pocost> getPocost() {
        return pocost;
    }

    @JsonProperty("pocost")
    public void setPocost(List<Pocost> pocost) {
        this.pocost = pocost;
    }

    @JsonProperty("category")
    public String getCategory() {
        return category;
    }

    @JsonProperty("category")
    public void setCategory(String category) {
        this.category = category;
    }

    @JsonProperty("mktplcitem")
    public Boolean getMktplcitem() {
        return mktplcitem;
    }

    @JsonProperty("mktplcitem")
    public void setMktplcitem(Boolean mktplcitem) {
        this.mktplcitem = mktplcitem;
    }

    @JsonProperty("manufacturer")
    public String getManufacturer() {
        return manufacturer;
    }

    @JsonProperty("manufacturer")
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @JsonProperty("orderqty")
    public Double getOrderqty() {
        return orderqty;
    }

    @JsonProperty("orderqty")
    public void setOrderqty(Double orderqty) {
        this.orderqty = orderqty;
    }

    @JsonProperty("rejectedqty")
    public Double getRejectedqty() {
        return rejectedqty;
    }

    @JsonProperty("rejectedqty")
    public void setRejectedqty(Double rejectedqty) {
        this.rejectedqty = rejectedqty;
    }

    @JsonProperty("restype_description")
    public Object getRestypeDescription() {
        return restypeDescription;
    }

    @JsonProperty("restype_description")
    public void setRestypeDescription(Object restypeDescription) {
        this.restypeDescription = restypeDescription;
    }

    @JsonProperty("conversion")
    public Double getConversion() {
        return conversion;
    }

    @JsonProperty("conversion")
    public void setConversion(Double conversion) {
        this.conversion = conversion;
    }

    @JsonProperty("taxexempt")
    public Boolean getTaxexempt() {
        return taxexempt;
    }

    @JsonProperty("taxexempt")
    public void setTaxexempt(Boolean taxexempt) {
        this.taxexempt = taxexempt;
    }

    @JsonProperty("gldebitacct")
    public String getGldebitacct() {
        return gldebitacct;
    }

    @JsonProperty("gldebitacct")
    public void setGldebitacct(String gldebitacct) {
        this.gldebitacct = gldebitacct;
    }

    @JsonProperty("issue")
    public Boolean getIssue() {
        return issue;
    }

    @JsonProperty("issue")
    public void setIssue(Boolean issue) {
        this.issue = issue;
    }

    @JsonProperty("modelnum")
    public String getModelnum() {
        return modelnum;
    }

    @JsonProperty("modelnum")
    public void setModelnum(String modelnum) {
        this.modelnum = modelnum;
    }

    @JsonProperty("itemsetid")
    public String getItemsetid() {
        return itemsetid;
    }

    @JsonProperty("itemsetid")
    public void setItemsetid(String itemsetid) {
        this.itemsetid = itemsetid;
    }

    @JsonProperty("enterby")
    public String getEnterby() {
        return enterby;
    }

    @JsonProperty("enterby")
    public void setEnterby(String enterby) {
        this.enterby = enterby;
    }

    @JsonProperty("isdistributed")
    public Boolean getIsdistributed() {
        return isdistributed;
    }

    @JsonProperty("isdistributed")
    public void setIsdistributed(Boolean isdistributed) {
        this.isdistributed = isdistributed;
    }

    @JsonProperty("polineid")
    public Integer getPolineid() {
        return polineid;
    }

    @JsonProperty("polineid")
    public void setPolineid(Integer polineid) {
        this.polineid = polineid;
    }

    @JsonProperty("enteredastask")
    public Boolean getEnteredastask() {
        return enteredastask;
    }

    @JsonProperty("enteredastask")
    public void setEnteredastask(Boolean enteredastask) {
        this.enteredastask = enteredastask;
    }

    @JsonProperty("unitcost")
    public Double getUnitcost() {
        return unitcost;
    }

    @JsonProperty("unitcost")
    public void setUnitcost(Double unitcost) {
        this.unitcost = unitcost;
    }

    @JsonProperty("localref")
    public String getLocalref() {
        return localref;
    }

    @JsonProperty("localref")
    public void setLocalref(String localref) {
        this.localref = localref;
    }

    @JsonProperty("category_description")
    public String getCategoryDescription() {
        return categoryDescription;
    }

    @JsonProperty("category_description")
    public void setCategoryDescription(String categoryDescription) {
        this.categoryDescription = categoryDescription;
    }

    @JsonProperty("taxed")
    public Boolean getTaxed() {
        return taxed;
    }

    @JsonProperty("taxed")
    public void setTaxed(Boolean taxed) {
        this.taxed = taxed;
    }

    @JsonProperty("prorateservice")
    public Boolean getProrateservice() {
        return prorateservice;
    }

    @JsonProperty("prorateservice")
    public void setProrateservice(Boolean prorateservice) {
        this.prorateservice = prorateservice;
    }

    @JsonProperty("receiptreqd")
    public Boolean getReceiptreqd() {
        return receiptreqd;
    }

    @JsonProperty("receiptreqd")
    public void setReceiptreqd(Boolean receiptreqd) {
        this.receiptreqd = receiptreqd;
    }

    @JsonProperty("enterdate")
    public String getEnterdate() {
        return enterdate;
    }

    @JsonProperty("enterdate")
    public void setEnterdate(String enterdate) {
        this.enterdate = enterdate;
    }

    @JsonProperty("storeloc")
    public String getStoreloc() {
        return storeloc;
    }

    @JsonProperty("storeloc")
    public void setStoreloc(String storeloc) {
        this.storeloc = storeloc;
    }

    @JsonProperty("loadedcost")
    public Double getLoadedcost() {
        return loadedcost;
    }

    @JsonProperty("loadedcost")
    public void setLoadedcost(Double loadedcost) {
        this.loadedcost = loadedcost;
    }

    @JsonProperty("receiptscomplete")
    public Boolean getReceiptscomplete() {
        return receiptscomplete;
    }

    @JsonProperty("receiptscomplete")
    public void setReceiptscomplete(Boolean receiptscomplete) {
        this.receiptscomplete = receiptscomplete;
    }

    @JsonProperty("restype")
    public String getRestype() {
        return restype;
    }

    @JsonProperty("restype")
    public void setRestype(String restype) {
        this.restype = restype;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
