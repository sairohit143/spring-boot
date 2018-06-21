package com.example.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * rest controller will return the helloworld to localhost
 */
@RestController
public class HelloWorld {
	/*
	 *the requestmapping is used to map web requests onto helloworld class on localhost 
	 */
	@RequestMapping("/helloworld")
	public String sayHi()
	{
		return "hello world";
	}
}
