package br.com.nava.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.nava.dtos.AlunoDTO;
import br.com.nava.entities.AlunoEntity;
import br.com.nava.repositories.AlunoRepository;

@Service
public class AlunoService {

	@Autowired
	public AlunoRepository alunoRepository;
	
	// Método getAll()
	public List<AlunoDTO> getAll() {
		
		List<AlunoEntity> lista = alunoRepository.findAll();
		
		List<AlunoDTO> listaDTO = new ArrayList<>();
		
		for(AlunoEntity alunoEntity : lista) {
			listaDTO.add(alunoEntity.toDTO());
		}
		
		return listaDTO;
	}
	
	// Método getOne()
	public AlunoDTO getOne(int id) {
		
		Optional <AlunoEntity> optional = alunoRepository.findById(id);
		
		AlunoEntity aluno = optional.orElse(new AlunoEntity());
		
		return aluno.toDTO();
	}
	
	// Método save()
	public AlunoDTO save(AlunoEntity aluno) {
		
		return alunoRepository.save(aluno).toDTO();
	}
	
	// Método update()
	public AlunoDTO update(int id, AlunoEntity aluno) {
		
		Optional<AlunoEntity> optional =  alunoRepository.findById(id);
		
		if(optional.isPresent() == true) {
			AlunoEntity alunoDB = optional.get();
			alunoDB.setNome(aluno.getNome());
			alunoDB.setCasa(aluno.getCasa());
			
			return alunoRepository.save(alunoDB).toDTO();
		}
		else {
			return new AlunoEntity().toDTO();
		}
	}
	
	// Método delete()
	public void delete(int id) {
		alunoRepository.deleteById(id);
	}
	
}



















