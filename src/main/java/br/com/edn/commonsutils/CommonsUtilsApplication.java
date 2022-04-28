package br.com.edn.commonsutils;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CommonsUtilsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CommonsUtilsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	}

}
