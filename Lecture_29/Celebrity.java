package Lecture_29;

import java.util.Stack;

public class Celebrity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 0, 1, 1, 1 }, { 1, 0, 1, 1 }, { 0, 0, 0, 0 }, { 1, 1, 1, 0 } };
		System.out.println(CelebrityFind(arr));

	}

	private static int CelebrityFind(int[][] arr) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();
		for (int i = 0; i < arr.length; i++) {
			st.push(i);
		}
		while (st.size() > 1) {
			int a = st.pop();
			int b = st.pop();
			if (arr[a][b] == 1) {
				st.push(b);
			} else {
				st.push(a);
			}
		}
		int candidate = st.pop();
		for (int i = 0; i < arr.length; i++) {
			if (arr[candidate][i] == 1) {
				return -1;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (i != candidate && arr[i][candidate] == 0) {
				return -1;
			}
		}
		return candidate;
	}

}