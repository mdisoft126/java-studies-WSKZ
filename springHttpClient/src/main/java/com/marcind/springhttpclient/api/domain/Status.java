
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
public class Status implements Serializable
{

    public Boolean verified;
    public Integer sentCount;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -4611737267237456240L;

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
