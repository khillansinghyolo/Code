package october;

public class Student {
	
	public Student()
	{	 
		display ();
	    display (1);
	    display (2,2);
	    display (3,2,1);
	    display (1,3,5,7);
	    
		nonStaticDisplay();
		nonStaticDisplay(1);
		nonStaticDisplay(1,2);
		nonStaticDisplay(1,2,3);
		nonStaticDisplay(1,2,3,40);	
	}
	public static void display()
	{
		System.out.println("NO parameterized static method");
	}
	public static void display(int a )
	{  
		System.out.println("1 parameterized static method");
	}
	public static void display(int a,int b)
	{
		System.out.println("2 parameterized static method");
	}
	public static void display(int a,int b,int c)
	{	
		System.out.println("3 parameterized static method");
	}
	public static void display(int a ,int b,int c,int d)
	{
		System.out.println("4 parameterized static method");
	}
	public void nonStaticDisplay()
	{
		Student.display();
		System.out.println("NO parameterized Non static method");
	}
	public void nonStaticDisplay(int a)
	{   
		Student.display(1);
		System.out.println("1 parameterized Non static method");
	}
	public void nonStaticDisplay(int a, int c)
	{
		Student.display(1,1);
		System.out.println("2 parameterized Non static method");
	}
	public void nonStaticDisplay(int a,int b,int c )
	{	
		Student.display(1,1,2);
		System.out.println("3 parameterized Non static method");
	}
	public void nonStaticDisplay(int a,int b,int c,int d )
	{
		Student.display(1,1,2,3);
		System.out.println("4 parameterized Non static method");
	}
	public static void main(String[] args)
	{
		Student ref=new Student();
	}
}
