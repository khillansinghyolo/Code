package pka1;

public class PolyDemo {
	
	public void sum()
	{
		System.out.println("default methods");
	}
	
	public void sum(int a)
	{
		System.out.println("1 parameterized methods");	
	}
	 void sum(float f)
	{
		System.out.println("float method ");
	}
	 void sum(double d)
	 {
		 System.out.println("double method ");
	 }
	
	protected void display ()
		{
		System.out.println("Parent class Default method :display ");
		}

	public int  sub()
	{
		return 1;
	}
	
	public Object print()
	{
		
		System.out.println("Parent class print method ");
		return "";
	}
	
}
