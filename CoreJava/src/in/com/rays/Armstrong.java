package in.com.rays;

public class Armstrong {
	
	public static void main(String[] args) {
		int a=371;
		int b=0;
		int c;
		int d=a;
		
		while(d>0) {
			
			c=d%10;
			b=b+(c*c*c);
			d=d/10;
			
		}
		
		if (a==b) {
			
		 	
			System.out.println("yes armstrong");
			
		}else {
			System.out.println("no armstrong");
		}
		
	}

}
