package com.example.gridviewhomework.model;

public class Product {
    private int productImage;
    private String productTitle, productDescription;
    private Float productPrice;

    public Product() {

    }

    public Product(int pImage, String productTitle, String productDescription, Float productPrice) {
        productImage = pImage;
        this.productTitle = productTitle;
        this.productDescription = productDescription;
        this.productPrice = productPrice;
    }

    /**
     * access modifier
     * 1 private
     * 2 protected
     * 3 public
     *
     * return type
     * return primitive or object
     * primitive -> int, String, long, float, Double, Boolean
     * object -> Product
     *
     * @getProductTitle => function name
     *
     *
     * @return
     */

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

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public Float getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Float productPrice) {
        this.productPrice = productPrice;
    }
}
