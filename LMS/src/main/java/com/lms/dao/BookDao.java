package com.lms.dao;

import com.lms.bean.Book;

public interface BookDao {
    Book selectByISBN(String ISBN);
    void updateSurplus(Book book);
}
