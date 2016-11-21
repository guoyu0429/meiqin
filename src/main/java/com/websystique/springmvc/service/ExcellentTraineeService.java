package com.websystique.springmvc.service;

import java.util.List;

import com.websystique.springmvc.model.Web_excellent_trainee;
import com.websystique.springmvc.model.Web_trainee;

public interface ExcellentTraineeService {
	
	List<Web_excellent_trainee> getAllExcellentTrainee();

	void addExcellentTrainee(Web_excellent_trainee web_excellent_trainee);
	
	Web_excellent_trainee findExcellentTraineeById(int excellentID);


	void updateExcellentTrainee(Web_excellent_trainee web_excellent_trainee);

	
	void delExcellentTraineeByID(int excellentID);
	
	Web_excellent_trainee findExcellentTraineeByName(String excellentTrueName);

	void batchDel(Integer[] excellentIDs);
}
