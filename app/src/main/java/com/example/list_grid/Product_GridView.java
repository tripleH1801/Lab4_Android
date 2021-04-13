package com.example.list_grid;

public class Product_GridView {
    private String name;
    private int vote;
    private double price;
    private float discount;
    private int img;

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVote() {
        return vote;
    }

    public void setVote(int vote) {
        this.vote = vote;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public Product_GridView() {
    }

    public Product_GridView(String name, int vote, double price, float discount, int img) {
        this.name = name;
        this.vote = vote;
        this.price = price;
        this.discount = discount;
        this.img = img;
    }

    @Override
    public String toString() {
        return "Product_GridView{" +
                "name='" + name + '\'' +
                ", vote=" + vote +
                ", price=" + price +
                ", discount=" + discount +
                ", img=" + img +
                '}';
    }
}
