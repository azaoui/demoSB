package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * controller which will be called when an HTTP request is made.. /hello
 */
@RestController
public class HomeController {
	@RequestMapping("/hello")
	public String hello() {
		return "Hello!";
	}
}