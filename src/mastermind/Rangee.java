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
	
	public Rangee(int i){
		jeton = new Color[taille];
		indiceJeton = 0;
		noirs=0;
		blancs=0;
		for(int j=0;j<4;j++){
			jeton[j] = Color.red;
		}
	}
}
