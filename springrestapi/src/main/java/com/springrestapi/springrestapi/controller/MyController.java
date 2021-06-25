package com.springrestapi.springrestapi.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	public String home() {
		
		//controller
		return "This is home controller";
	}
}
