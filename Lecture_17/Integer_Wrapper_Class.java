package Lecture_17;

public class Integer_Wrapper_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer ii = 90;
		int i = 89;
		System.out.println(ii);
		System.out.println(i);
		Long ll = 878l;
		Long ll1 = 878l;
		Short s = 18;
		Byte b1 = 1;
		
		//Auto-Boxing
		ii = i;
		Integer  a = 100;
		int b = 10;
		b = a; //This is onboxing
		System.out.println(i);
		
		Integer x = 18;
		Integer x1 = 18;
		Integer y = 189;
		Integer y1 = 189;
		System.out.println(x==x1);
		System.out.println(y == y1);
		

	}

}
