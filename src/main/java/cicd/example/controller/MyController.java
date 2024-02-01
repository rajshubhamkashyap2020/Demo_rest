package cicd.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class MyController {
	
	
	@GetMapping("/test-docker")
	public String getData() {
		return "inside docker";
		
		
	}

}
