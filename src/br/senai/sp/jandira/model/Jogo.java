package br.senai.sp.jandira.model;

public class Jogo {
	
	private String titulo;
	private Fabricante frabricante;
	private boolean zerado;
	private Plataforma plataforma;
	private double valor;
	private String observacoes;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Fabricante getFrabricante() {
		return frabricante;
	}

	public void setFrabricante(Fabricante frabricante) {
		this.frabricante = frabricante;
	}

	public boolean isZerado() {
		return zerado;
	}

	public void setZerado(boolean zerado) {
		this.zerado = zerado;
	}

	public Plataforma getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(Plataforma plataforma) {
		this.plataforma = plataforma;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

}
