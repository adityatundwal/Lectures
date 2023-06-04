package Lecture_20;
import java.util.Iterator;

public class String_Permutation {

	public static void main(String[] args) {
		
		String str = "abc";
		Permutate(str,"");
		
		
	}

	private static void Permutate(String ques,String ans) {
		// TODO Auto-generated method stub
		
		if(ques.length()==0) {
			System.out.println(ans+" ");
			return;
		}
		for (int i = 0; i < ques.length(); i++) {
			String s1 = ques.substring(0,i);
			String s2 = ques.substring(i+1);
			Permutate(s1+s2, ans+ques.charAt(i));
		}
		
	}

}
