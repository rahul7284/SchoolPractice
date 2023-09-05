package com.cyb.college.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "logindetails")
public class LoginDetails {
    @Id
    @GeneratedValue
    @Column(name = "login_id")
    private Long id;
    @Column(name = "user_name")
    private String userName;
    @Column(name = "user_pwd")
    private String userPwd;
    @Column(name = "user_mobnum")
    public String userMobNum;
    @OneToOne
    @JoinColumn(name = "id", referencedColumnName = "id")
    private Student student;
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getUserName() {
        return userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    public String getUserPwd() {
        return userPwd;
    }
    
    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }
    
    public Student getStudent() {
        return student;
    }
    
    public void setStudent(Student student) {
        this.student = student;
    }
    
    public String getUserMobNum() {
        return userMobNum;
    }
    
    public void setUserMobNum(String userMobNum) {
        this.userMobNum = userMobNum;
    }
}
