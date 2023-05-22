package Lecture_16;

public class Palindrome_approach_self {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* wrong approach*/
		String str = "Hellio";
		System.out.println(palindrome(str));

	}
	
	public static boolean palindrome(String str) {
			for (int j = str.length()-1; j >= 0; j--) {
				if(str.charAt(j)==str.charAt(j)) {
					return false;

			}
			else {
				return true;
			}			
		}
		return true;
	}
}


