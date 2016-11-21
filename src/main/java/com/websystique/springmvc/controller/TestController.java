package com.websystique.springmvc.controller;

import java.util.Locale;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.websystique.springmvc.model.Register;
import com.websystique.springmvc.model.Web_trainee;
import com.websystique.springmvc.service.RegisterService;
import com.websystique.springmvc.service.TraineeService;

@Controller
@RequestMapping("/")
public class TestController {
	@Autowired
	TraineeService service;
	
	@Autowired
	MessageSource messageSource;
	//编辑学员信息
	@RequestMapping(value= { "/edit-${traineeID}-web_trainees" }, method = RequestMethod.GET)
  
    public String editTrainee(@PathVariable int traineeID, ModelMap model) {
		Web_trainee web_trainee = service.findTraineeById(traineeID);
        model.addAttribute("web_trainee", web_trainee);
        model.addAttribute("edit", true);
        return "addtrainee";
    }
     
    /*
     * This method will be called on form submission, handling POST request for
     * updating employee in database. It also validates the user input
     */
    @RequestMapping(value = { "/edit-${traineeID}-web_trainees"  }, method = RequestMethod.POST)
    public String updateTrainee(@Valid Web_trainee web_trainee, BindingResult result,
            ModelMap model, @PathVariable int traineeID) {
 
        if (result.hasErrors()) {
            return "addtrainee";
        }
 
    
 
        service.updateTrainee(web_trainee);
 
        model.addAttribute("success", web_trainee.getTraineeTrueName()  + " updated successfully");
        return "admaintrainee/success";
    }
 
}
