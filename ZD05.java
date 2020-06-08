package edunova;

import javax.swing.JOptionPane;

public class ZD05 {

	
	public static void main(String[] args) {
		
		
		int brojPrvi = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj"));
		int brojDrugi = Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj"));
		
		
		//int broj=0;
		System.out.print("Izlaz: ");
		if(brojPrvi<brojDrugi) {
			
			for(int i=brojPrvi;i<=brojDrugi;i++) {
				
				if(i%2==1) {
					continue;
				}
				
				System.out.print(i+" ");
				
			}
			
		}else {
			
			for(int j = brojPrvi;j>=brojDrugi;j--) {
				
				if(j%2==1) {
					continue;
				}
				
				System.out.print(j+" ");
				
			}
			
			
		}
		
		
		
	}
}
