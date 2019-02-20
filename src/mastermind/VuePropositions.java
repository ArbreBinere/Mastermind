package mastermind;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;

public class VuePropositions extends Canvas {
	public Modele mod;
	public VuePropositions (Modele m) {
		super();
		this.setPreferredSize(new Dimension(m.nb_tenta*60,m.diff*60));
		mod=m;
	}
	
	public void paint(Graphics g) {
		System.out.println(mod.nb_tenta);
		System.out.println(mod.diff);
		for (int i=0;i<mod.nb_tenta;i++) {
			for (int j=0;j<mod.diff;j++) {
				System.out.println(i);
				System.out.println(j);
				g.drawOval(50*i, 50*j, 40, 40);
			}
		}
	}
}
