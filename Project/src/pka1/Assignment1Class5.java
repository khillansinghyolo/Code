package pka1;

import java.util.Scanner;

public class Assignment1Class5 {



	public static void main(String[] args)
	{	
		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter value:");		
		
		int x1=scan.nextInt();
		int x2=scan.nextInt();
		int x3=scan.nextInt();
		int x4=scan.nextInt();
		int x5=scan.nextInt();
		int x6=scan.nextInt();
		
	System.out.println("value of expression 1:"+(((((x1+x2)-x3)+x4)*x5)/x6));
	System.out.println("Value of Expression 2:"+((((x1*x2)+x3)/x4+x5)-x6));
			
	}

}
