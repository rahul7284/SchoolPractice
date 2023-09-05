package com.cyb.college.entity;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.cyb.college.dto.Expense;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue
    @Column(name = "ID")
    public Long id;
    @Column(name = "stname")
    public String stName;
    @Column(name = "stclass")
    public String stClass;
    public Long rollNum;
    @OneToMany(mappedBy = "st", cascade = CascadeType.ALL)
    public Set<Sport> sportArray;
    @OneToOne(mappedBy = "student", cascade = CascadeType.ALL)
    @JsonIgnore
    public LoginDetails logindetails;
    @OneToOne(mappedBy = "student", cascade = CascadeType.ALL)
    public Results results;
    @JsonInclude()
    @Transient
    public List<Expense> expenses;
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getStName() {
        return stName;
    }
    
    public void setStName(String stName) {
        this.stName = stName;
    }
    
    public Long getRollNum() {
        return rollNum;
    }
    
    public void setRollNum(Long rollNum) {
        this.rollNum = rollNum;
    }
    
    public Set<Sport> getSportArray() {
        return sportArray;
    }
    
    public void setSportArray(Set<Sport> sportArray) {
        this.sportArray = sportArray;
    }
    
    public Student() {
        super(); // TODO Auto-generated constructor stub }
    }
    
    public LoginDetails getLogindetails() {
        return logindetails;
    }
    
    public void setLogindetails(LoginDetails logindetails) {
        this.logindetails = logindetails;
    }
    
    public String getStClass() {
        return stClass;
    }
    
    public void setStClass(String stClass) {
        this.stClass = stClass;
    }
    
    public Results getResults() {
        return results;
    }
    
    public void setResults(Results results) {
        this.results = results;
    }
    
    public List<Expense> getExpenses() {
        return expenses;
    }
    
    public void setExpenses(List<Expense> expenses) {
        this.expenses = expenses;
    }
}
