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
		this.propositions = new Rangee[nb_tenta];
		for(int i=0;i<nb_tenta;i++){
			propositions[i] = new Rangee();
		}
		this.tentative = 0;
		Random r = new Random();
		for(int i =0; i<this.diff; i++){
			Combinaison.jeton[i] = COULEURS[r.nextInt(COULEURS.length)];
		}
		/* Test combinaison G R R R 
		Combinaison.jeton[0] = Color.green;
		Combinaison.jeton[1] = Color.red;
		Combinaison.jeton[2] = Color.red;
		Combinaison.jeton[3] = Color.red;
		*/
		
	}
	
	public void ajout_Couleur(Color c){
		Rangee r = propositions[tentative];
		r.jeton[r.indiceJeton] = c;
		r.indiceJeton++;
		if(r.indiceJeton==r.taille){
			Eval_propa(r);
		}
	}
	
	public void Affich_color(){
		for (int i=0; i<this.Combinaison.taille; i++){
			System.out.println(this.Combinaison.jeton[i]);
		}
	}
	
	public void Eval_propa(Rangee r){
		this.propositions[tentative] = new Rangee();
		Rangee fred = this.propositions[tentative];  // simplification ecriture 
		Color[] propa = fred.jeton.clone();  // copie de la liste des couleurs de la proposition
		Color[] solution = this.Combinaison.jeton.clone(); // copie de la liste des couleurs de la solution 
		
		// Evaluation de tout les jetons bien placés ( ie les noirs )
		for(int i=0; i< propa.length;i++){  // On parcours la proposition donnée
			if (propa[i]==solution[i]){ // Si une couleur est bien placée
				propa[i] = null;
				solution[i] = null;
				fred.noirs++;
			}
		}

			// Evaluation de tout les jetons présents mais mal placés ( ie les blancs )
		for(int i=0; i< propa.length;i++){  // On parcours la proposition donnée
			for (int j=0; j < solution.length; j++) {
				if (propa[i]==solution[j] && j!=i && propa[i]!=null){
					propa[i] = null;
					solution[j] = null;
					fred.blancs++;// Si une couleur est présente mais mal placée
				}
			}
		}
		
		System.out.println(fred.noirs); /* print du nombre de jetons bien placés*/
		System.out.println(fred.blancs); /* print du nombre de jetons mal placés*/
		this.tentative++;
	}
	
	public static void main(String[] args) {
		Modele m = new Modele();
		Rangee r = new Rangee();
		m.Eval_propa(r);
		m.Affich_color();
	}

}
