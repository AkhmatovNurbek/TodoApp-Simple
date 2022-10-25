package uz.proj.todoapp.todoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.security.crypto.password.PasswordEncoder;


@SpringBootApplication
public class TodoappApplication {

    public static void main(String[] args) {
        SpringApplication.run(TodoappApplication.class, args);
    }

//    @Bean
//    CommandLineRunner runner(AuthUserRepository authUserRepository, PasswordEncoder passwordEncoder) {
//        return (args) -> {
//            authUserRepository.deleteAll();
//            AuthUser admin = AuthUser.builder()
//                    .username("admin")
//                    .password(passwordEncoder.encode("123"))
//                    .role(AuthUser.UserRole.ADMIN).build();
//            AuthUser manager = AuthUser.builder()
//                    .username("manager")
//                    .password(passwordEncoder.encode("123"))
//                    .role(AuthUser.UserRole.MANAGER).build();
//            AuthUser user = AuthUser.builder()
//                    .username("user")
//                    .password(passwordEncoder.encode("123"))
//                    .role(AuthUser.UserRole.USER).build();
//            authUserRepository.saveAll(List.of(admin, manager, user));
//        };
//    }

}
