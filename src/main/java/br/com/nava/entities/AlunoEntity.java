package br.com.nava.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.modelmapper.ModelMapper;

import br.com.nava.dtos.AlunoDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class AlunoEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nome;
	private String casa;
	
	
	// Método que converte uma Entity em DTO
	public AlunoDTO toDTO() {
		
		ModelMapper mapper = new ModelMapper();
		
		AlunoDTO dto = mapper.map(this, AlunoDTO.class);
		
		return dto;
	}
}







