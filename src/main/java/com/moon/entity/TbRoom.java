package com.moon.entity;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "tb_room")
public class TbRoom implements Serializable {
    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    @Column(name = "productId")
    private Integer productid;

    private Double maxprice;

    private String createtime;

    private String endtime;

    private Integer state;

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
     * @return productId
     */
    public Integer getProductid() {
        return productid;
    }

    /**
     * @param productid
     */
    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    /**
     * @return maxprice
     */
    public Double getMaxprice() {
        return maxprice;
    }

    /**
     * @param maxprice
     */
    public void setMaxprice(Double maxprice) {
        this.maxprice = maxprice;
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
     * @return endtime
     */
    public String getEndtime() {
        return endtime;
    }

    /**
     * @param endtime
     */
    public void setEndtime(String endtime) {
        this.endtime = endtime;
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
}