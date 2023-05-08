package Lecture_9;

import java.util.Iterator;

public class linear_searchQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {2,3,1,7,5,8};
		int item = 5;
		System.out.println(Search(arr,5));
		}
	
	public static int Search(int [] arr, int item) {
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]==item) {
				return i;
			}
		}
		
		return 0;
	}

}
