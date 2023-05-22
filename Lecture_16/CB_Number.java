package Lecture_16;

import java.util.Iterator;

public class CB_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "81615";
		System.out.println(isCBNumber(s));

	}

	public static int countcd(String s) {
		int count = 0;
		boolean[] visited = new boolean[s.length()];

		for (int len = 1; len <= s.length(); len++) {
			System.out.println();
			for (int j = len; j <= s.length(); j++) {
				int i = j - len;
				String s1 = s.substring(i, j);
				long num = Long.parseLong(s1);
				if (isCBNumber(num) == true && isvisited(visited, i, j)==true) {
					count++;
					for (int k = i; k <= j; k++) {
						visited[k] = true;
					}
				}
			}
		}
		return count;
	}

	private static boolean isvisited(boolean[] visited, int i, int j) {
		// TODO Auto-generated method stub
		for (int k = i; k <= j; k++) {
			if(visited[k]==true) {
				return false;
			}
		}
		return true;
		
	}

	public static boolean isCBNumber(long num) {
		if (num == 0 || num == 1) {
			return false;
		}
		int[] arr = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };

		for (int i = 0; i < arr.length; i++) {
			if (num == arr[i]) {
				return false;
			}
		}
		return false;
	}

}
