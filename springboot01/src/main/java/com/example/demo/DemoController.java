package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class DemoController {
  
	//http://localhost:8090/

	@ResponseBody
	@RequestMapping("/")
	public String home() {
		System.out.println("Hello Boot!!");
		return "Hello Boot!!";
	}
	
	//http://localhost:8090/hello.do
	@RequestMapping("/hello.do")
	public String hello(Model model) {
		System.out.println("model");
		model.addAttribute("message", "hello입니다.");
		return "hello";
		
	}
}







