package br.senai.sp.jandira.model;

public enum Plataforma {
	
	PC("Computador"),
	XBOXONE("Xbox ONE"),
	XBOX360("Xbox 360"),
	XBOXSERIESS ("Xbox Series S"),
	XBOXSERIESX ("Xbox Series X"),
	PLAYSTATION1("PlayStation 1"),
	PLAYSTATION2("PlayStation 2"),
	PLAYSTATION3("PlayStation 3"),
	PLAYSTATION4("PlayStation 4"),
	PLAYSTATION5("PlayStation 5"),
	SWITCH("Nintendo Switch");
	
	private String descricao;
	
	private Plataforma(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		
		return descricao;
	}

}
