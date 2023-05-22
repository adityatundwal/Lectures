package Lecture_18;

public class factotailmonubhaiy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fact(4,1));

	}
	
	public static int fact(int n, int ans) {
		if(n==1) {
			return ans;
		}
		
		return fact(n-1, ans*n);
	}

}
