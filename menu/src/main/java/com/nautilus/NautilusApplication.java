package com.nautilus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//@Controller
@SpringBootApplication
public class NautilusApplication {
	@RequestMapping(value = "/index")
	public String index() {
		return "index";
	}

	public static void main(String[] args) {
		SpringApplication.run(NautilusApplication.class, args);
	}

}
