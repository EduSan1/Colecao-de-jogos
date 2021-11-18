package br.senai.sp.jandira.repository;

import java.util.Arrays;

import br.senai.sp.jandira.model.Fabricante;

public class FabricanteRepository {
	
	private Fabricante[] fabricante;
	
	public FabricanteRepository() {
		
		fabricante = new Fabricante[3];
		Fabricante activision = new Fabricante();
		activision.setNome("Activision");
		activision.setCriacao("1 de outubro de 1979");
		activision.setCriador("David Crane, Alan Miller , Bob Whitehead, Jim Levy, Richard Muchmore");
		fabricante[0] = activision;
		
		Fabricante rockStar = new Fabricante();
		rockStar.setNome("RockStar Games");
		rockStar.setCriacao("1994");
		rockStar.setCriador("Sam Houser");
		fabricante[1] = rockStar;

		Fabricante riot = new Fabricante();
		riot.setNome("Riot Games");
		riot.setCriacao("setembro de 2006");
		riot.setCriador("Brandon Beck, Marc Merrill");
		fabricante[2] = riot;
		
	}
	
	public Fabricante[] getFabricante() {
		return fabricante;
	}
	
	public Fabricante getFabricante(int index) {
		return fabricante[index];
	}
	
	public int getIndex(Fabricante fabricante) {
	
		int getIndex = Arrays.asList(this.fabricante).indexOf(fabricante);
		
		return getIndex;
		
	}
	

}	
