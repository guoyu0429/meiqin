package com.websystique.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.websystique.springmvc.dao.AbstractDao;
import com.websystique.springmvc.dao.TraineeDao;
import com.websystique.springmvc.model.Web_excellent_trainee;
import com.websystique.springmvc.model.Web_trainee;
@Service("traineeService")
@Transactional
public class TraineeServiceImp  extends AbstractDao<String, Web_trainee> implements TraineeService {
	@Autowired
	private TraineeDao dao;
	public void addTrainee(Web_trainee web_trainee) {
		// TODO Auto-generated method stub
		dao.addTrainee(web_trainee);
	}


	public void delTraineeByID(int traineeID) {
		// TODO Auto-generated method stub
		dao.delTraineeByID(traineeID);
	}

	

	public List<Web_trainee> getAllTrainee() {
		// TODO Auto-generated method stub
		return dao.getAllTrainee();
	}

	

	public void updateTrainee(Web_trainee web_trainee) {
		// TODO Auto-generated method stub
		
		Web_trainee entity = dao.findTraineeById(web_trainee.getTraineeID());
	        if(entity!=null){
	            entity.setTraineeTrueName(web_trainee.getTraineeTrueName());
	            entity.setTraineeTrueName(web_trainee.getTraineeTrueName());
	            entity.setTraineeSex(web_trainee.getTraineeSex());
	            entity.setTraineeAge(web_trainee.getTraineeAge());
	            entity.setTraineePhone(web_trainee.getTraineePhone());
	            entity.setTraineeAds(web_trainee.getTraineeAds());
	            entity.setTraineeStudytype(web_trainee.getTraineeStudytype());
	            entity.setTraineeCertificate(web_trainee.getTraineeCertificate());
	            entity.setTraineeEducation(web_trainee.getTraineeEducation());
	            entity.setTraineeIDNumber(web_trainee.getTraineeIDNumber());
	        }
	           
	}


	@Override
	public void batchDel(Integer[] traineeIDs) {
		// TODO Auto-generated method stub
		for(Integer traineeID : traineeIDs){
			dao.delTraineeByID(traineeID);
		}
	}


	@Override
	public Web_trainee findTraineeById(int id) {
		// TODO Auto-generated method stub
		return dao.findTraineeById(id);
	}


	@Override
	public Web_trainee findTraineeByName(String traineeTrueName) {
		// TODO Auto-generated method stub
		return dao.findTraineeByName(traineeTrueName);
	}




}
