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
    LocalDateTime onSellingSince;
    double price;
    boolean isOnSale;
    double saleAmount;
    LocalDateTime editedAt;

    // CONSTRUCTORS

    public SellingProduct() {
    }

    public SellingProduct(Product product, LocalDateTime onSellingSince, double price, boolean isOnSale, double saleAmount, LocalDateTime editedAt) {
        this.product = product;
        this.onSellingSince = onSellingSince;
        this.price = price;
        this.isOnSale = isOnSale;
        this.saleAmount = saleAmount;
        this.editedAt = editedAt;
    }
    // GETTERS AND SETTERS

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public LocalDateTime getOnSellingSince() {
        return onSellingSince;
    }

    public void setOnSellingSince(LocalDateTime onSellingSince) {
        this.onSellingSince = onSellingSince;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isOnSale() {
        return isOnSale;
    }

    public void setOnSale(boolean onSale) {
        isOnSale = onSale;
    }

    public double getSaleAmount() {
        return saleAmount;
    }

    public void setSaleAmount(double saleAmount) {
        this.saleAmount = saleAmount;
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
        if (!(o instanceof SellingProduct)) return false;
        SellingProduct that = (SellingProduct) o;
        return Double.compare(that.getPrice(), getPrice()) == 0 && isOnSale() == that.isOnSale() && Double.compare(that.getSaleAmount(), getSaleAmount()) == 0 && getProduct().equals(that.getProduct()) && getOnSellingSince().equals(that.getOnSellingSince()) && Objects.equals(getEditedAt(), that.getEditedAt());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getProduct(), getOnSellingSince(), getPrice(), isOnSale(), getSaleAmount(), getEditedAt());
    }

    // TO STRING

    @Override
    public String toString() {
        return "SellingProduct{" +
                "product=" + product +
                ", onSellingSince=" + onSellingSince +
                ", price=" + price +
                ", isOnSale=" + isOnSale +
                ", saleAmount=" + saleAmount +
                ", editedAt=" + editedAt +
                '}';
    }
}
