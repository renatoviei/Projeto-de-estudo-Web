package com.example.exemplo01;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PessoaServiceImp implements PessoaService {
	@Autowired
	private PessoaRepositorio repositorio;

	@Override
	public List<Pessoa> listar() {
		
		return repositorio.findAll();
	}

	@Override
	public Pessoa listarId(int id) {
		throw new UnsupportedOperationException("Não suporttado ainda");
	}

	@Override
	public Pessoa add(Pessoa p) {
		throw new UnsupportedOperationException("Não suporttado ainda");
	}

	@Override
	public Pessoa edit(Pessoa p) {
		throw new UnsupportedOperationException("Não suporttado ainda");
	}

	@Override
	public Pessoa delete(int id) {
		throw new UnsupportedOperationException("Não suporttado ainda");
	}

}
