package com.sample.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sample.model.Student;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@Value("#{cityOptions}") 
	private Map<String, String> cityOptions;

	@RequestMapping("/showform")
	public String showForm(Model model)
	{
		//create object
		Student theStudent=new Student();
		model.addAttribute("student",theStudent);
		model.addAttribute("theCountryOptions", cityOptions);
		return "student-form";
	}
	
	@RequestMapping("/processform")
	public String processForm(@ModelAttribute("student") Student student) {
		System.err.println(student.getFirstName());
		return "student-confirmation";
	}
}
