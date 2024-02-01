package com.example.vaish.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Alien {
    @Id
    private  int aid;
    private  String aname;
    public Alien(int aid, String aname) {
        this.aid = aid;
        this.aname = aname;
    }

    public Alien() {
    }

    public String getAname() {
        return aname;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "aid=" + aid +
                ", aname='" + aname + '\'' +
                '}';
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }


}

