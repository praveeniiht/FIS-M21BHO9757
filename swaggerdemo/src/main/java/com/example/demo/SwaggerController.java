package com.example.demo;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api")
public class SwaggerController {
	
	@GetMapping("/read")
	public String read() {
		return "Get Mapping of read url";
	}
	
	@GetMapping("/post")
	public String posts() {
		return "Get Mapping of Post url";
	}
	
	@PostMapping("/read")
	public String postread() {
		return "Post mapping of read url";
	}
	
	@PostMapping("/post")
	public String postposts() {
		return "Post mapping of post url";
	}
	
	@GetMapping("/test")
	public String test() {
		return "testing ";
		
	}

}
