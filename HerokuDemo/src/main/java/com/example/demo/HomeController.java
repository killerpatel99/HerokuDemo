package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/home")
	public String Hello() {
		return "Hello, this page is hosted by smit kalavadiya!!";
	}
	
}
