package october;

public class Swapping {

int a ,x,y;

public Swapping()
{
	swaping();
	swapping();
	}
	
public  void swaping()
	{ 
	System.out.println("Swapping two number with 3rd variable ");
		x=10;
	    y=20;
	    System.out.println("before swaping:"+x+"------"+y+"--------"+a);
	    
	    a=x;
	    x=y;
	    y=a;
	    System.out.println("after swaping:"+x+"-----"+y+"-----"+a);
	}
	public void swapping()
	{
		System.out.println("Swapping two number with out  3rd variable ");
		int aa=50;
		int bb=100;
		System.out.println("before swaping:"+aa+"-----"+bb);
		
		aa=bb;
		bb=aa;
		System.out.println("after swaping:"+aa+"-----"+bb);
	}
	public static void main(String[] args)
	{
		Swapping s=new Swapping();
		
	}
}
