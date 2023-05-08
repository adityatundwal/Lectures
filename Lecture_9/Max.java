package Lecture_9;

import java.util.Iterator;

public class Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {2,3,1,17,5,8};
		System.out.println(max(arr));

	}
	
	public static int max(int[] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(max<arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}

}
