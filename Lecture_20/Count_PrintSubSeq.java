package Lecture_20;

public class Count_PrintSubSeq {

	public static void main(String[] args) {
		String str = "abc";
		PrintSubSeq(str, "");
		System.out.println(count);

	}
	
	static int count = 0;
	
	public static void PrintSubSeq(String ques, String ans) {
		if(ques.length()==0) {
			System.out.println(ans+" ");
			count++;
			return;
		}
		
		char ch = ques.charAt(0); //Separating a;
		PrintSubSeq(ques.substring(1), ans);
		PrintSubSeq(ques.substring(1), ans+ch);


	}

}
