package br.com.nava.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.nava.dtos.AlunoDTO;
import br.com.nava.services.AlunoService;

@RestController
@RequestMapping("alunos")
public class AlunoController {

	@Autowired
	public AlunoService alunoService;
	
	// Método getAll()
	@GetMapping("")
	public ResponseEntity<List<AlunoDTO>> getAll() {
		return ResponseEntity.status(HttpStatus.OK).body(alunoService.getAll());
	}
	
	// Método getOene()
	@GetMapping("{id}")
	public ResponseEntity<AlunoDTO> getOne(@PathVariable Integer id) {
		return ResponseEntity.status(HttpStatus.OK).body(alunoService.getOne(id));
	}
	
	// Método save()
	@PostMapping("")
	public ResponseEntity<AlunoDTO> save(@RequestBody AlunoDTO aluno) {
		return ResponseEntity.status(HttpStatus.OK).body(alunoService.save(aluno.toEntity()));
	}
	
	// Método update()
	@PatchMapping("{id}")
	public ResponseEntity<AlunoDTO> update(@PathVariable int id, @RequestBody AlunoDTO aluno) {
		return ResponseEntity.status(HttpStatus.OK).body(alunoService.update(id, aluno.toEntity()));
	}
	
	// Método delete()
	@DeleteMapping("{id}")
	public void delete(@PathVariable int id){
		alunoService.delete(id);
	}
}
