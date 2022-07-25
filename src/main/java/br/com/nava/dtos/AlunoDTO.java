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
	
	// Método que converte um DTO em Entity
	public AlunoEntity toEntity() {
		
		ModelMapper mapper = new ModelMapper();
		
		return mapper.map(this, AlunoEntity.class);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCasa() {
		return casa;
	}

	public void setCasa(String casa) {
		this.casa = casa;
	}

	public AlunoDTO(int id, String nome, String casa) {
		super();
		this.id = id;
		this.nome = nome;
		this.casa = casa;
	}

	public AlunoDTO() {
		
	}
}


