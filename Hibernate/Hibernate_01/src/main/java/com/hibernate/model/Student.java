package com.hibernate.model;

import jakarta.persistence.*;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @Column(name = "SID")
    private Integer sid;

    @Column(name = "SNAME")
    private String sname;

//    @Transient  If we use transit Then that column will not appear in our database
    @Column(name = "SCITY")
    private  String scity;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("scity='").append(scity).append('\'');
        sb.append(", sid=").append(sid);
        sb.append(", sname='").append(sname).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public Student(){
        System.out.println("this is zero parameter constructor for Hibernate");
        System.out.println("you have to give this constructor it is menditory");
    }

    public String getScity() {
        return scity;
    }

    public void setScity(String scity) {
        this.scity = scity;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }
}