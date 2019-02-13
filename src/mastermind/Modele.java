package mastermind;

import java.awt.Color;
import java.util.Random;

public class Modele {
	public static Color[] COULEURS = {Color.yellow, Color.green, Color.blue, Color.magenta, Color.red, Color.orange, Color.white, Color.black};
	public static int nb_tenta;
	public static int diff;
	public static enum Etat { EN_COURS, GAGNE, PERDU };
	public Etat etat;
	public Rangee Combinaison;
	public Rangee[] propositions;
	public int tentative;
	
	public Modele() {
		this.diff = 4;
		this.nb_tenta = 10;
		this.Combinaison = new Rangee();
		this.propositions = new Rangee[nb_tenta];
		for(int i=0;i<nb_tenta;i++){
			propositions[i] = new Rangee();
		}
		this.tentative = 0;
		Random r = new Random();
		for(int i =0; i<this.diff; i++){
			Combinaison.jeton[i] = COULEURS[r.nextInt(COULEURS.length)];
		}
	}
	
	public void ajout_Couleur(Color c){
		Rangee r = propositions[tentative];
		r.jeton[r.indiceJeton] = c;
		r.indiceJeton++;
		if(r.indiceJeton==r.taille){
			//Eval_propa();
		}
	}
	
	public void Affich_color(){
		for (int i=0; i<this.Combinaison.taille; i++){
			System.out.println(this.Combinaison.jeton[i]);
		}
	}
	
	public static void main(String[] args) {
		Modele m = new Modele();
		m.Affich_color();
		m.ajout_Couleur(Color.black);
	}

}
