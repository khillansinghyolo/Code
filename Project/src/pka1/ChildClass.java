
package pka1;

public class ChildClass extends ParentClass {

	public ChildClass() {
		super(4);
		System.out.println("CHILD Class Defualt constructor ");
	}

	public ChildClass(int a) {
		this(3, 4, 3);
		System.out.println("CHILD Class 1 Parameterized constructor ");
	}

	public ChildClass(int a, int b) {
		this(4, 4, 3, 4);
		System.out.println("CHILD Class 2 Parameterized constructor ");
	}

	public ChildClass(int a, int b, int c) {
		this();

		System.out.println("CHILD Class 3 Parameterized constructor ");
	}

	public ChildClass(int a, int b, int c, int d) {
		this(4);

		System.out.println("CHILD Class 4 Parameterized constructor ");
	}

	public static void main(String[] args) {

		ChildClass child = new ChildClass(2, 2);
	}
}
