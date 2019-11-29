package com.sample.controller;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sample.model.Customer;
import com.sample.model.Student;

@Controller
@RequestMapping("/customer")
public class CustomController {

	 
	// add intibinder to convert trim input strings
	// remove white spcae
	// resolve issue of our validation
	
	
	@InitBinder
	public void iniBinder(WebDataBinder dataBinder)
	{
		StringTrimmerEditor trimmer=new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, trimmer);
	}
	
	@RequestMapping("/showform")
	public String showForm(Model model)
	{
		//create object
		Customer theCustomer=new Customer();
		model.addAttribute("customer",theCustomer);
		return "customer-form";
	}
	
	
	@RequestMapping("/processform")
	public String processForm(@Valid @ModelAttribute("customer") Customer customer, BindingResult bindingResult) {
		
		System.out.println("Last name is :|"+customer.getLastName()+"|");
		
		System.err.println("The Binding Result: "+bindingResult);
		if(bindingResult.hasErrors())
		{
			return "customer-form";
		}
		else
		{
			return "customer-confirmation";
		}
		
	}
	
}
