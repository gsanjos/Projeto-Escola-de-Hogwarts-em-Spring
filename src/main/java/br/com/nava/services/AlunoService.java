package br.com.nava.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.nava.dtos.AlunoDTO;
import br.com.nava.repositories.AlunoRepository;

@Service
public class AlunoService {

	@Autowired
	public AlunoRepository alunoRepository;
	
	// Método getAll()
	public List<AlunoDTO> getAll() {
		
		List<AlunoEntity> lista = alunoRepository.findAll()
	}
}
