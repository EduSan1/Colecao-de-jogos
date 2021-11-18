package br.senai.sp.jandira.model;

public class Jogo {
	
	private String titulo;
	private String frabricante;
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

	public String getFrabricante() {
		return frabricante;
	}

	public void setFrabricante(String frabricante) {
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

	public void setValor(String valor) {
		double valorDouble =  Double.parseDouble(valor);
		this.valor = valorDouble;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

}
