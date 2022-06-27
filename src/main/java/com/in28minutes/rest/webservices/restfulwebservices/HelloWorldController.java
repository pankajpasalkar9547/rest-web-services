package com.in28minutes.rest.webservices.restfulwebservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	@GetMapping(path="/hello-world")
	//@RequestMapping(method = RequestMathod.GET,path="/hello-world")
	public String helloWorld()
	{
		return "Pankaj P.";
	}
	
	@GetMapping(path="/hello-world-bean")
	//@RequestMapping(method = RequestMathod.GET,path="/hello-world")
	public HelloWorldBean helloWorldBean()
	{
		return new HelloWorldBean("Pankaj Pasalkar");
	}

}
