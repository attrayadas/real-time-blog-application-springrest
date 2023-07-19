package com.attraya.blog;

import com.attraya.blog.entity.Role;
import com.attraya.blog.repository.RoleRepository;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "Spring Boot Blog App REST APIs",
				description = "Spring Boot Blog App REST APIs Documentation",
				version = "v1.0",
				contact = @Contact(
						name = "Attraya",
						email = "attrayaghoshdas@gmail.com",
						url = "https://www.linkedin.com/in/attrayadas/"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://github.com/attrayadas"
				)
		), externalDocs = @ExternalDocumentation(
				description = "Spring Boot Blog App Documentation",
				url = "https://github.com/attrayadas/real-time-blog-application-springrest"
        )
) // go to: http://localhost:8080/swagger-ui/index.html
public class SpringbootBlogRestApiApplication implements CommandLineRunner {

	@Bean
	public ModelMapper modelMapper(){
		return new ModelMapper();
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBlogRestApiApplication.class, args);
	}

	@Autowired
	private RoleRepository roleRepository;
	@Override
	public void run(String... args) throws Exception {

		Role userRole = new Role();
		userRole.setName("ROLE_USER");
		roleRepository.save(userRole);

		Role adminRole = new Role();
		adminRole.setName("ROLE_ADMIN");
		roleRepository.save(adminRole);

	}
}
