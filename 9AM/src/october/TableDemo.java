package october;

import java.util.Scanner;

public class TableDemo {
	public static void main(String[] args) {
		
	Scanner scan=new Scanner(System.in);
	System.out.println("Please enter number to print table of that number ");
	
	int a=scan.nextInt();
	
		for(int i=1;i<=10;i++)
		{
			System.out.println(a*i);	
		}
		System.out.println("Table of "+a+ "");		
	}
}
