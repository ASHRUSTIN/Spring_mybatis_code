package com.syq.code.entity;


public class User {
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getEmailaddress() {
        return emailaddress;
    }

    public void setEmailaddress(String emailaddress) {
        this.emailaddress = emailaddress;
    }

    private int id;

    public User(String password, int id, String username, int age, int gender, String phonenumber, String emailaddress) {
        this.password = password;
        this.id = id;
        this.username = username;
        this.age = age;
        this.gender = gender;
        this.phonenumber = phonenumber;
        this.emailaddress = emailaddress;
    }

    private String username;
    private int age;
    private int gender;
    private String phonenumber;
    private String emailaddress;

    public User() {
    }
}

