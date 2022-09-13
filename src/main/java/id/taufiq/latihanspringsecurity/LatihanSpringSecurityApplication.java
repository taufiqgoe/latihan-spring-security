package id.taufiq.latihanspringsecurity;

import id.taufiq.latihanspringsecurity.model.Role;
import id.taufiq.latihanspringsecurity.model.User;
import id.taufiq.latihanspringsecurity.service.RoleService;
import id.taufiq.latihanspringsecurity.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Set;

@SpringBootApplication
public class LatihanSpringSecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(LatihanSpringSecurityApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(UserService userService, RoleService roleService) {
        return args -> {
            Role roleUser = roleService.save(new Role(null, "USER"));
            Role roleAdmin = roleService.save(new Role(null, "ADMIN"));

            userService.save(new User(null, "user", "user", Set.of(roleUser)));
            userService.save(new User(null, "admin", "admin", Set.of(roleUser, roleAdmin)));
        };
    }
}
