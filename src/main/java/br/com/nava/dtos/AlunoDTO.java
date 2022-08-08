package br.com.nava.dtos;

import org.modelmapper.ModelMapper;

import br.com.nava.entities.AlunoEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AlunoDTO {

	private int id;
	private String nome;
	private String casa;
	private String email;
	
	// Método que converte um DTO em Entity
	public AlunoEntity toEntity() {
		
		ModelMapper mapper = new ModelMapper();
		
		return mapper.map(this, AlunoEntity.class);
	}

}


