package com.websystique.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class TraineeInformationController {
	//�༭ѧԱ��Ϣ����
		@RequestMapping(value="/traineeinformation")
		public String traineeinformation(){
			return "traineeinformation/traineeinformation";//��Ӧ�Ľ���
		}
}