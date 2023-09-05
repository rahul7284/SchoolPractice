package com.cyb.college.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "sport")
public class Sport {
    @Id
    @GeneratedValue
    @Column(name = "sprt_id")
    public Long sprt_id;
    @Column(name = "sprt_names")
    public String sprt_names;
    @ManyToOne
    @JoinColumn(name = "ID", nullable = true)
    @JsonIgnore
    public Student st;
    
    public Long getSprt_id() {
        return sprt_id;
    }
    
    public void setSprt_id(Long sprt_id) {
        this.sprt_id = sprt_id;
    }
    
    public Student getSt() {
        return st;
    }
    
    public void setSt(Student st) {
        this.st = st;
    }
    
    public String getSprt_names() {
        return sprt_names;
    }
    
    public void setSprt_names(String sprt_names) {
        this.sprt_names = sprt_names;
    }
}
