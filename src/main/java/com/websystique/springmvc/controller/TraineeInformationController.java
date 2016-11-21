package com.websystique.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class TraineeInformationController {
	//编辑学员信息界面
		@RequestMapping(value="/traineeinformation")
		public String traineeinformation(){
			return "traineeinformation/traineeinformation";//对应的界面
		}
}
