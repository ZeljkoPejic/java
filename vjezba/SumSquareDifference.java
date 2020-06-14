package sve;

public class SumSquareDifference {
	
	public static void main(String[] args) {
		
		int i=1;
		int sum=0,sum2=0;
		boolean flag=false;
		
		while(i<=100) {
			
			
			sum=sum+(i*i);	
			i++;
			if(i>100) {
				flag =true;
				i=1;
			}
			
			while(flag) {
				
				sum2+=i;
				i++;
				
				if(i>100) {
					
					sum=(sum2*sum2)-sum;
					break;
				}
				
				
				
			}
			
		}
		
		
		System.out.println(sum);
				
	}

}
