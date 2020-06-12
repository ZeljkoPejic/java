package sve;

public class EvenFibonacciNumbers {

	
	
	public static void main(String[] args) {
		
		
		
		int max=4000000;
		int sum=0;
		
		for(int i=1, x=0, j=1;i<max; ) {
			
			
			if(i%2==0) {
				sum+=i;
			}
			
			x=i;		// 1          2          3
			
			i=x+j;      // 1+1 = 2 -- 2+1 = 3 -- 3+2 = 5
			j=x;		// 1          2  
									
		}
		
		System.out.println(sum);
		
	}
}
