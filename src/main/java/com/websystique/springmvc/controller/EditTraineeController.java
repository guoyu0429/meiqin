package com.websystique.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class EditTraineeController {
	//学员信息界面
	@RequestMapping(value= {"/edittrainee"},method = RequestMethod.GET)
		public String edittrainee(@RequestParam(value="title", required=false, defaultValue="编辑学员信息") String title, Model model){
			return "edittrainee/edittrainee";//对应的界面
		}
}
