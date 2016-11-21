package com.websystique.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.websystique.springmvc.dao.ExcellentTraineeDao;
import com.websystique.springmvc.dao.TraineeDao;
import com.websystique.springmvc.model.Web_excellent_trainee;
import com.websystique.springmvc.model.Web_trainee;
@Service("excellenttraineeService")
@Transactional
public class ExcellentTraineeServiceImpl implements ExcellentTraineeService {
	@Autowired
	private ExcellentTraineeDao dao;
	@Override
	public List<Web_excellent_trainee> getAllExcellentTrainee() {
		// TODO Auto-generated method stub
		return dao.getAllExcellentTrainee();
	}
	@Override
	public void addExcellentTrainee(Web_excellent_trainee web_excellent_trainee) {
		// TODO Auto-generated method stub
		dao.addExcellentTrainee(web_excellent_trainee);
	}
	@Override
	public Web_excellent_trainee findExcellentTraineeById(int excellentID) {
		// TODO Auto-generated method stub
		return dao.findExcellentTraineeById(excellentID);
	}
	@Override
	public void updateExcellentTrainee(Web_excellent_trainee web_excellent_trainee) {
		// TODO Auto-generated method stub
		Web_excellent_trainee entity=dao.findExcellentTraineeById(web_excellent_trainee.getExcellentID());
        if(entity!=null){
        	entity.setExcellentTrueName(web_excellent_trainee.getExcellentTrueName());
        	entity.setExcellentCourseName(web_excellent_trainee.getExcellentCourseName());
        	entity.setExcellentIntroductionText(web_excellent_trainee.getExcellentIntroductionText());
        	entity.setExcellentIntroductionImage(web_excellent_trainee.getExcellentIntroductionImage());
        }
          
	}
	@Override
	public void delExcellentTraineeByID(int excellentID) {
		// TODO Auto-generated method stub
		dao.delExcellentTraineeByID(excellentID);
	}
	@Override
	public Web_excellent_trainee findExcellentTraineeByName(String excellentTrueName) {
		// TODO Auto-generated method stub
		return dao.findExcellentTraineeByName(excellentTrueName);
	}
	@Override
	public void batchDel(Integer[] excellentIDs) {
		// TODO Auto-generated method stub
		for(Integer excellentID : excellentIDs){
			dao.delExcellentTraineeByID(excellentID);
		}
	}

}
