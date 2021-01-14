package october;

public  class Day_17Oct {

	static int a=10;
	 int b=20;
	
	public static void method()
	{
		a=50;
		new Day_17Oct().b=100;
		System.out.println("static method");
	}
	public void nonSmethod()
	{
		a=100;
		System.out.println(a);
		System.out.println("non static method");	
	}
	
	
	public static void main(String[] args) {
		Day_17Oct.method();
		
		
	}

}
