package com.lms.dao.daoimpl;

import com.lms.bean.Book;
import com.lms.dao.BookDao;
import com.lms.c3p0.c3p0Utils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookDaoImpl implements BookDao {
    @Override
    public Book selectByISBN(String ISBN) {
        QueryRunner runner = new QueryRunner(c3p0Utils.getDataSource());
        try {
            return runner.query("select * from book where book_isbn= ?", new BeanHandler<Book>(Book.class),ISBN);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }


    public void updateSurplus(Book book){
        QueryRunner runner = new QueryRunner(c3p0Utils.getDataSource());
        try {
            runner.update("UPDATE book SET book_surplus = ? WHERE book_isbn = ?",book.getBook_surplus(),book.getBook_isbn());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
