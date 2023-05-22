package Lecture_16;

public class palindrome_monu_bhaiya {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "nitin";
		System.out.println(checkpalindrome(str));
		;

	}

	private static boolean checkpalindrome(String str) {
		// TODO Auto-generated method stub
		int i = 0;
		int j = str.length() - 1;
		while (i < j) {
			if (str.charAt(i) != str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
