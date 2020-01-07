package com.stacksimplify.restservices.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	//@RequestMapping(method = RequestMethod.GET,path="/helloworld")
	@GetMapping("/helloworld1")
	public String helloWorld() {
		return "hello world1";
	}
	
	@GetMapping("/helloworld-bean")
	public UserDetails  HelloWolrdBean() {
		
		return new UserDetails("nhlanhla","dhlamini","pretoria");
	}
}
