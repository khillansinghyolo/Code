package pka1;

public class Assignment3 {
		
public Assignment3()
 { 
	this(2,3,3);
	System.out.println("Default constructor ");
 }
public Assignment3(int a)
{	
	this(1,2,3,4);
	System.out.println("1 Parameterized constructor");
}
public Assignment3(int a,int b)
{ 
	this();
	System.out.println("2 Parameterized constructor ");
}
public Assignment3(int a,int b ,int c )
{
	System.out.println("3 Parameterized constructor");
}
public Assignment3(int a,int b ,int c,int d )
{
	this(1,2);	
	System.out.println("4 Parameterized constructor ");
}
public static void main(String[] args)
{	
	Assignment3 ref =new Assignment3(1);
}

}
