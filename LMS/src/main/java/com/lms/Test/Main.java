package com.lms.Test;

import com.lms.service.BookService;
import com.lms.service.serviceimpl.BookServiceImpl;

public class Main {
    public static void main(String[] args){
        BookService bookService=new BookServiceImpl();
        bookService.BookBorrow(100000,"123456789");
    }
}
