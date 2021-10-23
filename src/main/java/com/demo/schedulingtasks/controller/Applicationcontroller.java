package com.demo.schedulingtasks.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.schedulingtasks.model.ApplicationForm;
import com.demo.schedulingtasks.service.ApplicationServiceImp;

@RestController
@RequestMapping("ApplicationForm")
public class Applicationcontroller {
	
		@Autowired
		private ApplicationServiceImp appliService;

		@GetMapping("/applicationData")
		List<ApplicationForm> getApplication() {
			return appliService.findAll();
		}
		
		@RequestMapping(value = "save", method = RequestMethod.POST)
		public String save(@ModelAttribute("ApplicationForm") ApplicationForm appliForm, int age, boolean insurance, boolean tabacco) {
			if(age >=18 && insurance == false && tabacco == false) {
			appliService.update(appliForm);
			return "appliForm/Approved";
			}
			return "appliForm/Rejected";
		}
}