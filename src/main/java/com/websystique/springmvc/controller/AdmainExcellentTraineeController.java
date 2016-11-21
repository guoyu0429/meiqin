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

import com.websystique.springmvc.model.Web_excellent_trainee;
import com.websystique.springmvc.model.Web_trainee;
import com.websystique.springmvc.service.ExcellentTraineeService;

@Controller
@RequestMapping("/admainexcellent")
public class AdmainExcellentTraineeController {
	@Autowired
	ExcellentTraineeService service;
	@Autowired
    MessageSource messageSource;
   
	
	//添加优秀学员信息
	@RequestMapping(value = { "/addexcellenttrainee" }, method = RequestMethod.GET)
	public String newRegister(@RequestParam(value="title", required=false, defaultValue="添加用户") String title, Model model){
		Web_excellent_trainee web_excellent_trainee =new Web_excellent_trainee();
		model.addAttribute("web_excellent_trainee", web_excellent_trainee);
		return "admainexcellent/addexcellenttrainee";
	}
	@RequestMapping(value = { "/addexcellenttrainee" }, method = RequestMethod.POST)
	public String saveRegister(@Valid Web_excellent_trainee web_excellent_trainee, BindingResult result,
			ModelMap model) {

		if (result.hasErrors()) {
			return "admainexcellent/addexcellenttrainee";
		}
		service.addExcellentTrainee(web_excellent_trainee);
		model.addAttribute("success", web_excellent_trainee.getExcellentTrueName() + "add successfully");
		return "admainexcellent/success";
	}
		
	
	//修改优秀学员信息
	@RequestMapping(value= { "/edit-{excellentID}-web_excellent_trainees"}, method = RequestMethod.GET)
    public String editExcellentTrainee(@PathVariable int excellentID, ModelMap model) {
		Web_excellent_trainee web_excellent_trainee=service.findExcellentTraineeById(excellentID);
        model.addAttribute("web_excellent_trainee", web_excellent_trainee);
        model.addAttribute("edit", true);
        return "admainexcellent/editexcellenttrainee";
    }
    @RequestMapping(value = { "/edit-{excellentID}-web_excellent_trainees" }, method = RequestMethod.POST)
    public String updateExcellentTrainee(@Valid Web_excellent_trainee web_excellent_trainee, BindingResult result,
            ModelMap model, @PathVariable int excellentID) {
 
        service.updateExcellentTrainee(web_excellent_trainee);
 
        model.addAttribute("success", web_excellent_trainee.getExcellentTrueName() + " updated successfully");
        return "redirect:/admainexcellent/listexcellenttrainee";
    }
 
	
  //删除优秀学员
    @RequestMapping(value = {"/delete-{excellentID}-web_excellent_trainees"}, method = RequestMethod.GET)
    public String deleteExcellentTrainee(@PathVariable int excellentID) {
        service.delExcellentTraineeByID(excellentID);
        return "redirect:/admainexcellent/listexcellenttrainee";
    }
	
	//优秀学员信息列表
	@RequestMapping(value="/listexcellenttrainee",method = RequestMethod.GET)
	public String listtrainee(ModelMap model){
		List<Web_excellent_trainee> web_excellent_trainees = service.getAllExcellentTrainee();
	    model.addAttribute("web_excellent_trainees", web_excellent_trainees);
		return "admainexcellent/listexcellenttrainee";//对应的界面
		}
	
	//条件查询优秀学员
	 @RequestMapping(value = {"/query-web_excellent_trainee"}, method = RequestMethod.POST)
	  public String queryExcellentTrainee(@RequestParam("excellentTrueName") String excellentTrueName,ModelMap model) {
		Web_excellent_trainee web_excellent_trainees=service.findExcellentTraineeByName(excellentTrueName);
		model.addAttribute("web_excellent_trainees", web_excellent_trainees);
	    return "admainexcellent/singleexcellenttrainee";
		    }
	 
	 
		//批量删除
	 @RequestMapping(value = {"/batchdel-web_excellent_trainees"}, method = RequestMethod.POST)
     public String batchDelExcellentTrainee(@RequestParam("excellentID") Integer[] excellentIDs,ModelMap model) {
		 service.batchDel(excellentIDs);
	     return "redirect:/admainexcellent/listexcellenttrainee";
	    }
}
