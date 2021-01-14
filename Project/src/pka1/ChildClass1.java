package pka1;

public class ChildClass1 extends ParentClass1{

	public void method()
	{
		System.out.println("CHILD Class Defualt Method");	
	}
	public void method(int a)
	{
		super.method1(2,3);
		this.method();
		this.method(2,3);
		this.method(2, 3, 3);
		System.out.println("CHILD Class 1 Parameterized Method");
	}
	public void method(int a,int b)
	{
		System.out.println("CHILD Class 2 Parameterized Method");
	}
	public void method(int a,int b, int c)
	{
		System.out.println("CHILD Class 3 Parameterized Method ");
	}
	public static void main(String[] args) {
		ChildClass1 cc=new ChildClass1();
		cc.method(1);
	}
}
