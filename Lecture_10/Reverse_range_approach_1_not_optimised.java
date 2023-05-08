package Lecture_10;

import java.util.Iterator;

public class Reverse_range_approach_1_not_optimised {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
			int[] arr = {1,2,3,4,5,6,7};
			int k = 3;
			Reverse(arr, k);
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]+" ");
			}
		}
		
		public static void Reverse(int[] arr, int k) {
			int n = arr.length;		
			k = k % n;				//verifying if k doesn't exceed its limit
			int temp = arr[n-1];
			for (int i = n-2; i >=0; i--) {
				arr[i+1] = arr[i];	
			}
			arr[0]=temp;
			
		}
}

