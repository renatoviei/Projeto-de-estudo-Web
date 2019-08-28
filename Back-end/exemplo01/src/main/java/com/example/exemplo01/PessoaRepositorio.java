package com.example.exemplo01;

import java.util.List;

import org.springframework.data.repository.Repository;



public interface PessoaRepositorio extends Repository<Pessoa, Integer> {
	List<Pessoa>findAll();
	//Pessoa findOne(int id);
	Pessoa save(Pessoa p);
	void delete(Pessoa p);
	
}
