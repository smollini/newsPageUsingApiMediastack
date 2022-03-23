
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
    "author",
    "title",
    "description",
    "url",
    "source",
    "image",
    "category",
    "language",
    "country",
    "published_at"
})
@Generated("jsonschema2pojo")
public class Datum {

    @Override
    public String toString() {
        return "Datum{" +
                "author=" + author +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", url='" + url + '\'' +
                ", source='" + source + '\'' +
                ", image=" + image +
                ", category='" + category + '\'' +
                ", language='" + language + '\'' +
                ", country='" + country + '\'' +
                ", publishedAt='" + publishedAt + '\'' +
                ", additionalProperties=" + additionalProperties +
                '}';
    }

    @JsonProperty("author")
    private Object author;
    @JsonProperty("title")
    private String title;
    @JsonProperty("description")
    private String description;
    @JsonProperty("url")
    private String url;
    @JsonProperty("source")
    private String source;
    @JsonProperty("image")
    private Object image;
    @JsonProperty("category")
    private String category;
    @JsonProperty("language")
    private String language;
    @JsonProperty("country")
    private String country;
    @JsonProperty("published_at")
    private String publishedAt;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("author")
    public Object getAuthor() {
        return author;
    }

    @JsonProperty("author")
    public void setAuthor(Object author) {
        this.author = author;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("source")
    public String getSource() {
        return source;
    }

    @JsonProperty("source")
    public void setSource(String source) {
        this.source = source;
    }

    @JsonProperty("image")
    public Object getImage() {
        return image;
    }

    @JsonProperty("image")
    public void setImage(Object image) {
        this.image = image;
    }

    @JsonProperty("category")
    public String getCategory() {
        return category;
    }

    @JsonProperty("category")
    public void setCategory(String category) {
        this.category = category;
    }

    @JsonProperty("language")
    public String getLanguage() {
        return language;
    }

    @JsonProperty("language")
    public void setLanguage(String language) {
        this.language = language;
    }

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("published_at")
    public String getPublishedAt() {
        return publishedAt;
    }

    @JsonProperty("published_at")
    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
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
