package in.com.basicjava;

public class MaxinArray {

	public static void main(String[] args) {
		
		int[] a = {12,14,2,19,6};
		int b= 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i]>b) {
				b=a[i];
				
			}
			
		}
		System.out.println(b);

	}

}
