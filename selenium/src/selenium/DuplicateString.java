package selenium;

import java.util.Scanner;

public class DuplicateString {

	public static void main(String[] args) {
		//Scanner scan=new Scanner(System.in);
		//System.out.println("Please Enter String to find duplicate");
	
		String s="my name is khillan he is live in noida with wife khillan is working in gcube this is working with wife";
		//String string=scan.next();
		String[]ss=s.split(" ");
		
		int length=ss.length;
		int count=0;
		String sss=null;
		for(int i=0;i<length;i++)
		{
			for(int j=0;j<i;j++)
			{
				if((sss=ss[i]).equals((ss[j])))
				{
					System.out.println("Duplicate String :"+sss);
					count++;
				}
			}	
		}
		System.out.println("total duplicate String :"+count);
	}

}
