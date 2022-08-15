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
    Product product;
    PriceHistory priceHistory;
    LocalDateTime onSellingSince;
    LocalDateTime editedAt;

    // CONSTRUCTORS

    public SellingProduct() {
    }

    public SellingProduct(Product product, PriceHistory priceHistory, LocalDateTime onSellingSince, LocalDateTime editedAt) {
        this.product = product;
        this.priceHistory = priceHistory;
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

    public PriceHistory getPriceHistory() {
        return priceHistory;
    }

    public void setPriceHistory(PriceHistory priceHistory) {
        this.priceHistory = priceHistory;
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
        return getProduct().equals(that.getProduct()) && getPriceHistory().equals(that.getPriceHistory()) && getOnSellingSince().equals(that.getOnSellingSince()) && Objects.equals(getEditedAt(), that.getEditedAt());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getProduct(), getPriceHistory(), getOnSellingSince(), getEditedAt());
    }

    // TO STRING

    @Override
    public String toString() {
        return "SellingProduct{" +
                "product=" + product +
                ", onSellingSince=" + onSellingSince +
                ", price=" + priceHistory +
                ", editedAt=" + editedAt +
                '}';
    }
}
