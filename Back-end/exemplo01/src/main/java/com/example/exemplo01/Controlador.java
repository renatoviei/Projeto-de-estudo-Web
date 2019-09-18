package com.example.exemplo01;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("exemplo01/pessoas")
public class Controlador {
	
	@Autowired
	PessoaService service;
	
	@GetMapping
	public List<Pessoa> listar(){
		return service.listar();
	}
	
	@PostMapping
	public Pessoa salvar(@RequestBody Pessoa p){
		return service.add(p);
	}
}
