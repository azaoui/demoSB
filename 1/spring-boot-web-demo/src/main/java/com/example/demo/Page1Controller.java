package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * controller which will be called when an HTTP request is made.. /hello1
 */

@RestController
public class Page1Controller {
	@RequestMapping("/page1")
	public String page1() {
		return "page1";
	}

}
