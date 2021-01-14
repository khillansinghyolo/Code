package corejava;

import java.util.Scanner;

public class SwappingTest {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Please enter Number a");	
		
		int a=s.nextInt();
		System.out.println("Please enter Number b");
		
		int b=s.nextInt();
		
		//int a=10;
		//int b=20;
		
		System.out.println("Before swapping number: " +a);
		System.out.println("Before swapping number: "+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println();
		System.out.println("after swapping number: "+a);
		System.out.println("after swapping number: "+b);
	}

}
