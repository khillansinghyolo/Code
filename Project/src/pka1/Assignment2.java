package pka1;

public class Assignment2 {
	//((((10+20)-2)+2)*2)/2)
	//((((10/2)-2)+2)-2)*2)
	public int sum(int a,int b)
	{
		int c=a+b;
	//	System.out.println(c);
		return c;	
	}
	public int sub(int x,int y)
	{
		int z=x-y;
	//	System.out.println(z);
		return z;	
	}
	public int mul(int x1,int x2)
	{
		int x3=x1*x2;
	//	System.out.println(x3);
		return x3;	
	}
	public int div(int aa,int bb)
	{
		int cc=aa/bb;
	//	System.out.println(cc);
		return cc;	
	}
	public static void main(String[] args) {	
		Assignment2 ref=new Assignment2();
		//((((10+20)-2)+2)*2)/2)
		int sum_result=ref.sum(10,2);
		int sub_result=ref.sub(sum_result,2);
		int sum_result2=ref.sum(sub_result, 2);
		int mul_result=ref.mul(sum_result2,2);
		int div_result=ref.div(mul_result,2);
		System.out.println("First Expression value :"+div_result);	
		//((((10/2)-2)+2)-2)*2)
		int div_expression=ref.div(10,2);
		int sub_expression=ref.sub(div_expression,2);
		int sum_expression=ref.sum(sub_expression, 2);
		int sub_expression1=ref.sub(sum_expression, 2);
		int mul_expression=ref.mul(sub_expression1, 2);
		System.out.println("Second Expression value: " +mul_expression);	
	}

}
