package com.lms.dao.daoimpl;

import com.lms.bean.Record;
import com.lms.c3p0.c3p0Utils;
import com.lms.dao.RecordDao;
import org.apache.commons.dbutils.QueryRunner;

import java.sql.SQLException;

public class RecordDaoImpl implements RecordDao {
    @Override
    public void insert(Record record) {
        QueryRunner runner = new QueryRunner(c3p0Utils.getDataSource());
        try{
            runner.update("insert into record (record_loandate, record_duedate, record_muclt, user_uid, book_isbn)  values(?,?,?,?,?)" ,
                    record.getRecord_loandate(),
                    record.getRecord_duedate(),
                    record.getRecord_muclt(),
                    record.getUser_uid(),
                    record.getBook_isbn()
            );
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}
