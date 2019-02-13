package mastermind;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Panel;

import javax.swing.JButton;

public class VueClavier extends Panel {
	
	public static Color[] Couleurs = {Color.YELLOW,Color.GREEN,Color.BLUE,Color.MAGENTA,Color.RED,Color.ORANGE,Color.WHITE,Color.BLACK};
	
	public VueClavier (){
		for (int i=0; i<8;i++){
		JButton button = new JButton("");
		button.setBackground(Couleurs[i]);
		button.setPreferredSize(new Dimension (30,30));
		this.add(button);
		}
	}

}
