package com.sandeep.helloworld.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sandeep.helloworld.service.HelloWorldService;

@Controller
public class WelcomeController {
	private final HelloWorldService helloWorldService;
	
	@Autowired
	public WelcomeController(HelloWorldService helloWorldService)
	{
		this.helloWorldService = helloWorldService;
	}
	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public String index()
	{
		return "hello-world";
	}
	
//	@RequestMapping(value="/", method = RequestMethod.GET)
//	public ModelAndView hello()
//	{
//		
//	}

}
