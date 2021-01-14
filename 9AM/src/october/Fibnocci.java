package october;

import java.util.Scanner;

public class Fibnocci {
	
	int a=0;
	int b=1;
	int c;
//	0 1 1 2 3 5 8 13 21 34  55 89
	public static void main(String[] args) {	
		Scanner s=new Scanner(System.in);
		System.out.println("Please enter number to print Fibnocci series");
		int no= s.nextInt();
		
		int a=0;
		int b=1;
		int c;
		
		if(no ==0 || no==1 ||no >=2)
		{
			for(int i=0; i<no;i++)
			{
				c=(a+b);
				System.out.println("Fibnocci series :"+c);
				a=b;
				b=c;
			}
		}
		else 
		{
			
		}
	}
}
