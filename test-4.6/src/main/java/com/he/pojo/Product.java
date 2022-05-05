package com.he.pojo;

public class Product {
    private int id;
    private String goodsname;
    private Double price;
    private Catagory catagory;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Catagory getCatagory() {
        return catagory;
    }

    public void setCatagory(Catagory catagory) {
        this.catagory = catagory;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", goodsname='" + goodsname + '\'' +
                ", price=" + price +
                ", catagory=" + catagory +
                '}';
    }
}
