package pka1;

public class Engine {
	
	public void model()
	{
		System.out.println("Engine Default Model method");	
	}
	public void model(int a)
	{
		System.out.println("Engine 1 Parameteried Model method");
	}
	public int  sum(int a, int b)
	{
		System.out.println("Engine Sum Parameteried Model method");
		return a+b;
	}
	public int  sub(int a, int b)
	{
		System.out.println("Engine sub 2 Parameteried Model method");
		return a-b;
	}
	public int  div(int a, int b)
	{
		System.out.println("Engine div 2 Parameteried Model method");
		return a/b;
	}
	public int  mul(int a, int b)
	{
		System.out.println("Engine mul 2 Parameteried Model method");
		return a*b;
	}
	
}
