package in.com.rays;

public class Avarage {
	
	public static void main(String[] args) {
		
		int n=10;
		int count=0;
		int sum=0;
		int avg;
		
 		for (int i = 0; i <= n; i++) {
			
			if (i%2==1) {
				
				sum=sum+i;
			
				count++;
				
			}
			
		}
		
		avg=sum/count;
		System.out.println(avg);
		
	}
}
