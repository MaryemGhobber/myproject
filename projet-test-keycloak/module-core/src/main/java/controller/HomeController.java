package controller;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@PostConstruct
	public void init() {
		System.out.println("HomeController initialized!");
	}

	@GetMapping("/hello")
	public String hello() {
		return "Hello, Public!";
	}

	@GetMapping("/admin")
	public String admin() {
		return "Hello, Admin!";
	}

	@GetMapping("/user")
	public String user() {
		return "Hello, User!";
	}
}