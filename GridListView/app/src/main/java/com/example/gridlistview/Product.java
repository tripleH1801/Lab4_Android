package com.example.gridlistview;

import java.util.ArrayList;

public class Product {
    private String name;
    private double price;
    private ArrayList<String> size;
    private int img;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public ArrayList<String> getSize() {
        return size;
    }

    public void setSize(ArrayList<String> size) {
        this.size = size;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public Product(String name, double price, ArrayList<String> size, int img) {
        this.name = name;
        this.price = price;
        this.size = size;
        this.img = img;
    }
}
