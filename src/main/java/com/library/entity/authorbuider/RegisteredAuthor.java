package com.library.entity.authorbuider;

import com.library.model.request.AuthorRequest;
import java.time.LocalDate;

public class RegisteredAuthor extends AuthorBuider {

    AuthorRequest authorRequest;

    public RegisteredAuthor(AuthorRequest authorRequest) {
        this.authorRequest = authorRequest;
    }

    @Override
    public void buidAuthor() {
        createNewAuthor();
        author.setFirstName(authorRequest.getFirstName());
        author.setLastName(authorRequest.getLastName());
        author.setBirthDate(LocalDate.parse(authorRequest.getBirthDate()));
        author.setCountry(authorRequest.getCountry());
        author.setPhotoUrl(authorRequest.getPhotoUrl());
    }
}
