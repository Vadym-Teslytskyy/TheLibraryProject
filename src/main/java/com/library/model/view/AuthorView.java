package com.library.model.view;

import java.time.LocalDate;

public class AuthorView {

    private String photoUrl;

    private String firstName;

    private String lastName;

    private LocalDate birthDate;

    private String country;

    private double averageClientsAge;

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getAverageClientsAge() {
        return averageClientsAge;
    }

    public void setAverageClientsAge(double averageClientsAge) {
        this.averageClientsAge = averageClientsAge;
    }
}
