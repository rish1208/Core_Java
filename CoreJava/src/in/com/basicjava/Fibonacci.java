package in.com.basicjava;

public class Fibonacci {
	public static void main(String[]args) {
		int x=0;
		int y=1;
		System.out.print(x+ ", "+ y );
		for (int i = 0; i < 10; i++) {
			int z=x+y;
			x=y;
			y=z;
			System.out.print(", "+z);
			
		}
	}

}
