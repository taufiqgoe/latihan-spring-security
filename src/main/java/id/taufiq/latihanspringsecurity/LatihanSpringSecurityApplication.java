package id.taufiq.latihanspringsecurity;

import id.taufiq.latihanspringsecurity.model.User;
import id.taufiq.latihanspringsecurity.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LatihanSpringSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(LatihanSpringSecurityApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(UserService userService) {
		return args -> {
			userService.save(new User(null, "taufiq", "password"));
		};
	}
}
