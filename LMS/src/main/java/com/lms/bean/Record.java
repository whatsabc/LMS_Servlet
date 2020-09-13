package com.lms.bean;

import java.util.Date;

public class Record {
    private Integer record_id;
    private Date record_loandate ;
    private Date record_duedate;
    private Date record_returndate;
    private Float record_muclt;
    private Integer user_uid;
    private String book_isbn;

    public Record() {}

    public Record(Date record_loandate, Date record_duedate, Float record_muclt, Integer user_uid, String book_isbn) {
        this.record_loandate = record_loandate;
        this.record_duedate = record_duedate;
        this.record_muclt = record_muclt;
        this.user_uid = user_uid;
        this.book_isbn = book_isbn;
    }

    public Integer getRecord_id() {
        return record_id;
    }

    public void setRecord_id(Integer record_id) {
        this.record_id = record_id;
    }

    public Date getRecord_loandate() {
        return record_loandate;
    }

    public void setRecord_loandate(Date record_loandate) {
        this.record_loandate = record_loandate;
    }

    public Date getRecord_duedate() {
        return record_duedate;
    }

    public void setRecord_duedate(Date record_duedate) {
        this.record_duedate = record_duedate;
    }

    public Date getRecord_returndate() {
        return record_returndate;
    }

    public void setRecord_returndate(Date record_returndate) {
        this.record_returndate = record_returndate;
    }

    public Float getRecord_muclt() {
        return record_muclt;
    }

    public void setRecord_muclt(Float record_muclt) {
        this.record_muclt = record_muclt;
    }

    public Integer getUser_uid() {
        return user_uid;
    }

    public void setUser_uid(Integer user_uid) {
        this.user_uid = user_uid;
    }

    public String getBook_isbn() {
        return book_isbn;
    }

    public void setBook_isbn(String book_isbn) {
        this.book_isbn = book_isbn;
    }

    @Override
    public String toString() {
        return "Record{" +
                "record_id=" + record_id +
                ", record_loandate=" + record_loandate +
                ", record_duedate=" + record_duedate +
                ", record_returndate=" + record_returndate +
                ", record_muclt=" + record_muclt +
                ", user_uid=" + user_uid +
                ", book_isbn='" + book_isbn + '\'' +
                '}';
    }
}
