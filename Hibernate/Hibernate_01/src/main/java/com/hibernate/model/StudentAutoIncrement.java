package com.hibernate.model;

import jakarta.persistence.*;
import org.hibernate.boot.registry.selector.spi.StrategyCreator;

@Entity
@Table(name = "student_auto_increment")
public class StudentAutoIncrement {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @SequenceGenerator(name = "myseq", sequenceName = "my_seq",initialValue = 101,allocationSize = 1)
    private  int sid;

    private String name;

    public String getName() {
        return name;
    }

    public StudentAutoIncrement() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }
}