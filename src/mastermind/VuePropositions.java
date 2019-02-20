package mastermind;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class VuePropositions extends Canvas implements Observer{
	
	public Modele mod;

	public VuePropositions (Modele m) {
		super();
		this.setPreferredSize(new Dimension(m.diff*60,m.nb_tenta*60));
		mod=m;
		m.addObserver(this);
	}
	
	public void paint(Graphics g) {
		for (int i=0;i<mod.tentative+1;i++) {
			for (int j=0;j<mod.propositions[i].indiceJeton;j++) {
				g.setColor(mod.propositions[i].jeton[j]);
				g.fillOval(50*j, 50*i, 40, 40);
			}
		}
		System.out.println("ici");
	}
	

	@Override
	public void update(Observable arg0, Object arg1) {
		System.out.println("update");
		repaint();
		
	}
}
