package Lecture_32;

import java.util.*;
import java.util.Stack;
import java.util.*;

public class stock_submission {
	public static void main(String args[])  {
		// Your Code Her	
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int []arr = new int [n];
	for(int i = 0; i<arr.length; i++){
		arr[i] = sc.nextInt();
	}
	Span(arr);

	
	}
	
	public static void Span(int[] arr) {
		int[] ans = new int[arr.length];
		Stack<Integer> st = new Stack<>();
		for (int i = 0; i < ans.length; i++) {
			while (!st.isEmpty() && arr[i] >= arr[st.peek()]) {
				st.pop();
			}
			if (st.isEmpty()) {
				ans[i] = i + 1;
			} else {
				ans[i] = i - st.peek();
			}
			st.push(i);
		}

		for (int i = 0; i < ans.length; i++) {
			System.out.println(ans[i] + " ");
		}

	}
}