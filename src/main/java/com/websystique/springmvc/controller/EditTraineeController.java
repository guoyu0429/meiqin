package com.websystique.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class EditTraineeController {
	//ѧԱ��Ϣ����
	@RequestMapping(value= {"/edittrainee"},method = RequestMethod.GET)
		public String edittrainee(@RequestParam(value="title", required=false, defaultValue="�༭ѧԱ��Ϣ") String title, Model model){
			return "edittrainee/edittrainee";//��Ӧ�Ľ���
		}
}
