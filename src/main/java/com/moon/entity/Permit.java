package com.moon.entity;

import java.io.Serializable;
import javax.persistence.*;

public class Permit implements Serializable {
    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    private String name;

    private String api;

    private static final long serialVersionUID = 1L;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return api
     */
    public String getApi() {
        return api;
    }

    /**
     * @param api
     */
    public void setApi(String api) {
        this.api = api;
    }
}