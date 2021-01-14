package october;

import java.util.Scanner;

public class PalindromeNumber {

public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Please Enter the Number ");

	int n=s.nextInt();
	int rev=0,rem,temp;
	//int n=121;
	temp=n;	
	while(temp!=0)
	{
		rem=temp%10;
		rev=rev*10+rem;
		temp=temp/10;
	}
	if(n==rev)
	{
		System.out.println(n+" Number is Palindrome Number");
	}
	else 
	{
		System.out.println(n+" Number is not Palindrome Number");
	}
  }
}
