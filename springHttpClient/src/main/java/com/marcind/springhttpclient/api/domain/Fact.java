
package com.marcind.springhttpclient.api.domain;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

import lombok.Getter;
import lombok.Setter;

@Generated("jsonschema2pojo")
@Setter
@Getter
public class Fact implements Serializable
{

    public Status status;
    public String id;
    public Integer v;
    public String text;
    public String source;
    public String updatedAt;
    public String type;
    public String createdAt;
    public Boolean deleted;
    public Boolean used;
    public String user;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -2946515610979338369L;

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
