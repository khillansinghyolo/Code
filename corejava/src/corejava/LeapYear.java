package corejava;

import java.util.Scanner;

public class LeapYear {

	//Leap years
	public static void main(String[] args) {
		
	Scanner s=new Scanner(System.in);
	System.out.println("Please enter the year for checking leap year");
	int year =s.nextInt();	
	//int year =1996;
	boolean leap=false;
	
	if (year%4==0)
	{
		if(year%100==0)
		{
			if(year%400==0)
				{
					leap=true;
				}
			else 
				leap =false;
		}
		else 
			leap=true;
	}
	else leap=false;
	if(leap)
	{
		System.out.println("Year is leap year: "+year);
	}
	else
	{
		System.out.println("Year is not leap year: "+year);
	}
	}
}
