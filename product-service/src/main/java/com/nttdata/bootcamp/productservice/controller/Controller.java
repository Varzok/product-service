package com.nttdata.bootcamp.productservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller{
	
	@Autowired
	Environment environment;
	
	@GetMapping("/port")
	public String getPort() {
		return "El puerto del micro es "+ environment.getProperty("local.server.port");
	}
	
	/*
	@Value("${server.port}")
	private String port;
	
	@GetMapping("/port")
	public String getPort() {
		return "El puerto del micro es "+ port;
	}*/
}