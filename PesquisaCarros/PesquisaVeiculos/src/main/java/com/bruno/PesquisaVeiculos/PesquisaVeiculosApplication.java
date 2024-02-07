package com.bruno.PesquisaVeiculos;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import principal.Principal;

@SpringBootApplication
public class PesquisaVeiculosApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(PesquisaVeiculosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal t = new Principal();
		
		t.principal();
		
	}

}
