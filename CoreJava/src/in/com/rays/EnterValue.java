package in.com.rays;

import java.util.Scanner;

public class EnterValue {
	public static void mani(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter your name");
		String name=s.next();
		System.out.println("enter gender");
		char gender=s.next().charAt(0);
		System.out.println("enter age");
		int age=s.nextInt();
		System.out.println("..........");
		System.out.println("Name" + name);
		
	}

}
