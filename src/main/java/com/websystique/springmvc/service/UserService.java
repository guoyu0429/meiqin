package com.websystique.springmvc.service;


import com.websystique.springmvc.model.Web_user;

public interface UserService {
	Web_user findUser(String userName,String userPassword);
}
