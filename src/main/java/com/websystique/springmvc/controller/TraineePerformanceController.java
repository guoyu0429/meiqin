package com.websystique.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class TraineePerformanceController {
	//ѧԱ��ɽ���
	@RequestMapping(value= {"/traineeperformance"},method = RequestMethod.GET)
	public String traineeperformance(@RequestParam(value="title", required=false, defaultValue="ѧԱ���") String title, Model model){
		model.addAttribute("title", title);
		return "traineeperformance/traineeperformance";//��Ӧ�Ľ���
	}
	
}
