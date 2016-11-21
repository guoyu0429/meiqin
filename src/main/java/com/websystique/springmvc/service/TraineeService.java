package com.websystique.springmvc.service;

import java.util.List;

import com.websystique.springmvc.model.Web_trainee;

public interface TraineeService {

	void addTrainee(Web_trainee web_trainee);


	List<Web_trainee> getAllTrainee();

	
	Web_trainee findTraineeById(int id);


	void updateTrainee(Web_trainee web_trainee);

	
	void delTraineeByID(int traineeID);

	
	void batchDel(Integer[] traineeIDs);

	Web_trainee findTraineeByName(String excellentTrueName);
}
