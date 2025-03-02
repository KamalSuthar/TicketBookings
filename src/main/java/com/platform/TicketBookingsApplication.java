package com.platform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.platform.controller",
		"com.platform.config",
		"com.platform.entity",
		"com.platform.repository",
		"com.platform.request",
		"com.platform.response",
		"com.platform.service"})
public class TicketBookingsApplication {

	public static void main(String[] args) {
		SpringApplication.run(TicketBookingsApplication.class, args);
	}

}
