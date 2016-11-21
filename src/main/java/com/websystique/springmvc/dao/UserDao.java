package com.websystique.springmvc.dao;


import com.websystique.springmvc.model.Web_user;

public interface UserDao {
	Web_user findUser(String userName,String userPassword);
}
