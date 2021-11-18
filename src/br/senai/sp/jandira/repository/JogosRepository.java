package br.senai.sp.jandira.repository;

import br.senai.sp.jandira.model.Jogo;

public class JogosRepository {
	
private Jogo[] colecao;
	
	public JogosRepository() {
		
		colecao = new Jogo[3];
		
	}
	
	public JogosRepository(int tamanhoDaColecao) {
		
		colecao = new Jogo[tamanhoDaColecao];
		
	}
	
	public void gravar(Jogo jogo, int NumeroDoJogo) {
		
		colecao[NumeroDoJogo] = jogo;
		
	}
	
	public Jogo listarJogo(int posicao) {
		
		return colecao[posicao];
		
	}
	
	public Jogo[] listarTodos() {
		
		return colecao;
		
	}
	
	public int getTamanhoColecao() {
		
		return colecao.length;
		
	}
	

}
