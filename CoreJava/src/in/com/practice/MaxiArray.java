package in.com.practice;

public class MaxiArray {
	public static void main(String[]args) {
		int []a= {12,15,20,18,10};
		int b=0;
		for (int i = 0; i < a.length; i++) {
			if (a[i]>b) {
				b=a[i];
				
			}
		
			
		}	System.out.println(b);
	}

}
