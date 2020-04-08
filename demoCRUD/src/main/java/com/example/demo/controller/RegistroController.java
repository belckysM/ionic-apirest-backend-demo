package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.models.Equipos;
import com.example.demo.entity.services.IRegistroService;


@RestController

public class RegistroController {

	@Autowired
	IRegistroService registroService;
	@GetMapping("/equipos")
	public List<Equipos> getAllEquipos(){
		return registroService.getAll();
	}
	
	@GetMapping("/equipos/{id}")
	public Equipos getOne(@PathVariable(value = "id") long id) {
		return registroService.get(id);
	}
	
	@PostMapping("/equipos")
	public void add(Equipos equipos) {
		registroService.post(equipos);
	}
	
	@PutMapping("/equipos/{id}")
	public void update(Equipos equipos, @PathVariable(value = "id") long id) {
		registroService.put(equipos, id);
	}
	
	@DeleteMapping("/equipos/{id}")
	public void update(@PathVariable(value = "id") long id) {
		registroService.delete(id);
	}
}
