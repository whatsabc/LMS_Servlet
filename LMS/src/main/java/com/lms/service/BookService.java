package com.lms.service;

public interface BookService {
    /**
     * 图书借阅
     * @param readerUserNum
     * @param ISBN
     * @return
     */
    String BookBorrow(int readerUserNum,String ISBN);
}
