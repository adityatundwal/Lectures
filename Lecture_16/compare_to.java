package Lecture_16;
/*wrong approach*/
public class compare_to {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Kunal";
		String s2 = "Komal";
	}
	
	public static boolean Compare(String s1, String s2) {
		if(s1.length()>s2.length()) {
			return true;
		}
		else if(s1.length()==s2.length()){
			return false;
		}
		return 0;
		
	}

}
