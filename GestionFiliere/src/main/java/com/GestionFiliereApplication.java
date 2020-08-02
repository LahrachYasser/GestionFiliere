package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import com.entities.Annee;
import com.entities.Parametrage;
import com.metier.AnneeMetier;
import com.metier.ParametrageMetier;

@SpringBootApplication
public class GestionFiliereApplication implements CommandLineRunner {

	@Autowired
	private AnneeMetier anneeMetier;
	@Autowired
	private ParametrageMetier parametrageMetier;

	public static void main(String[] args) {
		SpringApplication.run(GestionFiliereApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		

	}

}
