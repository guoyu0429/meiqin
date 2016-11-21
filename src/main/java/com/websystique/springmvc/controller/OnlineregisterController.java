package com.websystique.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class OnlineregisterController {
	@RequestMapping(value = { "/onlineregister" }, method = RequestMethod.GET)
	 public String newMain(@RequestParam(value="title", required=false, defaultValue="ÃÀÇÚÖ÷Ò³") String title, Model model){
	    	model.addAttribute("title", title);
	    	return "onlineregister/onlineregister";
	    }
}
