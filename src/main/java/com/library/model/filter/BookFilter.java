package com.library.model.filter;


import com.library.model.request.BookFilterRequest;

public class BookFilter {

    private final String bookFamous;

    private final String period;

    private final String bookName;

    public BookFilter(String bookFamous, String period, String bookName) {
        this.bookFamous = bookFamous;
        this.period = period;
        this.bookName = bookName;
    }

    public static BookFilter parseRequest(BookFilterRequest request) {
        return new BookFilter(
                request.getBookFamous(),
                request.getPeriod(),
                request.getBookName());
    }

    public String getBookFamous() {
        return bookFamous;
    }

    public String getPeriod() {
        return period;
    }

    public String getBookName() {
        return bookName;
    }
}
