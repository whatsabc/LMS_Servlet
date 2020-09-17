package com.lms.service.serviceimpl;

import com.lms.bean.Book;
import com.lms.bean.Record;
import com.lms.bean.User;
import com.lms.dao.BookDao;
import com.lms.dao.RecordDao;
import com.lms.dao.UserDao;
import com.lms.dao.daoimpl.BookDaoImpl;
import com.lms.dao.daoimpl.RecordDaoImpl;
import com.lms.dao.daoimpl.UserDaoImpl;
import com.lms.factory.BeanFactory;
import com.lms.service.BookService;

import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;

public class BookServiceImpl implements BookService {

    /**
     * 此处存在耦合，我们使用工厂模式进行解耦
     */
    //UserDao userDao=new UserDaoImpl();
    //RecordDao recordDao=new RecordDaoImpl();
    //BookDao bookDao=new BookDaoImpl();

    /**
     * 使用BeanFactory进行解耦
     */
    UserDao userDao=(UserDao)BeanFactory.getBean("UserDao");
    //用于测试生成的对象是否是单例对象，在debug模式中查看地址，发现是单例对象
    UserDao userDao2=(UserDao)BeanFactory.getBean("UserDao");
    UserDao userDao3=(UserDao)BeanFactory.getBean("UserDao");

    RecordDao recordDao=(RecordDao)BeanFactory.getBean("RecordDao");
    BookDao bookDao=(BookDao)BeanFactory.getBean("BookDao");


    @Override
    public String BookBorrow(int userId, String ISBN) {
        User user=userDao.selectById(userId);
        //查询读者情况
        if(user.getUser_borrnum()>=user.getUser_maxnum()){
            return "读者借书超过上限";
        }
        //查询图书情况
        Book book=bookDao.selectByISBN(ISBN);
        if(book.getBook_surplus()<=0){
            return "该图书库存为0";
        }
        //更改读者已经借阅数量
        user.setUser_borrnum(user.getUser_borrnum()+1);
        userDao.updateBorrowNum(user);
        //更改图书剩余数量
        book.setBook_surplus(book.getBook_surplus()-1);
        bookDao.updateSurplus(book);
        //生成借阅表
        Calendar c= Calendar.getInstance();
        Date loanDate=Calendar.getInstance().getTime();
        c.add(Calendar.DAY_OF_MONTH,30);
        Date dueDate=c.getTime();
        recordDao.insert(new Record(loanDate,dueDate,0.1f,userId,ISBN));
        return "借阅成功";
    }
}
