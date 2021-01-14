package pka1;

public class ParentClass1 {
	
	public void method1()
	{
		System.out.println("PARENT Class Defualt Method");
	}
	public void method1(int a)
	{
		System.out.println("PARENT Class 1 Parameterized Method");
	}
	public void method1(int a,int b)
	{
		this.method1(2,3,4);
		this.method1(2);
		this.method1();
		System.out.println("PARENT Class 2 Parameterized Method");
	}
	public void method1(int a,int b, int c)
	{
		System.out.println("PARENT Class 3 Parameterized  Method");
	}

}
