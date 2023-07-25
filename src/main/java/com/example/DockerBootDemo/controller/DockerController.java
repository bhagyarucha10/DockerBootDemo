package com.example.DockerBootDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {

	
	@GetMapping(value="/say")
	public String sayHello()
	{
		return "welcome to spring Boot App deployed on docker";
	}
}
