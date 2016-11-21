package com.websystique.springmvc.dao;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;
import com.websystique.springmvc.model.Web_excellent_trainee;
import com.websystique.springmvc.model.Web_trainee;

import org.hibernate.criterion.Restrictions;

@Repository("excellenttraineeDao")
public class ExcellentTraineeDaoImpl  extends AbstractDao<Integer, Web_excellent_trainee> implements ExcellentTraineeDao {

	@Override
	@SuppressWarnings("unchecked")
	public List<Web_excellent_trainee> getAllExcellentTrainee() {
		// TODO Auto-generated method stub
		Criteria criteria = createEntityCriteria();
		return (List<Web_excellent_trainee>) criteria.list();
	}

	@Override
	public void addExcellentTrainee(Web_excellent_trainee web_excellent_trainee) {
		// TODO Auto-generated method stub
		persist(web_excellent_trainee);
	}

	@Override
	public void delExcellentTraineeByID(int excellentID) {
		// TODO Auto-generated method stub
		Query query = getSession().createSQLQuery("delete from WEB_EXCELLENT_TRAINEE where excellentID = :excellentID");
        query.setInteger("excellentID", excellentID);
        query.executeUpdate();
	}

	@Override
	public Web_excellent_trainee findExcellentTraineeById(int excellentID) {
		// TODO Auto-generated method stub
		return getByKey(excellentID);
	}

	@Override
	public Web_excellent_trainee findExcellentTraineeByName(String excellentTrueName) {
		// TODO Auto-generated method stub
		Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("excellentTrueName", excellentTrueName));
        return (Web_excellent_trainee) criteria.uniqueResult();
	}
	

}
