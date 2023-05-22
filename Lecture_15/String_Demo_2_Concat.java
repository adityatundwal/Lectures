package Lecture_15;

public class String_Demo_2_Concat {
	
	public static void main(String[] args) {
		String str = "Hello";
		String str1 = "Bye";
		String s = str+ str1;
		System.out.println(s);
		String s1 = str.concat(str1);
		System.out.println(s);
		System.out.println(s.length());
	}

}
