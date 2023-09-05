package com.cyb.college.dto;

import java.util.Set;

import com.cyb.college.entity.LoginDetails;
import com.cyb.college.entity.Sport;

public class StudentDTO {
    private Long id;
    private String stName;
    private String stClass;
    private Long rollNum;
    private Set<Sport> sportArray;
    private LoginDetails logindetails;
    private String userName;
    private String userPwd;
    private String userMobNum;
    
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
    
    public StudentDTO() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    public LoginDetails getLogindetails() {
        return logindetails;
    }
    
    public void setLogindetails(LoginDetails logindetails) {
        this.logindetails = logindetails;
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
    
    public String getUserMobNum() {
        return userMobNum;
    }
    
    public void setUserMobNum(String userMobNum) {
        this.userMobNum = userMobNum;
    }
    
    public String getStClass() {
        return stClass;
    }
    
    public void setStClass(String stClass) {
        this.stClass = stClass;
    }
}
