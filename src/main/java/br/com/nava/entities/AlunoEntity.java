package br.com.nava.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.modelmapper.ModelMapper;

import br.com.nava.dtos.AlunoDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="ALUNOS")
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

	public AlunoEntity(int id, String nome, String casa) {
		super();
		this.id = id;
		this.nome = nome;
		this.casa = casa;
	}

	public AlunoEntity() {
		
	}
}







