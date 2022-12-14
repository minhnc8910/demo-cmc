package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class DemoSeApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoSeApplication.class, args);
    }

    @Bean
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

//    @Bean
//    CommandLineRunner run(AppUserService userService) {
//        return args -> {
//            userService.saveRole(new Role(null, "ROLE_USER"));
//            userService.saveRole(new Role(null, "ROLE_MANAGER"));
//            userService.saveRole(new Role(null, "ROLE_ADMIN"));
//            userService.saveRole(new Role(null, "ROLE_SUPPER_ADMIN"));
//
//            userService.saveUser(new User(null, "John Travolta", "john", "1234", new ArrayList<>()));
//            userService.saveUser(new User(null, "Will Smith", "will", "1234", new ArrayList<>()));
//            userService.saveUser(new User(null, "Jim Carry", "jim", "1234", new ArrayList<>()));
//            userService.saveUser(new User(null, "Arnold Schwarzenegger", "arnold", "1234", new ArrayList<>()));
//
//            userService.addRoleToUser("john", "ROLE_USER");
//            userService.addRoleToUser("john", "ROLE_MANAGER");
//            userService.addRoleToUser("will", "ROLE_MANAGER");
//            userService.addRoleToUser("jim", "ROLE_ADMIN");
//            userService.addRoleToUser("arnold", "ROLE_SUPPER_ADMIN");
//            userService.addRoleToUser("arnold", "ROLE_ADMIN");
//            userService.addRoleToUser("arnold", "ROLE_USER");
//        };
//    }

}
