package pka1;

public class PolyDemo1 extends PolyDemo {
	
	public void sum()
	{
		System.out.println("Child class  defualt methods ");
	}
	protected void display ()
	{
		System.out.println("Child class Default method :display ");
	}
	
	public int sub()
	{
		return 1;
	}
	public String print()
	{
		System.out.println("Child class print method ");
		
		return "";
	}
	public static void main(String[] args) {
	PolyDemo1 ref =	new PolyDemo1();
	
	ref.sum();
	ref.display();
	ref.sub();
	ref.print();
	
	PolyDemo ref1= new PolyDemo();
	ref1.display();
	
	}
}
