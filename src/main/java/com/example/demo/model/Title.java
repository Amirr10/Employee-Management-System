package com.example.demo.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="titles")
public class Title {

    @Id
    @Column(name="emp_no")
    private int emp_no;

    @Column(name="title")
    private String title;

    @Column(name = "from_date")
    @Temporal(TemporalType.DATE)
    private Date fromDate;

    @Column(name = "to_date")
    @Temporal(TemporalType.DATE)
    private Date toDate;

    public Title(){

    }

    public Title(int emp_no, String title, Date fromDate, Date toDate) {
        this.emp_no = emp_no;
        this.title = title;
        this.fromDate = fromDate;
        this.toDate = toDate;
    }


    public int getEmp_no() {
        return emp_no;
    }

    public void setEmp_no(int emp_no) {
        this.emp_no = emp_no;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }
}
