package com.bill.dp01.data;

/**
 * Created by Bill on 2016/11/2.
 * 设备类
 */


public class Equipment {

    private Long id;
    private String eqName;
    private Double price;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEqName() {
        return eqName;
    }

    public void setEqName(String eqName) {
        this.eqName = eqName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Equipment{" +
                "id=" + id +
                ", eqName='" + eqName + '\'' +
                ", price=" + price +
                '}';
    }
}
