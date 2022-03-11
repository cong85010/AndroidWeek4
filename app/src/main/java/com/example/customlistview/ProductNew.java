package com.example.customlistview;

public class ProductNew {
    private int id;
    private String title;
    private double price;
    private int percent;

    public ProductNew(int id, String title, double price, int percent) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.percent = percent;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public int getPercent() {
        return percent;
    }
}
