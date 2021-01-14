package october;

import java.util.Scanner;

public class FactorialDemo {

	public static void main(String[] args) {

		//First Logic 	
		/*
		 * Scanner s=new Scanner(System.in);
		 * System.out.println("Enter is to print factorial");
		 * 
		 * int n =s.nextInt(); int fact = 1;
		 * 
		 * for (int i = n; i >= 1; i--) { fact = fact * i; } System.out.println("Enter "
		 * + fact);
		 */
		// Second Logic
		 Scanner s=new Scanner(System.in);
		 System.out.println("Enter is to print factorial");
		 int n =s.nextInt(); int fact = 1;
		 
		 for(int i=1;i<=n;i++)
		 {
			 fact=fact*i;
		 }
		 System.out.println("Factorial of No. "+ fact);
	}
}
