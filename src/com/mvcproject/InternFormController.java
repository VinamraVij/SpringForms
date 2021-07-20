package com.mvcproject;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/InternForm")
public class InternFormController
{
	
	public Model theModel;
	Intern intern=new Intern();
	
	InternPrimaryDetails primary= new InternPrimaryDetails();
	@InitBinder
	public void initBinder(WebDataBinder dataBinder)
	{
		StringTrimmerEditor trim=new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, trim);
	}
	@RequestMapping("/FormPart1")
	public String showForm1(Model theModel)
	{
		System.out.println(intern);
		this.theModel=theModel;
		
		theModel.addAttribute("intern",intern);		
		System.out.println(theModel);
		
		theModel.addAttribute("primary",primary);
		return "internship-registration-part1";
	}
	
	
	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("intern") Intern intern,BindingResult internResult,
			@Valid @ModelAttribute("primary") InternPrimaryDetails primary,BindingResult primaryResult)
	{
		System.out.println(intern);
		System.out.println(primary);
		System.out.println(internResult.hasErrors());
		if(internResult.hasErrors()||primaryResult.hasErrors())
		{
			return "internship-registration-part1";
		}
		else
		{
		return "final-check";
		}
	}	
	@RequestMapping("/finalForm")
	public String finalForm(@ModelAttribute("intern") Intern intern)
	{
		System.out.println(intern);
		return "final-confirmation-form";
	}
}
