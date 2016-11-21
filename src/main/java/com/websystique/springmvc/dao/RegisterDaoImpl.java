package com.websystique.springmvc.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.websystique.springmvc.model.Register;

@Repository("registerDao")
public class RegisterDaoImpl extends AbstractDao<Integer, Register> implements RegisterDao{
	
	public Register findById(int id) {
		return getByKey(id);
	}

	public void saveRegister(Register register) {
		persist(register);
	}


	@Override
	public List<Register> findAllRegisters() {
		Criteria criteria = createEntityCriteria();
		return (List<Register>) criteria.list();
	}

	@Override
	public Register findRegisterByLoginname(String loginname) {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("loginname", loginname));
		return (Register) criteria.uniqueResult();
	}
}
