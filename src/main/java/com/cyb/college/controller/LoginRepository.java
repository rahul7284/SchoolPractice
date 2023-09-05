package com.cyb.college.controller;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cyb.college.entity.LoginDetails;

@Repository
public interface LoginRepository extends CrudRepository<LoginDetails, Long> {
    public LoginDetails findByUserNameAndUserPwd(String userName, String userPwd);
}
