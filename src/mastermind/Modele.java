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
		tentative = 0;
		this.Combinaison = new Rangee();
		this.propositions = new  Rangee[nb_tenta];
		Random r = new Random();
		for(int i =0; i<this.diff; i++){
			Combinaison.jeton[i] = COULEURS[r.nextInt(COULEURS.length)];
		}
	}
	
	public void Affich_color(){
		for (int i=0; i<this.Combinaison.taille; i++){
			System.out.println(this.Combinaison.jeton[i]);
		}
	}
	
	public void Eval_propa(Rangee r){
		this.propositions[tentative] = new Rangee(0); // Rangee que den Rouge pour les tests
		Rangee copie = this.propositions[tentative];  // simplification ecriture 
		Color[] propa = copie.jeton.clone();  // copie de la liste des couleurs de la proposition
		
		// Evaluation de tout les jetons bien placés ( ie les noirs )
		for(int i=0; i< propa.length;i++){  // On parcours la proposition donnée
			if (propa[i]==this.Combinaison.jeton[i]){ // Si une couleur est bien placée
				copie.noirs++;
			}
		}
			// Evaluation de tout les jetons présents mais mal placés ( ie les blancs )
		for(int i=0; i< propa.length;i++){  // On parcours la proposition donnée
			if (propa[i]==this.Combinaison.jeton[i]){ // Si une couleur est bien placée
				copie.noirs++;
			}
		}
		
		System.out.println(copie.noirs);
		this.tentative++;
	}
	
	public static void main(String[] args) {
		Modele m = new Modele();
		Rangee r = new Rangee();
		m.Eval_propa(r);
		m.Affich_color();
	}

}
