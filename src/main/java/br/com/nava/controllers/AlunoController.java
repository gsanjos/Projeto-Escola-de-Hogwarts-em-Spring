package br.com.nava.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
	public List<AlunoDTO> getAll() {
		return alunoService.getAll();
	}
}
