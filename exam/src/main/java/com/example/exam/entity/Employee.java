package com.example.exam.entity;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import java.util.Date;
import org.hibernate.annotations.CreationTimestamp;
@Data
@Entity

public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    private String name;
    private String addr;
    private String DateOfBirth;

    @CreationTimestamp
    private Date createAt;

    @CreationTimestamp
    private Date updateAt;

}
