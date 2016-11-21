package com.websystique.springmvc.controller;



import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.websystique.springmvc.model.Web_trainee;
import com.websystique.springmvc.service.TraineeService;



@Controller
@RequestMapping("/admaintrainee")
public class AdmainTraineeController {
	@Autowired
    TraineeService service; 
    @Autowired
    MessageSource messageSource;
	
    //添加学员信息
	@RequestMapping(value = { "/addtrainee" }, method = RequestMethod.GET)
	public String newRegister(@RequestParam(value="title", required=false, defaultValue="添加用户") String title, Model model){
		Web_trainee web_trainee =new Web_trainee();
		model.addAttribute("web_trainee", web_trainee);
		return "admaintrainee/addtrainee";
	}
	@RequestMapping(value = { "/addtrainee" }, method = RequestMethod.POST)
	public String saveRegister(@Valid Web_trainee web_trainee, BindingResult result,
			ModelMap model) {

		if (result.hasErrors()) {
			return "admaintrainee/addtrainee";
		}
		
		service.addTrainee(web_trainee);
		model.addAttribute("success", web_trainee.getTraineeTrueName() + " add successfully");
		return "admaintrainee/success";
	}
	
	
	//编辑学员信息
	@RequestMapping(value= { "/edit-{traineeID}-web_trainees"}, method = RequestMethod.GET)
    public String editTrainee(@PathVariable int traineeID, ModelMap model) {
		Web_trainee web_trainee = service.findTraineeById(traineeID);
        model.addAttribute("web_trainee", web_trainee);
        model.addAttribute("edit", true);
        return "admaintrainee/edittrainee";
    }
    @RequestMapping(value = { "/edit-{traineeID}-web_trainees" }, method = RequestMethod.POST)
    public String updateTrainee(@Valid Web_trainee web_trainee, BindingResult result,
            ModelMap model, @PathVariable int traineeID) {
 
        service.updateTrainee(web_trainee);
 
        model.addAttribute("success", web_trainee.getTraineeTrueName()  + " updated successfully");
        return "redirect:/admaintrainee/listtrainee";
    }
 
    
    //删除学员
    @RequestMapping(value = {"/delete-{traineeID}-web_trainees"}, method = RequestMethod.GET)
    public String deleteTrainee(@PathVariable int traineeID) {
        service.delTraineeByID(traineeID);;
        return "redirect:/admaintrainee/listtrainee";
    }
    

	//学员信息列表
	@RequestMapping(value="/listtrainee",method = RequestMethod.GET)
	public String listtrainee(ModelMap model){
		List<Web_trainee> web_trainees = service.getAllTrainee();
        model.addAttribute("web_trainees", web_trainees);
		return "admaintrainee/listtrainee";//对应的界面
	}
	
	//条件查询学员
	 @RequestMapping(value = {"/query-web_trainee"}, method = RequestMethod.POST)
     public String queryTrainee(@RequestParam("traineeTrueName") String traineeTrueName,ModelMap model) {
		    Web_trainee web_trainees=service.findTraineeByName(traineeTrueName);
		    model.addAttribute("web_trainees", web_trainees);
	        return "admaintrainee/singletrainee";
	    }
	 

	//批量删除
	 @RequestMapping(value = {"/batchdel-web_trainees"}, method = RequestMethod.POST)
     public String batchDelTrainee(@RequestParam("traineeID") Integer[] traineeIDs,ModelMap model) {
		 service.batchDel(traineeIDs);
	     return "redirect:/admaintrainee/listtrainee";
	    }
}
