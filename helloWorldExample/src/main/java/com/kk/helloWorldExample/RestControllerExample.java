package com.kk.helloWorldExample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerExample {
	
	@GetMapping (value = "/hello")
	public String getHello() {
		return "Hello Example";
	}
}
