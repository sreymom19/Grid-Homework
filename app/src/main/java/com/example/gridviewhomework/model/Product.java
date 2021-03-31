package com.example.gridviewhomework.model;

public class Product {
    private int productImage;
    private String productTitle;
    private Float productPrice;

    public Product() {}

    public Product(int productImage, String productTitle, Float productPrice) {
        this.productImage = productImage;
        this.productTitle = productTitle;
        this.productPrice = productPrice;
    }

    public int getProductImage() {
        return productImage;
    }

    public void setProductImage(int productImage) {
        this.productImage = productImage;
    }

    public String getProductTitle() {
        return productTitle;
    }

    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }

    public Float getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Float productPrice) {
        this.productPrice = productPrice;
    }
}
