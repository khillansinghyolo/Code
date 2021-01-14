package november;

import october.Test;

public class SingletonDemo {
	
	private static SingletonDemo t=new SingletonDemo();
	
	private SingletonDemo()
	{
		
	}
	public static SingletonDemo getSingletonDemo()
	{	
		return t;	
	}
	public static void main(String[] args)
	{	
		SingletonDemo t=new SingletonDemo();
		System.out.println(t.getClass());
		System.out.println(t.getSingletonDemo());
		
	}	
}
