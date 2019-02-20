package mastermind;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;

public class VueClavier extends Panel implements ActionListener{

	public VueClavier (Modele m){
		for (int i=0; i<m.COULEURS.length;i++){
			JButton button = new JButton("");
			Color couleur_temp = m.COULEURS[i];
			button.setBackground(couleur_temp);
			button.setPreferredSize(new Dimension (30,30));
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.out.println(couleur_temp);
					m.ajout_Couleur(couleur_temp);
				}
			});
			this.add(button);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	}

}
