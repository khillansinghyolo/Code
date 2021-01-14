package october;

import java.util.Scanner;

public class PrimeNoDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Please enter the number");
		int a=s.nextInt();
		int temp=0;
	
		try 
		{
			 if(a>=2)
				{
					for(int i=2;i<=a-1;i++)
					{
						if(a%i==0)
						{
							temp=temp+1;
						}
					}
					if(temp >0)
					{
						System.out.println(a+" number is not prime ");	
					}
					else
					{
						System.out.println(a+" number is  prime ");	
					}	
				}
				
				else 
				{
					System.out.println("Please enter valid number");
				}
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
		
		
	}
}
