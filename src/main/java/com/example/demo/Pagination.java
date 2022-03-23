
package com.example.demo;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "limit",
    "offset",
    "count",
    "total"
})
@Generated("jsonschema2pojo")
public class Pagination {

    @Override
    public String toString() {
        return "Pagination{" +
                "limit=" + limit +
                ", offset=" + offset +
                ", count=" + count +
                ", total=" + total +
                ", additionalProperties=" + additionalProperties +
                '}';
    }

    @JsonProperty("limit")
    private Integer limit;
    @JsonProperty("offset")
    private Integer offset;
    @JsonProperty("count")
    private Integer count;
    @JsonProperty("total")
    private Integer total;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("limit")
    public Integer getLimit() {
        return limit;
    }

    @JsonProperty("limit")
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @JsonProperty("offset")
    public Integer getOffset() {
        return offset;
    }

    @JsonProperty("offset")
    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    @JsonProperty("count")
    public Integer getCount() {
        return count;
    }

    @JsonProperty("count")
    public void setCount(Integer count) {
        this.count = count;
    }

    @JsonProperty("total")
    public Integer getTotal() {
        return total;
    }

    @JsonProperty("total")
    public void setTotal(Integer total) {
        this.total = total;
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
