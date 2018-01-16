
package com.redhat.poc.maximo.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "_rowstamp",
    "pocostid",
    "orgid",
    "gldebitacct",
    "percentage",
    "loadedcost",
    "localref",
    "polineid",
    "costlinenum",
    "href",
    "linecost"
})
public class Pocost {

    @JsonProperty("_rowstamp")
    private String rowstamp;
    @JsonProperty("pocostid")
    private Integer pocostid;
    @JsonProperty("orgid")
    private String orgid;
    @JsonProperty("gldebitacct")
    private String gldebitacct;
    @JsonProperty("percentage")
    private Double percentage;
    @JsonProperty("loadedcost")
    private Double loadedcost;
    @JsonProperty("localref")
    private String localref;
    @JsonProperty("polineid")
    private Integer polineid;
    @JsonProperty("costlinenum")
    private Integer costlinenum;
    @JsonProperty("href")
    private String href;
    @JsonProperty("linecost")
    private Double linecost;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("_rowstamp")
    public String getRowstamp() {
        return rowstamp;
    }

    @JsonProperty("_rowstamp")
    public void setRowstamp(String rowstamp) {
        this.rowstamp = rowstamp;
    }

    @JsonProperty("pocostid")
    public Integer getPocostid() {
        return pocostid;
    }

    @JsonProperty("pocostid")
    public void setPocostid(Integer pocostid) {
        this.pocostid = pocostid;
    }

    @JsonProperty("orgid")
    public String getOrgid() {
        return orgid;
    }

    @JsonProperty("orgid")
    public void setOrgid(String orgid) {
        this.orgid = orgid;
    }

    @JsonProperty("gldebitacct")
    public String getGldebitacct() {
        return gldebitacct;
    }

    @JsonProperty("gldebitacct")
    public void setGldebitacct(String gldebitacct) {
        this.gldebitacct = gldebitacct;
    }

    @JsonProperty("percentage")
    public Double getPercentage() {
        return percentage;
    }

    @JsonProperty("percentage")
    public void setPercentage(Double percentage) {
        this.percentage = percentage;
    }

    @JsonProperty("loadedcost")
    public Double getLoadedcost() {
        return loadedcost;
    }

    @JsonProperty("loadedcost")
    public void setLoadedcost(Double loadedcost) {
        this.loadedcost = loadedcost;
    }

    @JsonProperty("localref")
    public String getLocalref() {
        return localref;
    }

    @JsonProperty("localref")
    public void setLocalref(String localref) {
        this.localref = localref;
    }

    @JsonProperty("polineid")
    public Integer getPolineid() {
        return polineid;
    }

    @JsonProperty("polineid")
    public void setPolineid(Integer polineid) {
        this.polineid = polineid;
    }

    @JsonProperty("costlinenum")
    public Integer getCostlinenum() {
        return costlinenum;
    }

    @JsonProperty("costlinenum")
    public void setCostlinenum(Integer costlinenum) {
        this.costlinenum = costlinenum;
    }

    @JsonProperty("href")
    public String getHref() {
        return href;
    }

    @JsonProperty("href")
    public void setHref(String href) {
        this.href = href;
    }

    @JsonProperty("linecost")
    public Double getLinecost() {
        return linecost;
    }

    @JsonProperty("linecost")
    public void setLinecost(Double linecost) {
        this.linecost = linecost;
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
