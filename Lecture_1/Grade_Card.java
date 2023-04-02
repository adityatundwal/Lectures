package lecture_1;

public class Grade_Card {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//    	Marks >= 75 means A grade
//		55<= Marks < 65 Means B grade
//		45 <= Marks < 55  Means C grade
//		35<= Marks < 45 Passed
//		marks <35 Fail

		
		
		int Marks = 67;
		
		if(Marks >= 75) {
			System.out.println("Student got A+ grade");
		}
		else if(65 <= Marks && Marks < 75){
			System.out.println("Student Got A Grade");
		}
		else if(55 <= Marks && Marks < 65){
			System.out.println("Student Got B Grade");
		}
		else if(45 <= Marks && Marks < 55) {
			System.out.println("Student Got C Grade");
		}
		else if(35 <= Marks && Marks <45) {
			System.out.println("Student Got Passed");
		}
		else {
			System.out.println("Student got Failed");
		}
	}

}
