package Lecture_8;

public class func_demo3 {
	
	static int val = 100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*always use this method to solve questions*/
		System.out.println("Bye");
		int a = 8;
		int b = 7;
		System.out.println(val);
		System.out.println(add(a, b));
		System.out.println(val);

	}
	
	public static int add(int a, int b) {
		int c = a+b;
		int val = 90;
		System.out.println(val);
		val = val+5;  //Locally declared
		func_demo3.val = val+5;
		return c;
	}

}
