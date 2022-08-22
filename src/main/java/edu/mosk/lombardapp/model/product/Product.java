package edu.mosk.lombardapp.model.product;
/*
  @author   moskb
  @project   LombardAPP
  @version  1.0.0
  @since 11.08.2022
*/

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Objects;

@Document
public class Product {
    @Id
    private String id;
    private ProductType productType;
    private ProductCondition productCondition;
    private String name;
    private double productWeight;
    private String productDescription;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    // CONSTRUCTORS
    public Product() {
    }

    public Product(String id, ProductType productType, ProductCondition productCondition, String productName, double productWeight, String productDescription, LocalDateTime createdAt) {
        this.id = id;
        this.productType = productType;
        this.productCondition = productCondition;
        this.name = productName;
        this.productWeight = productWeight;
        this.productDescription = productDescription;
        this.createdAt = createdAt;
    }

    public Product(String id, ProductType productType, ProductCondition productCondition, String name, double productWeight, String productDescription, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.productType = productType;
        this.productCondition = productCondition;
        this.name = name;
        this.productWeight = productWeight;
        this.productDescription = productDescription;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    // GETTERS AND SETTERS
    public String getId() {
        return id;
    }

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
        return name;
    }

    public void setProductName(String productName) {
        this.name = productName;
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

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    // EQUALS AND HASHCODE
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;
        return Double.compare(product.getProductWeight(), getProductWeight()) == 0 && getId().equals(product.getId()) && getProductType() == product.getProductType() && getProductCondition() == product.getProductCondition() && getProductName().equals(product.getProductName()) && Objects.equals(getProductDescription(), product.getProductDescription()) && getCreatedAt().equals(product.getCreatedAt()) && Objects.equals(getUpdatedAt(), product.getUpdatedAt());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getProductType(), getProductCondition(), getProductName(), getProductWeight(), getProductDescription(), getCreatedAt(), getUpdatedAt());
    }

    // TO STRING
    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", productType=" + productType +
                ", productCondition=" + productCondition +
                ", productName='" + name + '\'' +
                ", productWeight=" + productWeight +
                ", productDescription='" + productDescription + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
