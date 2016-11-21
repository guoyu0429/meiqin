package com.websystique.springmvc.controller;
import java.util.List;
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
import com.websystique.springmvc.service.RegisterService;

@Controller
@RequestMapping("/")
public class RegisterController {
	@Autowired
	RegisterService service;
	
	@Autowired
	MessageSource messageSource;
	
	/*
	 * This method will provide the medium to add a new register.
	 */
	@RequestMapping(value = { "/register" }, method = RequestMethod.GET)
	public String newRegister(@RequestParam(value="title", required=false, defaultValue="зЂВс") String title, Model model){
		
		Register register = new Register();
		model.addAttribute("register", register);
		return "register/register";
	}
	/*
	 * This method will be called on form submission, handling POST request for
	 * saving register in database. It also validates the user input
	 */
	@RequestMapping(value = { "/register" }, method = RequestMethod.POST)
	public String saveRegister(@Valid Register register, BindingResult result,
			ModelMap model) {

		if (result.hasErrors()) {
			return "register/register";
		}
		/*
		 * Preferred way to achieve uniqueness of field [loginname] should be implementing custom @Unique annotation 
		 * and applying it on field [loginname] of Model class [Register].
		 * 
		 * Below mentioned peace of code [if block] is to demonstrate that you can fill custom errors outside the validation
		 * framework as well while still using internationalized messages.
		 * 
		 */
		if(!service.isRegisterLoginnameUnique(register.getId(), register.getLoginname())){
			FieldError loginError =new FieldError("register","loginname",messageSource.getMessage("non.unique.loginname", new String[]{register.getLoginname()}, Locale.getDefault()));
		    result.addError(loginError);
			return "register/register";
		}
		
		service.saveRegister(register);

		model.addAttribute("success", "Register " + register.getLoginname() + " registered successfully");
		return "register/success";
	}
}
