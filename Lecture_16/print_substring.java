package Lecture_16;

public class print_substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello";
		printstring(s);

	}
	
	public static void printstring(String s) {
		for (int i = 0; i < s.length(); i++) {
			for (int j = i+1; j < s.length(); j++) {
				System.out.println(s.substring(i,j)+" ");
				
			}
		}
	}

}
