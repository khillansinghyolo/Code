package test;

public class Student extends Person{
	
	int rollno;
	int marks;
	Student(String name,int age,int rollno,int marks)
	{
		super(name,age);
		this.rollno=rollno;
		this.marks=marks;
	}
	public String toString()
	{
		System.out.println(name.toString() +" "+age +"   "+rollno +"  "+ marks);
		return name +" "+age +"   "+rollno +"  "+ marks;
	}
	public static void main(String[] args) {
		
		Student s=new Student("khillan",80,190,90);
		
			}
}
