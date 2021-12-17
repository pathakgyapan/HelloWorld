package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class AppConfiguration {
	
@RequestMapping("/hello")
public String hello()

{
	return "Hello World!";
	//when you mention /hello in url, it has to return hello gyapan
	//@restcontroller::: for URL
	
}
}
