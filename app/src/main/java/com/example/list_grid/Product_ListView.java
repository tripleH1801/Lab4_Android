package com.example.list_grid;

public class Product_ListView {
    private String name;
    private String shopName;
    private int img;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public Product_ListView(String name, String shopName, int img) {
        this.name = name;
        this.shopName = shopName;
        this.img = img;
    }

    public Product_ListView() {
    }

    @Override
    public String toString() {
        return "Product_ListView{" +
                "name='" + name + '\'' +
                ", shopName='" + shopName + '\'' +
                ", img=" + img +
                '}';
    }
}
