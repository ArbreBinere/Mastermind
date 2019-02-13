package mastermind;

import java.awt.Color;

public class Modele {
	public static Color[] COULEURS = {Color.yellow, Color.green, Color.blue, Color.magenta, Color.red, Color.orange, Color.white, Color.black};
	public static int nb_tenta;
	public static int diff;
	public static enum Etat { EN_COURS, GAGNE, PERDU };
	
	public Modele() {
		this.diff = 4;
		this.nb_tenta = 10;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
