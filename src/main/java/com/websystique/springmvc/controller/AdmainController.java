package com.websystique.springmvc.controller;



import java.awt.Image;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.websystique.springmvc.model.Web_user;
import com.websystique.springmvc.service.UserService;


@Controller
@RequestMapping("/admain")
public class AdmainController {
	
	@Autowired
    UserService service;
    @Autowired
    MessageSource messageSource;
	
	@RequestMapping(value = {"/admain"}, method = RequestMethod.GET)
	 public String newMain(@RequestParam(value="title", required=false, defaultValue="美勤后台主页") String title, Model model){
	    	model.addAttribute("title", title);
	    	return "admain/admain";
	    }
	@RequestMapping(value = {"/login"}, method = RequestMethod.GET)
	 public String login(@RequestParam(value="title", required=false, defaultValue="登录") String title, Model model){
	    	model.addAttribute("title", title);
	    	return "admain/login";
	    }
	 @RequestMapping(value = {"/dologin"}, method = RequestMethod.POST)
	 public String queryTrainee(@RequestParam("userName") String userName,@RequestParam("userPassword") String userPassword) {
			    Web_user entity=service.findUser(userName, userPassword);
			    if(entity!=null){
			    	return "admain/admain";
			    }
			    else{
			    	return "admain/login";
			    }
			    
		    }
	 @RequestMapping(value = {"/getVerify"}, method = RequestMethod.POST)
	 public String getVerify() {
		int width=80;
		int height=28;
		int codecount=4;
		String fontStyle="Times New Roman";
		
		return null;
			   
			    
		    }
	

}
