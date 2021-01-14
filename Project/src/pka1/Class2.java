package pka1;

public class Class2 extends Class1{
	
	
	public void display()
	{
		System.out.println("Child default display method");
	}
	public void display(int s)
	{
		System.out.println("Child 1 Parameterized display method");
	}
	public void display(int s,int s1)
	{
		System.out.println("Child 2 Parameterized display method");
	}
	public void display(int s,int a ,int s1)
	{
		System.out.println("Child 3 Parameterized display method");
	}
	public static void main(String[] args) 
	{	
		Class1 c1=new Class1();
		
		c1.display(2);
		c1.display(1,7);
		c1.display(2,8,9);	
	}

}
