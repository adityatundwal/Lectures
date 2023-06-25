package Lecture_23;

import java.util.*;

public class Palindrome_Partitioning {

	public static void main(String[] args) {
		String ques = "nitin";
		List<String> ll = new ArrayList<>();
		List<List<String>> ans = new ArrayList<>();
		Partition(ques, ll, ans);
		System.out.println(ans);

	}

	public static void Partition(String ques, List<String> ll, List<List<String>> ans) {
		
		if (ques.length() == 0) {
			//System.out.println(ll);
			ans.add(new ArrayList<>(ll));
			return;
		}
		for (int cut = 1; cut <= ques.length(); cut++) {
			String s = ques.substring(0, cut);
			if (checkpalindrome(s) == true) {
				ll.add(s);
				Partition(ques.substring(cut), ll, ans);
				ll.remove(ll.size()-1);
			}
		}

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
