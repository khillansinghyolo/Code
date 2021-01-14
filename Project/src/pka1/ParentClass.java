package pka1;

public class ParentClass {
	
	public ParentClass()
	{   this(4,4,4);
		System.out.println("PARENT Class Defualt constructor ");
	}
	public ParentClass(int a)
	{
		this(4,3,4,4);
		System.out.println("PARENT Class 1 Parameterized constructor ");
	}
	public ParentClass(int a,int b)
	{
		this();
		System.out.println("PARENT Class 2 Parameterized constructor ");
	}
	public ParentClass(int a,int b,int c)
	{ 
		System.out.println("PARENT Class 3 Parameterized constructor ");
	}
	
	public ParentClass(int a,int b,int c,int d)
	{
		this(44,4);
		System.out.println("PARENT Class 4 Parameterized constructor ");
	}
}
