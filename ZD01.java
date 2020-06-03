package edunova;

import javax.swing.JOptionPane;

public class ZD01 {

	
	public static void main(String[] args) {
		
		int prviBroj = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj"));
		int drugiBroj = Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj"));
		int treciBroj = Integer.parseInt(JOptionPane.showInputDialog("Unesi treci broj"));
		
		int broj = 0;
		
		if(prviBroj >= drugiBroj ) {
			broj = prviBroj;
		}
		else {
			broj = drugiBroj;
		}
		if(treciBroj >= broj) {
				broj = treciBroj;
				
			}
		
		System.out.println("Najveci broj je "+broj);
	}
}
