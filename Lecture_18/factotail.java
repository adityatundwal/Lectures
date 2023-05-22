package Lecture_18;

public class factotail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		System.out.println(fact(n));
	

	}
	
	public static int fact(int n) {
		if(n==1) {
			return 1;
		}
		System.out.println(n);
		int fn = fact(n-1);
		return fn*n;
	}

}
