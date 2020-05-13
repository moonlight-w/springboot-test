package com.moon.entity;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "user_permit")
public class UserPermit implements Serializable {
    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    @Column(name = "userId")
    private Integer userid;

    @Column(name = "permitId")
    private Integer permitid;

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
     * @return userId
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * @param userid
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * @return permitId
     */
    public Integer getPermitid() {
        return permitid;
    }

    /**
     * @param permitid
     */
    public void setPermitid(Integer permitid) {
        this.permitid = permitid;
    }
}