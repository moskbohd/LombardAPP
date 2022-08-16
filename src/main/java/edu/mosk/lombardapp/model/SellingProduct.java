package edu.mosk.lombardapp.model;
/*
  @author   moskb
  @project   LombardAPP
  @version  1.0.0 
  @since 11.08.2022
*/

import java.time.LocalDateTime;
import java.util.Objects;

public class SellingProduct {
    private Product product;
    private double price;
    private LocalDateTime onSellingSince;
    private LocalDateTime editedAt;

    // CONSTRUCTORS

    public SellingProduct() {
    }

    public SellingProduct(Product product, double price, LocalDateTime onSellingSince, LocalDateTime editedAt) {
        this.product = product;
        this.price = price;
        this.onSellingSince = onSellingSince;
        this.editedAt = editedAt;
    }

    // GETTERS AND SETTERS

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDateTime getOnSellingSince() {
        return onSellingSince;
    }

    public void setOnSellingSince(LocalDateTime onSellingSince) {
        this.onSellingSince = onSellingSince;
    }

    public LocalDateTime getEditedAt() {
        return editedAt;
    }

    public void setEditedAt(LocalDateTime editedAt) {
        this.editedAt = editedAt;
    }

    // EQUALS AND HASHCODE

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SellingProduct that)) return false;
        return Double.compare(that.getPrice(), getPrice()) == 0 && getProduct().equals(that.getProduct()) && getOnSellingSince().equals(that.getOnSellingSince()) && getEditedAt().equals(that.getEditedAt());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getProduct(), getPrice(), getOnSellingSince(), getEditedAt());
    }

    // TO STRING

    @Override
    public String toString() {
        return "SellingProduct{" +
                "product=" + product +
                ", onSellingSince=" + onSellingSince +
                ", price=" + price +
                ", editedAt=" + editedAt +
                '}';
    }
}
