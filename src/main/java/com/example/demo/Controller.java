package com.example.demo;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.stereotype.Controller
@EnableAutoConfiguration
public class Controller {

	@RequestMapping("/hello")
	@ResponseBody
	public String sayHello() {
		return "Hello Welcome to Spring Boot World!!!";
	}
}
