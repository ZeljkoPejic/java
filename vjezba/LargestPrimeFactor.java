package sve;

public class LargestPrimeFactor {

	
	public static void main(String[] args) {
		
		
		long findPrime = 600851475143l ;
		long largestPrime=0;
		
		
			
			
			for(long i=2;i<findPrime;i++) {
				
				
				if(findPrime%i==0) {
					
					findPrime=findPrime/i;
					i=2;
					largestPrime=findPrime;
					
				}
				
				
			
			
			
		}
			System.out.println(largestPrime);
		
	}
}
