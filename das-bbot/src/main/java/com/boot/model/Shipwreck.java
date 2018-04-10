package com.boot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SHIPWRECK")
public class Shipwreck {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column(name = "ORIGINALNAME")
    private String originalName;

    @Column(name = "ENGLISHNAME")
    private String englishName;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "STREET")
    private String street;

    @Column(name = "CITY")
    private String city;

    @Column(name = "POSTALCODE")
    private String postalCode;

    @Column(name = "COUNTRYCODE")
    private String countryCode;

    @Column(name = "COUNTRYNAME")
    private String countryName;

    public Shipwreck() {

    }

    public Shipwreck(Long id, String originalName, String englishName, String status, String address, String street, String city, String postalCode,
            String countryCode, String countryName) {
        this.id = id;
        this.originalName = originalName;
        this.englishName = englishName;
        this.status = status;
        this.address = address;
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
        this.postalCode = postalCode;
        this.countryCode = countryCode;
        this.countryName = countryName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOriginalName() {
        return originalName;
    }

    public void setOriginalName(String originalName) {
        this.originalName = originalName;
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

}
