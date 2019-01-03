package com.java.excell.api.projektexcellapi;

import com.java.excell.api.projektexcellapi.excellService.ExcellService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.io.IOException;
@SpringBootApplication
public class ProjektExcellApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjektExcellApiApplication.class, args);
	}
}

