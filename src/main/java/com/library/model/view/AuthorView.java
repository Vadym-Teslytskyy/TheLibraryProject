package com.library.model.view;

import java.time.LocalDate;

public class AuthorView {

    private Integer id;
    private String photoUrl;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private String country;
    private double averageClientsAge;

    public AuthorView(Integer id, String photoUrl, String firstName, String lastName,
                      LocalDate birthDate, String country, double averageClientsAge) {
        this.id = id;
        this.photoUrl = photoUrl;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.country = country;
        this.averageClientsAge = averageClientsAge;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getCountry() {
        return country;
    }

    public double getAverageClientsAge() {
        return averageClientsAge;
    }

    public Integer getId() {
        return id;
    }

    public static class Builder {

        private Integer id;
        private String photoUrl;
        private String firstName;
        private String lastName;
        private LocalDate birthDate;
        private String country;
        private double averageClientsAge;

        public Builder setId(Integer id) {
            this.id = id;
            return this;
        }

        public Builder setPhotoUrl(String photoUrl) {
            this.photoUrl = photoUrl;
            return this;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setBirthDate(LocalDate birthDate) {
            this.birthDate = birthDate;
            return this;
        }

        public Builder setCountry(String country) {
            this.country = country;
            return this;
        }

        public Builder setAverageClientsAge(double averageClientsAge) {
            this.averageClientsAge = averageClientsAge;
            return this;
        }

        public AuthorView build() {
            return new AuthorView(id, photoUrl, firstName, lastName, birthDate, country, averageClientsAge);
        }
    }
}
