package com.example.vaish.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student{
    @Id
    private int sid;

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    private String Sname;
    private  String Address;

    public String getSname() {
        return Sname;
    }

    public Student() {
    }

    public Student(int sid, String sname, String address) {
        this.sid = sid;
        Sname = sname;
        Address = address;
    }

    public void setSname(String sname) {
        Sname = sname;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", Sname='" + Sname + '\'' +
                ", Address='" + Address + '\'' +
                '}';
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
}
