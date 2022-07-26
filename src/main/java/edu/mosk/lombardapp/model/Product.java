package edu.mosk.lombardapp.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Product {
    String id;
    ProductType productType;
    ProductCondition productCondition;
    Person personBuyer;
    Person personOwner;
    String productName;
    double productPrice;
    double commission;
    double productWeight;
    String productDescription;
    LocalDateTime createdAt;
    LocalDateTime updatedAt;
    LocalDateTime timeRemaining;

    // CONSTRUCTORS
    public Product() {
    }

    public Product(String id, ProductType productType, ProductCondition productCondition, Person personBuyer, Person personOwner, String productName, double productPrice, double commission, double productWeight, String productDescription, LocalDateTime createdAt, LocalDateTime updatedAt, LocalDateTime timeRemaining) {
        this.id = id;
        this.productType = productType;
        this.productCondition = productCondition;
        this.personBuyer = personBuyer;
        this.personOwner = personOwner;
        this.productName = productName;
        this.productPrice = productPrice;
        this.commission = commission;
        this.productWeight = productWeight;
        this.productDescription = productDescription;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.timeRemaining = getTimeRemaining();
    }

    // GETTERS
    public String getId() {
        return id;
    }

    public ProductType getProductType() {
        return productType;
    }

    public ProductCondition getProductCondition() {
        return productCondition;
    }

    public Person getPersonBuyer() {
        return personBuyer;
    }

    public Person getPersonOwner() {
        return personOwner;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public double getCommission() {
        return commission;
    }

    public double getProductWeight() {
        return productWeight;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public LocalDateTime getTimeRemaining() {
        return timeRemaining;
    }

    //SETTERS
    public void setId(String id) {
        this.id = id;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public void setProductCondition(ProductCondition productCondition) {
        this.productCondition = productCondition;
    }

    public void setPersonBuyer(Person personBuyer) {
        this.personBuyer = personBuyer;
    }

    public void setPersonOwner(Person personOwner) {
        this.personOwner = personOwner;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public void setProductWeight(double productWeight) {
        this.productWeight = productWeight;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public void setTimeRemaining(LocalDateTime timeRemaining) {
        //owner has 30 days before item start belong to lombard
        this.timeRemaining = getCreatedAt().plusDays(31);
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
                ", personBuyer=" + personBuyer +
                ", personOwner=" + personOwner +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", productWeight=" + productWeight +
                ", productDescription='" + productDescription + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", timeRemaining=" + timeRemaining +
                '}';
    }
}
