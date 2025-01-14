package com.java.crudapp;

public class Student {
    private int sId;
    private String sName;
    private String pName;
    private String phoneNumber;
    private int sClass;

    public Student(int sId, String sName, String pName,int sClass,String phoneNumber) {
        this.sId = sId;
        this.sName = sName;
        this.pName = pName;
        this.sClass = sClass;
        this.phoneNumber = phoneNumber;

    }

    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getsClass() {
        return sClass;
    }

    public void setsClass(int sClass) {
        this.sClass = sClass;
    }
}
