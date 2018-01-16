
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
    "changedate",
    "exchangedate",
    "po10",
    "revisionnum",
    "status_description",
    "historyflag",
    "receipts_description",
    "exchangerate",
    "totaltax4",
    "totaltax3",
    "_rowstamp",
    "totaltax5",
    "orgid",
    "description",
    "priority",
    "totaltax2",
    "shipvia",
    "totaltax1",
    "inspectionrequired",
    "siteid",
    "href",
    "poterm_collectionref",
    "payonreceipt",
    "potype",
    "status",
    "statusdate",
    "customernum",
    "paymentterms",
    "statusiface",
    "inclusive5",
    "allowreceipt",
    "totalcost",
    "inclusive4",
    "inclusive1",
    "poline",
    "inclusive3",
    "inclusive2",
    "buyahead",
    "contact",
    "ignorecntrev",
    "poline_collectionref",
    "internal",
    "currencycode",
    "orderdate",
    "changeby",
    "vendor",
    "receipts",
    "shipvia_description",
    "fob",
    "ponum",
    "poid",
    "internalchange",
    "purchaseagent"
})
public class Mxpo {

    @JsonProperty("changedate")
    private String changedate;
    @JsonProperty("exchangedate")
    private String exchangedate;
    @JsonProperty("po10")
    private Boolean po10;
    @JsonProperty("revisionnum")
    private Integer revisionnum;
    @JsonProperty("status_description")
    private String statusDescription;
    @JsonProperty("historyflag")
    private Boolean historyflag;
    @JsonProperty("receipts_description")
    private String receiptsDescription;
    @JsonProperty("exchangerate")
    private Double exchangerate;
    @JsonProperty("totaltax4")
    private Double totaltax4;
    @JsonProperty("totaltax3")
    private Double totaltax3;
    @JsonProperty("_rowstamp")
    private String rowstamp;
    @JsonProperty("totaltax5")
    private Double totaltax5;
    @JsonProperty("orgid")
    private String orgid;
    @JsonProperty("description")
    private String description;
    @JsonProperty("priority")
    private Integer priority;
    @JsonProperty("totaltax2")
    private Double totaltax2;
    @JsonProperty("shipvia")
    private String shipvia;
    @JsonProperty("totaltax1")
    private Double totaltax1;
    @JsonProperty("inspectionrequired")
    private Boolean inspectionrequired;
    @JsonProperty("siteid")
    private String siteid;
    @JsonProperty("href")
    private String href;
    @JsonProperty("poterm_collectionref")
    private String potermCollectionref;
    @JsonProperty("payonreceipt")
    private Boolean payonreceipt;
    @JsonProperty("potype")
    private String potype;
    @JsonProperty("status")
    private String status;
    @JsonProperty("statusdate")
    private String statusdate;
    @JsonProperty("customernum")
    private String customernum;
    @JsonProperty("paymentterms")
    private String paymentterms;
    @JsonProperty("statusiface")
    private Boolean statusiface;
    @JsonProperty("inclusive5")
    private Boolean inclusive5;
    @JsonProperty("allowreceipt")
    private Boolean allowreceipt;
    @JsonProperty("totalcost")
    private Double totalcost;
    @JsonProperty("inclusive4")
    private Boolean inclusive4;
    @JsonProperty("inclusive1")
    private Boolean inclusive1;
    @JsonProperty("poline")
    private List<Poline> poline = null;
    @JsonProperty("inclusive3")
    private Boolean inclusive3;
    @JsonProperty("inclusive2")
    private Boolean inclusive2;
    @JsonProperty("buyahead")
    private Boolean buyahead;
    @JsonProperty("contact")
    private String contact;
    @JsonProperty("ignorecntrev")
    private Boolean ignorecntrev;
    @JsonProperty("poline_collectionref")
    private String polineCollectionref;
    @JsonProperty("internal")
    private Boolean internal;
    @JsonProperty("currencycode")
    private String currencycode;
    @JsonProperty("orderdate")
    private String orderdate;
    @JsonProperty("changeby")
    private String changeby;
    @JsonProperty("vendor")
    private String vendor;
    @JsonProperty("receipts")
    private String receipts;
    @JsonProperty("shipvia_description")
    private String shipviaDescription;
    @JsonProperty("fob")
    private String fob;
    @JsonProperty("ponum")
    private String ponum;
    @JsonProperty("poid")
    private Integer poid;
    @JsonProperty("internalchange")
    private Boolean internalchange;
    @JsonProperty("purchaseagent")
    private String purchaseagent;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("changedate")
    public String getChangedate() {
        return changedate;
    }

    @JsonProperty("changedate")
    public void setChangedate(String changedate) {
        this.changedate = changedate;
    }

    @JsonProperty("exchangedate")
    public String getExchangedate() {
        return exchangedate;
    }

    @JsonProperty("exchangedate")
    public void setExchangedate(String exchangedate) {
        this.exchangedate = exchangedate;
    }

    @JsonProperty("po10")
    public Boolean getPo10() {
        return po10;
    }

    @JsonProperty("po10")
    public void setPo10(Boolean po10) {
        this.po10 = po10;
    }

    @JsonProperty("revisionnum")
    public Integer getRevisionnum() {
        return revisionnum;
    }

    @JsonProperty("revisionnum")
    public void setRevisionnum(Integer revisionnum) {
        this.revisionnum = revisionnum;
    }

    @JsonProperty("status_description")
    public String getStatusDescription() {
        return statusDescription;
    }

    @JsonProperty("status_description")
    public void setStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
    }

    @JsonProperty("historyflag")
    public Boolean getHistoryflag() {
        return historyflag;
    }

    @JsonProperty("historyflag")
    public void setHistoryflag(Boolean historyflag) {
        this.historyflag = historyflag;
    }

    @JsonProperty("receipts_description")
    public String getReceiptsDescription() {
        return receiptsDescription;
    }

    @JsonProperty("receipts_description")
    public void setReceiptsDescription(String receiptsDescription) {
        this.receiptsDescription = receiptsDescription;
    }

    @JsonProperty("exchangerate")
    public Double getExchangerate() {
        return exchangerate;
    }

    @JsonProperty("exchangerate")
    public void setExchangerate(Double exchangerate) {
        this.exchangerate = exchangerate;
    }

    @JsonProperty("totaltax4")
    public Double getTotaltax4() {
        return totaltax4;
    }

    @JsonProperty("totaltax4")
    public void setTotaltax4(Double totaltax4) {
        this.totaltax4 = totaltax4;
    }

    @JsonProperty("totaltax3")
    public Double getTotaltax3() {
        return totaltax3;
    }

    @JsonProperty("totaltax3")
    public void setTotaltax3(Double totaltax3) {
        this.totaltax3 = totaltax3;
    }

    @JsonProperty("_rowstamp")
    public String getRowstamp() {
        return rowstamp;
    }

    @JsonProperty("_rowstamp")
    public void setRowstamp(String rowstamp) {
        this.rowstamp = rowstamp;
    }

    @JsonProperty("totaltax5")
    public Double getTotaltax5() {
        return totaltax5;
    }

    @JsonProperty("totaltax5")
    public void setTotaltax5(Double totaltax5) {
        this.totaltax5 = totaltax5;
    }

    @JsonProperty("orgid")
    public String getOrgid() {
        return orgid;
    }

    @JsonProperty("orgid")
    public void setOrgid(String orgid) {
        this.orgid = orgid;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("priority")
    public Integer getPriority() {
        return priority;
    }

    @JsonProperty("priority")
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    @JsonProperty("totaltax2")
    public Double getTotaltax2() {
        return totaltax2;
    }

    @JsonProperty("totaltax2")
    public void setTotaltax2(Double totaltax2) {
        this.totaltax2 = totaltax2;
    }

    @JsonProperty("shipvia")
    public String getShipvia() {
        return shipvia;
    }

    @JsonProperty("shipvia")
    public void setShipvia(String shipvia) {
        this.shipvia = shipvia;
    }

    @JsonProperty("totaltax1")
    public Double getTotaltax1() {
        return totaltax1;
    }

    @JsonProperty("totaltax1")
    public void setTotaltax1(Double totaltax1) {
        this.totaltax1 = totaltax1;
    }

    @JsonProperty("inspectionrequired")
    public Boolean getInspectionrequired() {
        return inspectionrequired;
    }

    @JsonProperty("inspectionrequired")
    public void setInspectionrequired(Boolean inspectionrequired) {
        this.inspectionrequired = inspectionrequired;
    }

    @JsonProperty("siteid")
    public String getSiteid() {
        return siteid;
    }

    @JsonProperty("siteid")
    public void setSiteid(String siteid) {
        this.siteid = siteid;
    }

    @JsonProperty("href")
    public String getHref() {
        return href;
    }

    @JsonProperty("href")
    public void setHref(String href) {
        this.href = href;
    }

    @JsonProperty("poterm_collectionref")
    public String getPotermCollectionref() {
        return potermCollectionref;
    }

    @JsonProperty("poterm_collectionref")
    public void setPotermCollectionref(String potermCollectionref) {
        this.potermCollectionref = potermCollectionref;
    }

    @JsonProperty("payonreceipt")
    public Boolean getPayonreceipt() {
        return payonreceipt;
    }

    @JsonProperty("payonreceipt")
    public void setPayonreceipt(Boolean payonreceipt) {
        this.payonreceipt = payonreceipt;
    }

    @JsonProperty("potype")
    public String getPotype() {
        return potype;
    }

    @JsonProperty("potype")
    public void setPotype(String potype) {
        this.potype = potype;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("statusdate")
    public String getStatusdate() {
        return statusdate;
    }

    @JsonProperty("statusdate")
    public void setStatusdate(String statusdate) {
        this.statusdate = statusdate;
    }

    @JsonProperty("customernum")
    public String getCustomernum() {
        return customernum;
    }

    @JsonProperty("customernum")
    public void setCustomernum(String customernum) {
        this.customernum = customernum;
    }

    @JsonProperty("paymentterms")
    public String getPaymentterms() {
        return paymentterms;
    }

    @JsonProperty("paymentterms")
    public void setPaymentterms(String paymentterms) {
        this.paymentterms = paymentterms;
    }

    @JsonProperty("statusiface")
    public Boolean getStatusiface() {
        return statusiface;
    }

    @JsonProperty("statusiface")
    public void setStatusiface(Boolean statusiface) {
        this.statusiface = statusiface;
    }

    @JsonProperty("inclusive5")
    public Boolean getInclusive5() {
        return inclusive5;
    }

    @JsonProperty("inclusive5")
    public void setInclusive5(Boolean inclusive5) {
        this.inclusive5 = inclusive5;
    }

    @JsonProperty("allowreceipt")
    public Boolean getAllowreceipt() {
        return allowreceipt;
    }

    @JsonProperty("allowreceipt")
    public void setAllowreceipt(Boolean allowreceipt) {
        this.allowreceipt = allowreceipt;
    }

    @JsonProperty("totalcost")
    public Double getTotalcost() {
        return totalcost;
    }

    @JsonProperty("totalcost")
    public void setTotalcost(Double totalcost) {
        this.totalcost = totalcost;
    }

    @JsonProperty("inclusive4")
    public Boolean getInclusive4() {
        return inclusive4;
    }

    @JsonProperty("inclusive4")
    public void setInclusive4(Boolean inclusive4) {
        this.inclusive4 = inclusive4;
    }

    @JsonProperty("inclusive1")
    public Boolean getInclusive1() {
        return inclusive1;
    }

    @JsonProperty("inclusive1")
    public void setInclusive1(Boolean inclusive1) {
        this.inclusive1 = inclusive1;
    }

    @JsonProperty("poline")
    public List<Poline> getPoline() {
        return poline;
    }

    @JsonProperty("poline")
    public void setPoline(List<Poline> poline) {
        this.poline = poline;
    }

    @JsonProperty("inclusive3")
    public Boolean getInclusive3() {
        return inclusive3;
    }

    @JsonProperty("inclusive3")
    public void setInclusive3(Boolean inclusive3) {
        this.inclusive3 = inclusive3;
    }

    @JsonProperty("inclusive2")
    public Boolean getInclusive2() {
        return inclusive2;
    }

    @JsonProperty("inclusive2")
    public void setInclusive2(Boolean inclusive2) {
        this.inclusive2 = inclusive2;
    }

    @JsonProperty("buyahead")
    public Boolean getBuyahead() {
        return buyahead;
    }

    @JsonProperty("buyahead")
    public void setBuyahead(Boolean buyahead) {
        this.buyahead = buyahead;
    }

    @JsonProperty("contact")
    public String getContact() {
        return contact;
    }

    @JsonProperty("contact")
    public void setContact(String contact) {
        this.contact = contact;
    }

    @JsonProperty("ignorecntrev")
    public Boolean getIgnorecntrev() {
        return ignorecntrev;
    }

    @JsonProperty("ignorecntrev")
    public void setIgnorecntrev(Boolean ignorecntrev) {
        this.ignorecntrev = ignorecntrev;
    }

    @JsonProperty("poline_collectionref")
    public String getPolineCollectionref() {
        return polineCollectionref;
    }

    @JsonProperty("poline_collectionref")
    public void setPolineCollectionref(String polineCollectionref) {
        this.polineCollectionref = polineCollectionref;
    }

    @JsonProperty("internal")
    public Boolean getInternal() {
        return internal;
    }

    @JsonProperty("internal")
    public void setInternal(Boolean internal) {
        this.internal = internal;
    }

    @JsonProperty("currencycode")
    public String getCurrencycode() {
        return currencycode;
    }

    @JsonProperty("currencycode")
    public void setCurrencycode(String currencycode) {
        this.currencycode = currencycode;
    }

    @JsonProperty("orderdate")
    public String getOrderdate() {
        return orderdate;
    }

    @JsonProperty("orderdate")
    public void setOrderdate(String orderdate) {
        this.orderdate = orderdate;
    }

    @JsonProperty("changeby")
    public String getChangeby() {
        return changeby;
    }

    @JsonProperty("changeby")
    public void setChangeby(String changeby) {
        this.changeby = changeby;
    }

    @JsonProperty("vendor")
    public String getVendor() {
        return vendor;
    }

    @JsonProperty("vendor")
    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    @JsonProperty("receipts")
    public String getReceipts() {
        return receipts;
    }

    @JsonProperty("receipts")
    public void setReceipts(String receipts) {
        this.receipts = receipts;
    }

    @JsonProperty("shipvia_description")
    public String getShipviaDescription() {
        return shipviaDescription;
    }

    @JsonProperty("shipvia_description")
    public void setShipviaDescription(String shipviaDescription) {
        this.shipviaDescription = shipviaDescription;
    }

    @JsonProperty("fob")
    public String getFob() {
        return fob;
    }

    @JsonProperty("fob")
    public void setFob(String fob) {
        this.fob = fob;
    }

    @JsonProperty("ponum")
    public String getPonum() {
        return ponum;
    }

    @JsonProperty("ponum")
    public void setPonum(String ponum) {
        this.ponum = ponum;
    }

    @JsonProperty("poid")
    public Integer getPoid() {
        return poid;
    }

    @JsonProperty("poid")
    public void setPoid(Integer poid) {
        this.poid = poid;
    }

    @JsonProperty("internalchange")
    public Boolean getInternalchange() {
        return internalchange;
    }

    @JsonProperty("internalchange")
    public void setInternalchange(Boolean internalchange) {
        this.internalchange = internalchange;
    }

    @JsonProperty("purchaseagent")
    public String getPurchaseagent() {
        return purchaseagent;
    }

    @JsonProperty("purchaseagent")
    public void setPurchaseagent(String purchaseagent) {
        this.purchaseagent = purchaseagent;
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
