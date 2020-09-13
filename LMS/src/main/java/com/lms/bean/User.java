package com.lms.bean;

public class User {
    private Integer user_uid;
    private String user_name;
    private String user_sex;
    private String user_idcard;
    private String user_tel;
    private String user_pwd;
    private Integer user_maxnum;
    private Integer user_borrnum;

    public Integer getUser_uid() {
        return user_uid;
    }

    public void setUser_uid(Integer user_uid) {
        this.user_uid = user_uid;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_sex() {
        return user_sex;
    }

    public void setUser_sex(String user_sex) {
        this.user_sex = user_sex;
    }

    public String getUser_idcard() {
        return user_idcard;
    }

    public void setUser_idcard(String user_idcard) {
        this.user_idcard = user_idcard;
    }

    public String getUser_tel() {
        return user_tel;
    }

    public void setUser_tel(String user_tel) {
        this.user_tel = user_tel;
    }

    public String getUser_pwd() {
        return user_pwd;
    }

    public void setUser_pwd(String user_pwd) {
        this.user_pwd = user_pwd;
    }

    public Integer getUser_maxnum() {
        return user_maxnum;
    }

    public void setUser_maxnum(Integer user_maxnum) {
        this.user_maxnum = user_maxnum;
    }

    public Integer getUser_borrnum() {
        return user_borrnum;
    }

    public void setUser_borrnum(Integer user_borrnum) {
        this.user_borrnum = user_borrnum;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_uid=" + user_uid +
                ", user_name='" + user_name + '\'' +
                ", user_sex='" + user_sex + '\'' +
                ", user_idcard='" + user_idcard + '\'' +
                ", user_tel='" + user_tel + '\'' +
                ", user_pwd='" + user_pwd + '\'' +
                ", user_maxnum=" + user_maxnum +
                ", user_borrnum=" + user_borrnum +
                '}';
    }
}
