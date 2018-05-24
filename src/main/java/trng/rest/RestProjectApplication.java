package trng.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;



@SpringBootApplication
public class RestProjectApplication {

	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(RestProjectApplication.class);
	}
	public static void main(String[] args) {
		SpringApplication.run(RestProjectApplication.class, args);
	}
}
