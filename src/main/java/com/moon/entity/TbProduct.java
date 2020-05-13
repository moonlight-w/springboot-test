package com.moon.entity;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "tb_product")
public class TbProduct implements Serializable {
    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    private String name;

    private Double startprice;

    private Double stepprice;

    @Column(name = "userId")
    private Integer userid;

    private String createtime;

    private Integer state;

    private String img;

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
     * @return startprice
     */
    public Double getStartprice() {
        return startprice;
    }

    /**
     * @param startprice
     */
    public void setStartprice(Double startprice) {
        this.startprice = startprice;
    }

    /**
     * @return stepprice
     */
    public Double getStepprice() {
        return stepprice;
    }

    /**
     * @param stepprice
     */
    public void setStepprice(Double stepprice) {
        this.stepprice = stepprice;
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
     * @return createtime
     */
    public String getCreatetime() {
        return createtime;
    }

    /**
     * @param createtime
     */
    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    /**
     * @return state
     */
    public Integer getState() {
        return state;
    }

    /**
     * @param state
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * @return img
     */
    public String getImg() {
        return img;
    }

    /**
     * @param img
     */
    public void setImg(String img) {
        this.img = img;
    }
}