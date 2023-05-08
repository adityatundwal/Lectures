package Lecture_8;

public class func_demo {

	public static void main(String[] args) { //this is initializer
		// TODO Auto-generated method stub
		System.out.println("hello");
		System.out.println("Hey");
		System.out.println("Bye");
		addition();
		subtract();

	}
	
	public static void addition() {
		int a = 9;
		int b = 10;
		int c = a+b;
		subtract();	
		System.out.println(c);
	}
	
	public static void subtract() {
		int a = 9;
		int b = 10;
		int c = a-b;
		System.out.println(c);
	}
	

}
