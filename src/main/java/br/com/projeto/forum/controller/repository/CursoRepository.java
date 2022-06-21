package br.com.projeto.forum.controller.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projeto.forum.modelo.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long>{

	Curso findByNome(String nome);

}
