package com.websystique.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.websystique.springmvc.dao.RegisterDao;
import com.websystique.springmvc.model.Register;

@Service("registerService")
@Transactional
public class RegisterServiceImpl implements RegisterService{

	@Autowired
	private RegisterDao dao;
	
	@Override
	public Register findById(int id) {
		// TODO Auto-generated method stub
		return dao.findById(id);
	}

	@Override
	public void saveRegister(Register register) {
		// TODO Auto-generated method stub
		dao.saveRegister(register);
	}

	@Override
	public List<Register> findAllRegisters() {
		// TODO Auto-generated method stub
		return dao.findAllRegisters();
	}

	@Override
	public Register findRegisterByLoginname(String loginname) {
		// TODO Auto-generated method stub
		return dao.findRegisterByLoginname(loginname);
	}

	@Override
	public boolean isRegisterLoginnameUnique(Integer id, String loginname) {
		Register register = findRegisterByLoginname(loginname);
		return ( register == null || ((id != null) && (register.getId() == id)));
	}

}
