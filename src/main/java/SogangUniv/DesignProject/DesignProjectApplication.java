package SogangUniv.DesignProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:env.yml")
public class DesignProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesignProjectApplication.class, args);
	}

}
