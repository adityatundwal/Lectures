package Lecture_15;

import java.util.Scanner;

public class String_Demo_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello";
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(s);
		String str1 = "Hello";
		String str2 = new String("hello");
		str = str1 + str2;
		System.out.println(str);
//		String str2 = new String("Hello");
//		String str3 = new String("Hello");
//		
//		System.out.println(str);
//		System.out.println(str3);
//		System.out.println(str == str3);
//		System.out.println(str == str1);
//		System.out.println(str.equals(str2));
		
		
		
		
		/* "==" compares address in non primitive data type*/

	}

}
