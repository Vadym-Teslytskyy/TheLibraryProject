package com.library.model.view;

public class BookIndexView {

    private Integer id;

    private String name;

    private String authorFirstName;

    private String authorLastName;

    private String genre;

    private String photoUrl;

    private int availableCount;

    public BookIndexView(Integer id, String bookName, String authorFirstName, String authorLastName,
                         String genre, String photoUrl, int availableCont) {
        this.id = id;
        this.name = bookName;
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
        this.genre = genre;
        this.photoUrl = photoUrl;
        this.availableCount = availableCont;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public int getAvailableCont() {
        return availableCount;
    }

    public void setAvailableCont(int availableCont) {
        this.availableCount = availableCont;
    }

    @Override
    public String toString() {
        return  name + " " + genre + " " +authorFirstName + " " +authorLastName + " " + availableCount;
    }
}
