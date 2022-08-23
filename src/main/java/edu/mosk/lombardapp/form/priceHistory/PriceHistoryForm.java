package edu.mosk.lombardapp.form.priceHistory;
/*
  @author   moskb
  @project   LombardAPP
  @version  1.0.0 
  @since 12.08.2022
*/

import edu.mosk.lombardapp.model.product.Product;

import java.time.LocalDateTime;
import java.util.Objects;

public class PriceHistoryForm {
    private String id;
    private Product product;
    private String description;
    private LocalDateTime createdAt;
    private double price;


    // CONSTRUCTORS
    public PriceHistoryForm() {
    }

    public PriceHistoryForm(String id, Product product, String description, LocalDateTime createdAt, double price) {
        this.id = id;
        this.product = product;
        this.description = description;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
        if (!(o instanceof PriceHistoryForm that)) return false;
        return Double.compare(that.getPrice(), getPrice()) == 0 && getId().equals(that.getId()) && getProduct().equals(that.getProduct()) && Objects.equals(getDescription(), that.getDescription()) && getCreatedAt().equals(that.getCreatedAt());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getProduct(), getDescription(), getCreatedAt(), getPrice());
    }

    // TO STRING
    @Override
    public String toString() {
        return "PriceHistory{" +
                "id='" + id + '\'' +
                ", product=" + product +
                ", description='" + description + '\'' +
                ", createdAt=" + createdAt +
                ", price=" + price +
                '}';
    }
}
