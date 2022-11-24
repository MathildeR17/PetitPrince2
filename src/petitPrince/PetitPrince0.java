package petitPrince;

import asteroide.Sujet;
import asteroide.console.ConsoleJavaBoy;

public class PetitPrince0 implements Sujet{
	//attributs
	private String nom;
	private int argent;
	private int cpt;
	ConsoleJavaBoy console = new ConsoleJavaBoy(null);

	//constructeur
	public PetitPrince0(String nom, int argent) {
		this.nom = nom;
		this.argent = argent;
	}

	//méthodes
	@Override
	public String getNom() {
		return this.nom;
	}

	@Override
	public int getArgent() {
		return this.argent;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		console.parler(nom);
		console.seDirigerVers(0);
		
		
	}

}
