package edunova;

public class DZ01 {

	public static void main(String[] args) {
		
		
		for(int i = 0;i<10;i++) {
			for(int j=0;j<10;j++) {
				
				if((i+1)*(j+1) < 10) {
					System.out.print(" "+(i+1)*(j+1) + " ");
				}
				else{System.out.print((i+1)*(j+1)+ " ");}
				
				
			}
			System.out.println();
		}
		
	}
}
