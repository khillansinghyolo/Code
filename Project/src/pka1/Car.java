package pka1;

public class Car {
	{	
	Engine e=new Engine();
	int sum=e.sum(10,2);
	int mul=e.mul(sum,4);
	int sub=e.sub(mul,8);
	
	int div=e.div(sub,10);
	
	System.out.println(div);
	}
public static void main(String[] args)
{
		Car c=new Car();		
	}
}
