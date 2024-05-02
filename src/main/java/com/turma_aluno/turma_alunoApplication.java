package com.turma_aluno;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class turma_alunoApplication {

	public static void main(String[] args) {
		SpringApplication.run(turma_alunoApplication.class, args);
	}
}
