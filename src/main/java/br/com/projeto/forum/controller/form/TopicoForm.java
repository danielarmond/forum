package br.com.projeto.forum.controller.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import br.com.projeto.forum.modelo.Curso;
import br.com.projeto.forum.modelo.Topico;
import br.com.projeto.forum.repository.CursoRepository;

public class TopicoForm {

	@NotEmpty
	@NotNull
	private String titulo;
	@NotEmpty
	@NotNull
	private String mensagem;
	@NotEmpty
	@NotNull
	private String nomeCurso;
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	public String getNomeCurso() {
		return nomeCurso;
	}
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	public Topico converter(CursoRepository cursoRepository) {
		Curso curso = cursoRepository.findByNome(nomeCurso);
		return new Topico(titulo, mensagem, curso);
	}
	
	
	
}
