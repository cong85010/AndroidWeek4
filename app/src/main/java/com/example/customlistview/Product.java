package com.example.customlistview;

public class Product {
    private int id;
    private String title;
    private String nameShop;

    public Product(int id, String title, String nameShop) {
        this.id = id;
        this.title = title;
        this.nameShop = nameShop;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setNameShop(String nameShop) {
        this.nameShop = nameShop;
    }


    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getNameShop() {
        return nameShop;
    }

}
