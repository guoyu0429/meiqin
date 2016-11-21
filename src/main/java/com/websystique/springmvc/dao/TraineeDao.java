package com.websystique.springmvc.dao;

import java.util.List;

import com.websystique.springmvc.model.Web_trainee;

public interface TraineeDao {

		
	    Web_trainee findTraineeByName(String traineeTrueName);

		
		void addTrainee(Web_trainee web_trainee);

		
		List<Web_trainee> getAllTrainee();


		
		void delTraineeByID(int traineeID);

	
		Web_trainee findTraineeById(int id);
		


	}


