package com.websystique.springmvc.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.websystique.springmvc.dao.AbstractDao;
import com.websystique.springmvc.dao.UserDao;
import com.websystique.springmvc.model.Web_user;

@Service("userService")
@Transactional
public class UserServiceImpl extends AbstractDao<String, Web_user> implements UserService{
	@Autowired
	private UserDao dao;
	public Web_user findUser(String userName, String userPassword) {
		// TODO Auto-generated method stub
		return dao.findUser(userName, userPassword);
	}

}
