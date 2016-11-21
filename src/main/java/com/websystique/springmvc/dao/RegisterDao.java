package com.websystique.springmvc.dao;

import java.util.List;

import com.websystique.springmvc.model.Register;
public interface RegisterDao {
	Register findById(int id);

	void saveRegister(Register register);

	
	List<Register> findAllRegisters();

	Register findRegisterByLoginname(String loginname);
}
