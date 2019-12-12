package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AllienController {

	@RequestMapping(value="/home")
	public ModelAndView runAl(Alien al)
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("index");
        mv.addObject("obj",al);
		return mv;
	}
}
