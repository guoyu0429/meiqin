package com.websystique.springmvc.service;
import java.util.List;

import com.websystique.springmvc.model.Register;

public interface RegisterService {
	
	Register findById(int id);
	
	void saveRegister(Register register);
	


	List<Register> findAllRegisters(); 
	
	Register findRegisterByLoginname(String loginname);


	boolean isRegisterLoginnameUnique(Integer id, String loginname);

	
	
}
