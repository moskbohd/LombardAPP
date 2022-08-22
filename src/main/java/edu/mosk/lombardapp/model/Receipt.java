package edu.mosk.lombardapp.model;

import edu.mosk.lombardapp.model.person.Person;
import edu.mosk.lombardapp.model.product.Product;

import java.time.LocalDateTime;
import java.util.Objects;

/*
  @author   moskb
  @project   LombardAPP
  @version  1.0.0 
  @since 11.08.2022
*/

public class Receipt {
    private Person person;
    private Product product;
    private LocalDateTime dateOfSigning;
    private LocalDateTime dateOfExpiration;
    private double priceOfProduct;
    private double commission;
    private String description;

    // CONSTRUCTORS

    public Receipt() {
    }

    public Receipt(Person person, Product product, LocalDateTime dateOfSigning, LocalDateTime dateOfExpiration, double priceOfProduct, double commission, String description) {
        this.person = person;
        this.product = product;
        this.dateOfSigning = dateOfSigning;
        this.dateOfExpiration = dateOfExpiration;
        this.priceOfProduct = priceOfProduct;
        this.commission = commission;
        this.description = description;
    }

    // GETTERS AND SETTERS

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public LocalDateTime getDateOfSigning() {
        return dateOfSigning;
    }

    public void setDateOfSigning(LocalDateTime dateOfSigning) {
        this.dateOfSigning = dateOfSigning;
    }

    public LocalDateTime getDateOfExpiration() {
        return dateOfExpiration;
    }

    public void setDateOfExpiration(LocalDateTime dateOfExpiration) {
        this.dateOfExpiration = dateOfExpiration;
    }

    public double getPriceOfProduct() {
        return priceOfProduct;
    }

    public void setPriceOfProduct(double priceOfProduct) {
        this.priceOfProduct = priceOfProduct;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // EQUALS AND HASHCODE

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Receipt)) return false;
        Receipt receipt = (Receipt) o;
        return Double.compare(receipt.getPriceOfProduct(), getPriceOfProduct()) == 0 && Double.compare(receipt.getCommission(), getCommission()) == 0 && getPerson().equals(receipt.getPerson()) && getProduct().equals(receipt.getProduct()) && getDateOfSigning().equals(receipt.getDateOfSigning()) && getDateOfExpiration().equals(receipt.getDateOfExpiration()) && Objects.equals(getDescription(), receipt.getDescription());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPerson(), getProduct(), getDateOfSigning(), getDateOfExpiration(), getPriceOfProduct(), getCommission(), getDescription());
    }

    // TO STRING

    @Override
    public String toString() {
        return "Receipt{" +
                "person=" + person +
                ", product=" + product +
                ", dateOfSigning=" + dateOfSigning +
                ", dateOfExpiration=" + dateOfExpiration +
                ", priceOfProduct=" + priceOfProduct +
                ", commission=" + commission +
                ", description='" + description + '\'' +
                '}';
    }

    // METHODS
    public void ConcludeContract (){
        System.out.println("Contract successful signed");
    }
}
