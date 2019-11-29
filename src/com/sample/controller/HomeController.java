package com.sample.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	@RequestMapping("/") // root URL path
	public String mainWebPage()
	{
		System.err.println("Entering");
		return "MainPage";
		
	}
	
	
	//need a controller method to show initial html page
	@RequestMapping("/showForm")
	public String showform()
	{
	return "helloworld-form";	
	}
	
	//need a contoller method to process the html page
	@RequestMapping("/processForm")
	public String processForm()
	{
		return "helloworld";
	}
	
	// new controller method to read form data
	//add data to the model
	@RequestMapping("/prcessModelForm")
	public String prcessModelForm(HttpServletRequest request,Model model)
	{
		//read request parameter from the HTML form
		String theName=request.getParameter("studentName");
		// convert to upper case
		theName=theName.toUpperCase();
		//create msg
		String result= "yo ! "+theName;
		//add message to the model
		model.addAttribute("msg", result);
		return "helloworld";
	}
	
	// new controller method to read form data with RequestParam
	//add data to the model
	@RequestMapping("/prcessModelFormparam")
	public String prcessModelForm(@RequestParam("studentName") String theName,Model model)
	{
		// convert to upper case
		theName=theName.toUpperCase();
		//create msg
		String result= "yo Request param ! "+theName;
		//add message to the model
		model.addAttribute("msg", result);
		return "helloworld";
	}
	
}
