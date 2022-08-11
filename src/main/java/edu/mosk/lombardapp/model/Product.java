package edu.mosk.lombardapp.model;
/*
  @author   moskb
  @project   LombardAPP
  @version  1.0.0
  @since 11.08.2022
*/

import java.time.LocalDateTime;
import java.util.Objects;

public class Product {
    String id;
    ProductType productType;
    ProductCondition productCondition;
    String productName;
    double productWeight;
    String productDescription;


    // CONSTRUCTORS
    public Product() {
    }

    public Product(String id, ProductType productType, ProductCondition productCondition, Person personBuyer, Person personOwner, String productName, double productPrice, double commission, double productWeight, String productDescription, LocalDateTime createdAt, LocalDateTime updatedAt, LocalDateTime timeRemaining) {
        this.id = id;
        this.productType = productType;
        this.productCondition = productCondition;
        this.productName = productName;
        this.productWeight = productWeight;
        this.productDescription = productDescription;
    }

    // GETTERS
    public String getId() {
        return id;
    }

    //SETTERS
    public void setId(String id) {
        this.id = id;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public ProductCondition getProductCondition() {
        return productCondition;
    }

    public void setProductCondition(ProductCondition productCondition) {
        this.productCondition = productCondition;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductWeight() {
        return productWeight;
    }

    public void setProductWeight(double productWeight) {
        this.productWeight = productWeight;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }


    // EQUALS AND HASHCODE
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return getId().equals(product.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    // TO STRING
    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", productName='" + productName + '\'' +
                ", productWeight=" + productWeight +
                ", productDescription='" + productDescription + '\'' +
                '}';
    }
}
