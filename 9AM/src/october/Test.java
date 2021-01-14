package october;

public class Test {
	
	static String collegeName="RJIT";
	String studentName;
	String DepartmentName;
	int SRoll;
	
	public Test (String collegeName,String studentName,String departmentName,int SRoll)
	{
		this.collegeName=collegeName;
		this.studentName=studentName;
		this.DepartmentName=departmentName;
		this.SRoll=SRoll;
	}

	
	  public String toString() 
	  { 
		  return  collegeName +"  "+ studentName+"  "+DepartmentName +"   "+SRoll;
	  }
	public void m()
	{
		
	}
	public void m1()
	{
		
	}
	public static void main(String[] args)
	{
		Test t=new Test(collegeName,"Khillan","EC",10001);
		
		System.out.println(t.toString());
		Test t1=new Test(collegeName,"Rahul","EC",10002);
		System.out.println(t1);
		Test t2=new Test(collegeName,"Pradeep","EC",10003);
		System.out.println(t2);
		Test t3=new Test(collegeName,"Ashish","EC",10004);
		System.out.println(t3);
	}
	

}
