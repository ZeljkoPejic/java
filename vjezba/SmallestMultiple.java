package sve;

import javax.swing.JOptionPane;

public class SmallestMultiple {

	
	public static void main(String[] args) {
		
		int counter=0;
		
		int prviBroj = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj -od"));
		
		int drugiBroj = Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj do-"));
		
		izlaz:
		for(int i=drugiBroj;i<Integer.MAX_VALUE;i++) {
			
			
			for(int j=prviBroj;j<=drugiBroj;j++) {
				
				
				if(i%j==0) {
					counter++;
				}
				
				if(counter==(drugiBroj-prviBroj)+1) {
					System.out.println("Najmanji broj je: "+i);
					break izlaz;
				}
				if(j==drugiBroj) {
					counter=0;
					break;
				}
				
			}
			
			
			
		}
		
		//System.out.println("Najmanji broj je: "+counter);
		
		
	}
}
