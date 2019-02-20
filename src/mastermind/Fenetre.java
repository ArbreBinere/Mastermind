package mastermind;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Fenetre extends Frame implements WindowListener {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Fenetre();

	}
	
	public Fenetre(){
		
		Modele modl = new Modele();
		this.setLayout(new BorderLayout());
		
		VueClavier clavier = new VueClavier(modl);
		this.add(clavier, BorderLayout.SOUTH);
		
		VuePropositions prop  = new VuePropositions(modl);
		this.add(prop, BorderLayout.NORTH);
		
		this.addWindowListener(this);
		this.setTitle("Mastermind");
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		// TODO Auto-generated method stub
		System.exit(0);
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
