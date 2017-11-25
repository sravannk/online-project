package com.onlineweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	
	@RequestMapping(value= {"/","/index","/home"})
	public ModelAndView index()
	{
		ModelAndView mav=new ModelAndView("page");
		mav.addObject("greeting","this is pagecontroller");
		return mav;
	}
	

}
