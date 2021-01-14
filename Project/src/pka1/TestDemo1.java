package pka1;

public class TestDemo1 {

	
	public int add(int a,int b)
	{
		return a+b;
	}
	public int sub(int a,int b) 
	{
		return a-b;
	}
	public int div(int a,int b)
	{
		return a/b;
	}
	public int mul(int a,int b)
	{
		return a*b;
	}
	public static void main(String[] args)
	{
		//(((((((10-5)+5)/2)*10)+10)/10);
		
		
		TestDemo1 t=new TestDemo1();
		int sub_result=t.sub(10,5);
		int add_result=t.add(sub_result,5);
		int div_result=t.div(add_result, 2);
		int mul_result=t.mul(div_result, 10);
		int add_result1=t.add(mul_result, 10);
		int div_result1=t.div(add_result1,10);
		
		System.out.println(div_result1);
		
		//(20-2)/2*10/2/15
		
		int sub1=t.sub(20,2);
		int div1=t.div(sub1, 2);
		int mul1=t.mul(div1, 10);
		int div2=t.div(mul1, 2);
		int div3=t.div(div2, 15);
		System.out.println(div3);
		
		
	}

}
