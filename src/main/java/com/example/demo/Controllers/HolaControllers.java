package com.example.demo.Controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaControllers {
	
	@Value("${app.message}")
	String message;
 
	
	@GetMapping("/hola")
	public String hola() {
		System.out.println(message);
		return "Hola";
	}
}
