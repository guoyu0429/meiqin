package com.websystique.springmvc.dao;


import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.websystique.springmvc.model.Web_user;
@Repository("userDao")
public class UserDaoImpl extends AbstractDao<Integer, Web_user> implements UserDao{

	@Override
	public Web_user findUser(String userName, String userPassword) {
		// TODO Auto-generated method stub
		Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("userName", userName));
        criteria.add(Restrictions.eq("userPassword", userPassword));
        return (Web_user) criteria.uniqueResult();
	}

}
