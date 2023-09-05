package com.cyb.college.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "result")
public class Results {
    @Id
    @GeneratedValue
    @Column(name = "result_id")
    private Long id;
    @Column(name = "maths")
    private Long maths;
    @Column(name = "science")
    private Long science;
    @Column(name = "english")
    private Long english;
    @Column(name = "hindi")
    private Long hindi;
    @Column(name = "socialstudies")
    private Long socialstudies;
    @Column(name = "year")
    private Integer year;
    @OneToOne
    @JoinColumn(name = "id", referencedColumnName = "id")
    @JsonIgnore
    private Student student;
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public Long getMaths() {
        return maths;
    }
    
    public void setMaths(Long maths) {
        this.maths = maths;
    }
    
    public Long getScience() {
        return science;
    }
    
    public void setScience(Long science) {
        this.science = science;
    }
    
    public Long getEnglish() {
        return english;
    }
    
    public void setEnglish(Long english) {
        this.english = english;
    }
    
    public Long getHindi() {
        return hindi;
    }
    
    public void setHindi(Long hindi) {
        this.hindi = hindi;
    }
    
    public Student getStudent() {
        return student;
    }
    
    public void setStudent(Student student) {
        this.student = student;
    }
    
    public Long getSocialstudies() {
        return socialstudies;
    }
    
    public void setSocialstudies(Long socialstudies) {
        this.socialstudies = socialstudies;
    }
    
    public Integer getYear() {
        return year;
    }
    
    public void setYear(Integer year) {
        this.year = year;
    }
}
