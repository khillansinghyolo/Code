package corejava;

import java.util.Scanner;

public class VowelNumber {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter string to find the vowels");
		String name =s.next();
		
		System.out.println("Length :"+name.length());
		char ch=0;
		int vowels=0;
		
		for (int i = 0; i < name.length(); i++) 
		{
			 ch=name.charAt(i);
			if(ch=='a'|| ch=='i'|| ch=='u'||ch=='o'||ch=='e')
			{
				vowels++;
				System.out.println("Charater name :"+ch);
			}
		}
		
		System.out.println("vowels  count :"+vowels);
	}
}
