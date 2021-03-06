package com.nautilus;

import com.calendar.CalendarRequest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.sql.Driver;

@SpringBootApplication
public class NautilusApplication {
	@RequestMapping(value = "/index")
	public String index() {
		return "index";
	}

	public static void main(String[] args) throws IOException, GeneralSecurityException {
		//CalendarRequest.main();
		SpringApplication.run(NautilusApplication.class, args);
	}
}
