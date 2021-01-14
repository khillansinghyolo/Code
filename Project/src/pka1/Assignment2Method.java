package pka1;

public class Assignment2Method {
	
	
	public void method()
	{
		System.out.println("Default method ");
	}
	public void method(int a)
	{
		this.method(1,2,3,4);
		this.method();
		this.method(3,4);
		this.method(1,2,3);
		System.out.println("1 Parameterized method ");
	}
	public void method(int a,int b)
	{
		System.out.println("2 Parameterized method ");
	}
	public void method(int a,int b,int c)
	{
		System.out.println("3 Parameterized method ");
	}public void method(int a,int b,int c ,int d)
	{
		System.out.println("4 Parameterized method ");
	}
	public static void main(String[] args) {
		
		Assignment2Method f=new Assignment2Method();
		f.method(1);
	}

}
