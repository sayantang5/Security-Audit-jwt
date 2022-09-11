package com.example.demo;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(DemoVotingAppApplication.class);
	}

	//This is some thing new to pull
		// 12--9-2022
	// 12--9-2022
	
	// from test2 for testing
	
	
}
