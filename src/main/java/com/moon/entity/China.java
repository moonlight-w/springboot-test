package com.moon.entity;

import java.io.Serializable;
import javax.persistence.*;

public class China implements Serializable {
    @Id
    @Column(name = "Id")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    @Column(name = "Name")
    private String name;

    @Column(name = "Pid")
    private Integer pid;

    private static final long serialVersionUID = 1L;

    /**
     * @return Id
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
     * @return Name
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
     * @return Pid
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * @param pid
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }
}