package com.lms.bean;

import java.util.Date;

public class Book {
    private String book_isbn;
    private String book_name;
    private Date book_pubdate;
    private String book_author;
    private String book_press;
    private Float book_price;
    private Integer book_sum;
    private Integer book_surplus;
    private String booktype_num;

    public String getBook_isbn() {
        return book_isbn;
    }

    public void setBook_isbn(String book_isbn) {
        this.book_isbn = book_isbn;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public Date getBook_pubdate() {
        return book_pubdate;
    }

    public void setBook_pubdate(Date book_pubdate) {
        this.book_pubdate = book_pubdate;
    }

    public String getBook_author() {
        return book_author;
    }

    public void setBook_author(String book_author) {
        this.book_author = book_author;
    }

    public String getBook_press() {
        return book_press;
    }

    public void setBook_press(String book_press) {
        this.book_press = book_press;
    }

    public Float getBook_price() {
        return book_price;
    }

    public void setBook_price(Float book_price) {
        this.book_price = book_price;
    }

    public Integer getBook_sum() {
        return book_sum;
    }

    public void setBook_sum(Integer book_sum) {
        this.book_sum = book_sum;
    }

    public Integer getBook_surplus() {
        return book_surplus;
    }

    public void setBook_surplus(Integer book_surplus) {
        this.book_surplus = book_surplus;
    }

    public String getBooktype_num() {
        return booktype_num;
    }

    public void setBooktype_num(String booktype_num) {
        this.booktype_num = booktype_num;
    }

    @Override
    public String toString() {
        return "Book{" +
                "book_isbn='" + book_isbn + '\'' +
                ", book_name='" + book_name + '\'' +
                ", book_pubdate=" + book_pubdate +
                ", book_author='" + book_author + '\'' +
                ", book_press='" + book_press + '\'' +
                ", book_price=" + book_price +
                ", book_sum=" + book_sum +
                ", book_surplus=" + book_surplus +
                ", booktype_num='" + booktype_num + '\'' +
                '}';
    }
}
