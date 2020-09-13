package com.lms.dao;

import com.lms.bean.User;

import java.sql.SQLException;
import java.util.List;

public interface UserDao {
    /**
     * 查找全部
     * @return
     */
    List<User> selectAll();
    User selectById(Integer userId);
    void updateBorrowNum(User user);
}
