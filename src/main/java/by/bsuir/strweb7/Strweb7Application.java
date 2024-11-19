package by.bsuir.strweb7;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Strweb7Application {
	public static void main(String[] args) {
		SpringApplication.run(Strweb7Application.class, args);
	}
}