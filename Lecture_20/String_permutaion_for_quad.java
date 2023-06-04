package Lecture_20;

public class String_permutaion_for_quad {

	public static void main(String[] args) {
		String str = "abca";
		Permutate(str, "");

	}

	private static void Permutate(String ques, String ans) {
		// TODO Auto-generated method stub

		if (ques.length() == 0) {
			System.out.println(ans + " ");
			return;
		}
		for (int i = 0; i < ques.length(); i++) {
			char ch = ques.charAt(i);
			boolean f = true;
			for (int j = i + 1; j < ques.length(); j++) {
				if (ques.charAt(j) == ch) {
					f = false;
					break;
				}
				if (f == true) {
					String s1 = ques.substring(0, i);
					String s2 = ques.substring(i + 1);
					Permutate(s1 + s2, ans + ch);
				}
			}
		}

	}

}
