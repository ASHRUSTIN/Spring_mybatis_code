package com.shenyiqiao.domain;

public class Regsiter{
    private Integer uid;
    private String uname;
    private String upwd;
    private Integer ugender;
    private String ubirthday;
    private  String uaddress;
    private String uphonenumber;
    private String uemail;
    public Regsiter(Integer uid, String uname, String upwd, Integer ugender, String ubirthday, String uaddress, String uphonenumber, String uemail) {
        this.uid = uid;
        this.uname = uname;
        this.upwd = upwd;
        this.ugender = ugender;
        this.ubirthday = ubirthday;
        this.uaddress = uaddress;
        this.uphonenumber = uphonenumber;
        this.uemail = uemail;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd;
    }

    public Integer getUgender() {
        return ugender;
    }

    public void setUgender(Integer ugender) {
        this.ugender = ugender;
    }

    public String getUbirthday() {
        return ubirthday;
    }

    public void setUbirthday(String ubirthday) {
        this.ubirthday = ubirthday;
    }

    public String getUaddress() {
        return uaddress;
    }

    public void setUaddress(String uaddress) {
        this.uaddress = uaddress;
    }

    public String getUphonenumber() {
        return uphonenumber;
    }

    public void setUphonenumber(String uphonenumber) {
        this.uphonenumber = uphonenumber;
    }

    public String getUemail() {
        return uemail;
    }

    public void setUemail(String uemail) {
        this.uemail = uemail;
    }

    @Override
    public String toString() {
        return "Regsiter{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", upwd='" + upwd + '\'' +
                ", ugender=" + ugender +
                ", ubirthday='" + ubirthday + '\'' +
                ", uaddress='" + uaddress + '\'' +
                ", uphonenumber='" + uphonenumber + '\'' +
                ", uemail='" + uemail + '\'' +
                '}';
    }




    public Regsiter(){}
}
