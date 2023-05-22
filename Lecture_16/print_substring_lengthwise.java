package Lecture_16;

public class print_substring_lengthwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "7182";
		print_substring(s);
		

	}

	private static void print_substring(String s) {
		for (int len = 0; len <= s.length(); len++) {
			System.out.println();
			for (int j = len; j <= s.length(); j++) {
				int i = j-len;
				System.out.println(s.substring(i,j)+" ");
				
			}
		}
	}

}
