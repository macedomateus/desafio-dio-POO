package br.com.dio.desafio.dominio;

public class Curso {
	private String titulo;
	private String descricao;
	private int cargaHoraria;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getCargaHorario() {
		return cargaHoraria;
	}

	public void setCargaHorario(int cargaHorario) {
		this.cargaHoraria = cargaHorario;
	}
	
	@Override
	public String toString() {
		return "Curso [titulo=" + titulo + ", descricao=" + descricao + ", cargaHoraria=" + cargaHoraria + "]";
	}
}
