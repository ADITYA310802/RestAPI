package com.jpa.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class testController {
	
	@RequestMapping("/test")
	@ResponseBody
	public String test()
	{
		int a=7;
		int b=38;
		
		return "This is testing\t sum of a and b is="+(a+b);
	}

}
