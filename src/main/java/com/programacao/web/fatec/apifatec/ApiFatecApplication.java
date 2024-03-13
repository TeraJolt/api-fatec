package com.programacao.web.fatec.apifatec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.programacao.web.fatec.apifatec.controller.exercicios.AnimalController;


@RestController
@SpringBootApplication
public class ApiFatecApplication {

	@RequestMapping("/")
	String home() {
		return "Hello World";
	}
	/*
	@RequestMapping("/animal/{types}")
	String animal() {
		AnimalController animalController = new AnimalController();
		String types(@PathVariable String types) {
			animalController.getAnimalSounds(null)
			return
		}
		
	}*/
	/*
	@RequestMapping("/hello")
	String home2() {
		return "Hello World 2";
	}
	
	@RequestMapping("/numero")
	Integer numero() {
		return 2;
	}
	
	@RequestMapping("/numero/{num}")
	Integer numero2(
			@PathVariable
			Integer num
			) {
		return num;
	}
	*/
	/*
	@RequestMapping("/analizaIdade")
		String homeAnalizaIdade() {
			return "Insira a idade:"; 
		}
	
	@RequestMapping("/analizaIdade/{idade}")
		
		String AnalizaIdade(@PathVariable int idade) {
			/*try {*/
				/*int idade = Integer.parseInt(idade_string);*/
				
				/*if(idade >= 0 && idade < 12) {
					return "Criança";
				}
				else if(idade >= 12 && idade <= 18) {
					return "Aborrecente";
				}
				else if(idade >= 19 && idade <= 60) {
					return "Adulto";
				}
				else if(idade > 60) {
					return "Idoso";
				}
				else {
					return "Idade inválida";
				}*/
			/*}
			catch(NumberFormatException nf){
				return "Formato errado";
			}
			*/
			
	/*		
	}*/
	public static void main(String[] args) {
		SpringApplication.run(ApiFatecApplication.class, args);
		AnimalController animalController = new AnimalController();
	}

}
