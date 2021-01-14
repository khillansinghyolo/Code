package october;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Please enter number");
		int n=s.nextInt();
		
		int arms=0;
		int a,temp;
		//int n=153;
		temp=n;
		while(n>0)
		{
			a=n%10;//reminder 3
			n=n/10;
			arms=arms+(a*a*a);		
		}
		if(temp==arms)
		{
			System.out.println(temp+": Is Armstrong Number");	
		}
		else
		{
			System.out.println(temp+" Is Not Armstrong Number");
		}
		
		/*Second Logic
		 * 
		Scanner s=new Scanner(System.in);
		System.out.println("Please enter number");
		int a=s.nextInt();
		
		int t1=a;
		int rem;
		
		int leng=0;
		int arms=0;
		int mul=1;
		
		while(t1!=0)
		{
			t1=t1/10;
			leng=leng+1;
		}
		System.out.println(leng);
		int t2=a;	
		while(t2!=0)
		{
			rem=t2%10;
			for(int i=1;i<=leng;i++)
			{
				mul=mul*rem;
			}
			arms=arms+mul;
			t2=t2/10;	
		}
		if(arms==a)
		{
			System.out.println("Number is not armstrong number");
		}
		else
		{
			System.out.println("Number is  armstrong Number ");
		}
		 * 
		 * 
		 * */
	}
}
