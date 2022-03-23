
package com.example.demo;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.PersistenceUnit;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.springframework.stereotype.Component;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "pagination",
    "data"
})
@Generated("jsonschema2pojo")
@Entity

public class News {

    @JsonProperty("pagination")
    private Pagination pagination;
    @JsonProperty("data")
    public List<Datum> data = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @Override
    public String toString() {
        return "News{" +
                "pagination=" + pagination +
                ", data=" + data +
                ", additionalProperties=" + additionalProperties +
                '}';
    }

    @JsonProperty("pagination")
    public Pagination getPagination() {
        return pagination;
    }

    @JsonProperty("pagination")
    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    @JsonProperty("data")
    public List<Datum> getData() {
        return data;
    }



    @JsonProperty("data")
    public void setData(List<Datum> data) {
        this.data = data;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
    public String getTitleById(int i)
    {
        return data.get(i).getTitle();
    }
    public String getDescriptionById(int i)
    {
        return data.get(i).getDescription();
    }
    public String getUrlById(int i)
    {
        return data.get(i).getUrl();
    }
    public String getSourceById(int i)
    {
        return data.get(i).getSource();
    }
    public Object getImageById(int i)
    {
        return data.get(i).getImage();
    }
    public String getPublishedAt(int i)
    {
        return data.get(i).getPublishedAt();
    }
    public String getCountryById(int i)
    {
        return data.get(i).getCountry();
    }

}
