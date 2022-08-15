package edu.mosk.lombardapp.model;
/*
  @author   moskb
  @project   LombardAPP
  @version  1.0.0 
  @since 12.08.2022
*/

import java.time.LocalDateTime;
import java.util.Objects;

public class PriceHistory {
    String id;
    Product product;
    LocalDateTime createdAt;
    double price;

    // CONSTRUCTORS

    public PriceHistory() {
    }

    public PriceHistory(String id, Product product, LocalDateTime createdAt, double price) {
        this.id = id;
        this.product = product;
        this.createdAt = createdAt;
        this.price = price;
    }

    // GETTERS AND SETTERS

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // EQUALS AND HASHCODE

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PriceHistory that)) return false;
        return Double.compare(that.getPrice(), getPrice()) == 0 && getId().equals(that.getId()) && getProduct().equals(that.getProduct()) && getCreatedAt().equals(that.getCreatedAt());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getProduct(), getCreatedAt(), getPrice());
    }

    // TO STRING

    @Override
    public String toString() {
        return "PriceHistory{" +
                "id='" + id + '\'' +
                ", product=" + product +
                ", createdAt=" + createdAt +
                ", price=" + price +
                '}';
    }
}
