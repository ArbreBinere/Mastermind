package mastermind;

import java.awt.Color;

public class Rangee {

	int taille = Modele.diff;
	Color[] jeton;
	int indiceJeton;
	int noirs;
	int blancs;
	int[] resultat = {noirs,blancs};
	
	public Rangee(){
		jeton = new Color[taille];
		indiceJeton = 0;
		noirs=0;
		blancs=0;
	}

/* Simple constructeur pour tests
	public Rangee(int i){
		jeton = new Color[taille];
		indiceJeton = 0;
		noirs=0;
		blancs=0;
		jeton[0] = Color.red;
		jeton[1] = Color.red;
		jeton[2] = Color.green;
		jeton[3] = Color.yellow;
	}
	*/
}
