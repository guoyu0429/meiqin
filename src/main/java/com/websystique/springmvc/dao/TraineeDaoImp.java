package com.websystique.springmvc.dao;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.websystique.springmvc.model.Register;
import com.websystique.springmvc.model.Web_trainee;

@Repository("traineeDao")
public class TraineeDaoImp extends AbstractDao<Integer, Web_trainee> implements TraineeDao{

	@Override
	public Web_trainee findTraineeByName(String traineeTrueName) {
		// TODO Auto-generated method stub
		Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("traineeTrueName", traineeTrueName));
        return (Web_trainee) criteria.uniqueResult();
	}

	@Override
	public void addTrainee(Web_trainee web_trainee) {
		// TODO Auto-generated method stub
		persist(web_trainee);
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Web_trainee> getAllTrainee() {
		// TODO Auto-generated method stub
		Criteria criteria = createEntityCriteria();
		return (List<Web_trainee>) criteria.list();
	}

	

	@Override
	public void delTraineeByID(int traineeID) {
		// TODO Auto-generated method stub
		Query query = getSession().createSQLQuery("delete from WEB_TRAINEE where traineeID = :traineeID");
        query.setInteger("traineeID", traineeID);
        query.executeUpdate();
	}



	@Override
	public Web_trainee findTraineeById(int id) {
		// TODO Auto-generated method stub
//		 Criteria criteria = createEntityCriteria();
//	     criteria.add(Restrictions.eq("id", id));
//	     return (Web_trainee) criteria.uniqueResult();
		return getByKey(id);
	}

	




}
