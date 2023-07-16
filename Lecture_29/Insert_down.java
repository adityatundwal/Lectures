package Lecture_29;

import java.util.Stack;

public class Insert_down {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// insert 60 at the first index or insert 60 in stack

		Stack<Integer> st = new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		System.out.println(st);
		Insert(st, 60);
		System.out.println(st);

	}

	private static void Insert(Stack<Integer> st, int item) {
		// TODO Auto-generated method stub
		if (st.isEmpty()) {
			st.push(60);
			return;
		}
		int x = st.pop();
		Insert(st, item);
		st.push(x);
	}

}
