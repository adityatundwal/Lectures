package Lecture_19;

public class Sub_Sequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "abc";
		PrintSubSeq(str, "");

	}
	
	public static void PrintSubSeq(String ques, String ans) {
		if(ques.length()==0) {
			System.out.println(ans+" ");
			return;
		}
		
		char ch = ques.charAt(0); //Separating a;
		PrintSubSeq(ques.substring(1), ans);
		PrintSubSeq(ques.substring(1), ans+ch);
	}

}
