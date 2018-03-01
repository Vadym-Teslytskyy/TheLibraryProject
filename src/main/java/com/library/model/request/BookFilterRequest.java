package com.library.model.request;

public class BookFilterRequest {

    private String bookFamous;

    private String period;

    private String bookName;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }
    //
//    private int resultList;

    public String getBookFamous() {
        return bookFamous;
    }

    public void setBookFamous(String bookFamous) {
        this.bookFamous = bookFamous;
    }
}
