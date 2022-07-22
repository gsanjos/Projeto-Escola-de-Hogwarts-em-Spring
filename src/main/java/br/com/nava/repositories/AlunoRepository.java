package br.com.nava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.nava.entities.AlunoEntity;

public interface AlunoRepository extends JpaRepository<AlunoEntity, Integer>{

}
