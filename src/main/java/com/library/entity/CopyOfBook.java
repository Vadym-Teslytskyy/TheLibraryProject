package com.library.entity;

import javax.persistence.*;

@Entity
@Table(name = "copy_of_book")
public class CopyOfBook extends AbstractEntityId {

    @ManyToOne(fetch = FetchType.LAZY)
    private Book book;

    @OneToOne(mappedBy = "copyOfBook")
    private Rent rent;

    @Column(name = "is_available")
    private boolean isAvailable;

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Rent getRent() {
        return rent;
    }

    public void setRent(Rent rent) {
        this.rent = rent;
    }

}
