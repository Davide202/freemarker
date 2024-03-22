package com.test.freemarker;

import com.test.freemarker.application.FreeMarkerService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FreemarkerApplication {

	private final static FreeMarkerService service = new FreeMarkerService();
	public static void main(String[] args) {
		SpringApplication.run(FreemarkerApplication.class, args);

		service.run();

		System.exit(0);
	}

}
