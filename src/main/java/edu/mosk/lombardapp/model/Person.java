package edu.mosk.lombardapp.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Person {
    String id;
    String firstname;
    String surname;
    String patronymic;
    String passportNumber;
    String passportSeries;
    String passport;
    String passportIssueDate;
    String phoneNumber;
    String email;
    String personDescription;
    LocalDateTime createdAt;
    LocalDateTime updatedAt;
    Product product;

    // CONSTRUCTORS
    public Person() {
    }

    public Person(String id, String firstname, String surname, String patronymic, String passportNumber, String passportSeries, String passport, String passportIssueDate, String phoneNumber, String email, String personDescription, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.firstname = firstname;
        this.surname = surname;
        this.patronymic = patronymic;
        this.passportNumber = passportNumber;
        this.passportSeries = passportSeries;
        this.passport = passport;
        this.passportIssueDate = passportIssueDate;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.personDescription = personDescription;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    // GETTERS
    public String getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public String getPassportSeries() {
        return passportSeries;
    }

    public String getPassport() {
        return passport;
    }

    public String getPassportIssueDate() {
        return passportIssueDate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getPersonDescription() {
        return personDescription;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public Product getProduct() {
        return product;
    }


    //SETTERS
    public void setId(String id) {
        this.id = id;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public void setPassportSeries(String passportSeries) {
        this.passportSeries = passportSeries;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public void setPassportIssueDate(String passportIssueDate) {
        this.passportIssueDate = passportIssueDate;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setPersonDescription(String personDescription) {
        this.personDescription = personDescription;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    // EQUALS AND HASHCODE
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return getId().equals(person.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    // TO STRING
    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", firstname='" + firstname + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", passportNumber='" + passportNumber + '\'' +
                ", passportSeries='" + passportSeries + '\'' +
                ", passport='" + passport + '\'' +
                ", passportIssueDate='" + passportIssueDate + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", personDescription='" + personDescription + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", product=" + product +
                '}';
    }
}
