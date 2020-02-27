package com.stacksimplify.restservices.Hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloWorldController {

	//@RequestMapping(method=RequestMethod.GET,path="/hello-world")
	
	@GetMapping("/hello-world1")
	public String helloWorld()
	{
		return"Hello World";
	}
	
	@GetMapping("/hello-world1-bean")
	public UserDetails helloWorldBean()
	{
		return new UserDetails("Gayathri","Rajan","Delhi");
	}
	
	
}
