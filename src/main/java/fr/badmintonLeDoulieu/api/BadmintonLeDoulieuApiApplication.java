package fr.badmintonLeDoulieu.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.ArrayList;

@SpringBootApplication
@EnableJpaRepositories
public class BadmintonLeDoulieuApiApplication {
	public static void main(String[] args) {
		SpringApplication.run(BadmintonLeDoulieuApiApplication.class, args);
	}

}
