package com.library.model.view;

import java.time.LocalDate;
import java.util.List;

public class BookView {

    private Integer id;
    private String photoUrl;
    private String name;
    private String authorFirstName;
    private String authorLastName;
    private List<String> collaborationAuthors;
    private String genre;
    private LocalDate releaseDate;
    private String fullDescription;
    private int pagesAmount;
    private int availableCount;
    private int generalCount;
    private double averageClientsAge;

//    private BookView(Integer id, String photoUrl, String name, String authorFirstName, String authorLastName,
//                    List<String> collaborationAuthors, String genre, LocalDate releaseDate, String fullDescription,
//                    int pagesAmount, int availableCount, int generalCount, double averageClientsAge) {
//        this.id = id;
//        this.photoUrl = photoUrl;
//        this.name = Objects.requireNonNull(name, "name");
//        this.authorFirstName = Objects.requireNonNull(authorFirstName, "Field authorFirstName can not be null.");
//        this.authorLastName = Objects.requireNonNull(authorLastName, "Field authorLastName can not be null.");
//        this.collaborationAuthors = collaborationAuthors;
//        this.genre = genre;
//        this.releaseDate = releaseDate;
//        this.fullDescription = fullDescription;
//        this.pagesAmount = pagesAmount;
//        this.availableCount = availableCount;
//        this.generalCount = generalCount;
//        this.averageClientsAge = averageClientsAge;
//    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthorFirstName() {
        return authorFirstName;
    }

    public void setAuthorFirstName(String authorFirstName) {
        this.authorFirstName = authorFirstName;
    }

    public String getAuthorLastName() {
        return authorLastName;
    }

    public void setAuthorLastName(String authorLastName) {
        this.authorLastName = authorLastName;
    }

    public List<String> getCollaborationAuthors() {
        return collaborationAuthors;
    }

    public void setCollaborationAuthors(List<String> collaborationAuthors) {
        this.collaborationAuthors = collaborationAuthors;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getFullDescription() {
        return fullDescription;
    }

    public void setFullDescription(String fullDescription) {
        this.fullDescription = fullDescription;
    }

    public int getPagesAmount() {
        return pagesAmount;
    }

    public void setPagesAmount(int pagesAmount) {
        this.pagesAmount = pagesAmount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public int getAvailableCount() {
        return availableCount;
    }

    public void setAvailableCount(int availableCount) {
        this.availableCount = availableCount;
    }

    public int getGeneralCount() {
        return generalCount;
    }

    public void setGeneralCount(int generalCount) {
        this.generalCount = generalCount;
    }

    public double getAverageClientsAge() {
        return averageClientsAge;
    }

    public void setAverageClientsAge(double averageClientsAge) {
        this.averageClientsAge = averageClientsAge;
    }

    public static class Builder {

        private Integer id;
        private String photoUrl;
        private String name;
        private String authorFirstName;
        private String authorLastName;
        private List<String> collaborationAuthors;
        private String genre;
        private LocalDate releaseDate;
        private String fullDescription;
        private int pagesAmount;
        private int availableCount;
        private int generalCount;
        private double averageClientsAge;

        public Builder setId(Integer id) {
            this.id = id;
            return this;
        }

        public Builder setPhotoUrl(String photoUrl) {
            this.photoUrl = photoUrl;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAuthorFirstName(String authorFirstName) {
            this.authorFirstName = authorFirstName;
            return this;
        }

        public Builder setAuthorLastName(String authorLastName) {
            this.authorLastName = authorLastName;
            return this;
        }

        public Builder setCollaborationAuthors(List<String> collaborationAuthors) {
            this.collaborationAuthors = collaborationAuthors;
            return this;
        }

        public Builder setGenre(String genre) {
            this.genre = genre;
            return this;
        }

        public Builder setReleaseDate(LocalDate releaseDate) {
            this.releaseDate = releaseDate;
            return this;
        }

        public Builder setFullDescription(String fullDescription) {
            this.fullDescription = fullDescription;
            return this;
        }

        public Builder setPagesAmount(int pagesAmount) {
            this.pagesAmount = pagesAmount;
            return this;
        }

        public Builder setAvailableCount(int availableCount) {
            this.availableCount = availableCount;
            return this;
        }

        public Builder setGeneralCount(int generalCount) {
            this.generalCount = generalCount;
            return this;
        }

        public Builder setAverageClientsAge(double averageClientsAge) {
            this.averageClientsAge = averageClientsAge;
            return this;
        }

        public BookView build() {
            BookView bookView = new BookView();
            bookView.setId(id);
            bookView.setPhotoUrl(photoUrl);
            bookView.setName(name);
            bookView.setAuthorFirstName(authorFirstName);
            bookView.setAuthorLastName(authorLastName);
            bookView.setCollaborationAuthors(collaborationAuthors);
            bookView.setGenre(genre);
            bookView.setReleaseDate(releaseDate);
            bookView.setFullDescription(fullDescription);
            bookView.setPagesAmount(pagesAmount);
            bookView.setAvailableCount(availableCount);
            bookView.setGeneralCount(generalCount);
            bookView.setAverageClientsAge(averageClientsAge);
            return bookView;
        }
    }
}
