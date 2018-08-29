package LibrarIO;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import controllers.UserController;

@Configuration
@ComponentScan(basePackages = {"controllers.UserController", "models.UserModel", "repositories.UserRepository"},
        basePackageClasses = UserController.class)
@SpringBootApplication
public class LibrarIoApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(LibrarIoApplication.class, args);

		
		
	}
}
