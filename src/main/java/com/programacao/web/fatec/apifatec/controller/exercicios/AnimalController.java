package com.programacao.web.fatec.apifatec.controller.exercicios;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnimalController {

	@GetMapping("/animal/{types}")
	public List<String> getAnimalSounds(@PathVariable String[] types) {
		List<String> sounds = new ArrayList<>();
		for (String type : types) {
			sounds.add(getSoundByAnimalType(type));
		}
		return sounds;
	}
	
	private String getSoundByAnimalType(String type) {
		switch (type.toLowerCase()) {
		case "cachorro":
			return "AuAu";
		case "gato":
			return "Miauu";
		case "vaca":
			return "Moo";
		default:
			return "animal desconhecido";
		}
	}
}
