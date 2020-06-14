package sve;

public class LargestPalindromeProduct {

	public static void main(String[] args) {

		int umnozak=0;
		int sum=0;
		int largest=0;
		
		
		for(int i=900;i<=999;i++) {
			
			for(int j=900;j<=999;j++) {
				
								
				umnozak=i*j;
				
				do {
				
				
				sum=(sum*10)+umnozak%10;
				umnozak/=10;
				
				
				}while(umnozak!=0);
				
				if(i*j==sum) {
					largest=i*j;
				}
				sum=0;
				
			}
			
			
		}
		
		System.out.println(largest);
		
	}
}

