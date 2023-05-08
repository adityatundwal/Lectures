package Lecture_12;

public class kadenes_algorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int MaxSum(int[] arr) {
			int ans = Integer.MIN_VALUE;  //-2^31
			int sum = 0;
			for (int i = 0; i < arr.length; i++) {
				sum+=arr[i]; 
				ans = Math.max(ans, sum);
				if(sum<0) {
					sum = 0;
				}
			}
			return ans;
		}

}
