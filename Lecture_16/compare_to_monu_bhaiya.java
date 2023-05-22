package Lecture_16;

public class compare_to_monu_bhaiya {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Kunal";
		String s2 = "Komall";
		System.out.println(Compare(s1,s2));

	}

	private static int Compare(String s1, String s2) {
		// TODO Auto-generated method stub
		
		int n = Math.min(s1.length(), s2.length());
		for (int i = 0; i < n; i++) {
			if(s1.charAt(i)> s2.charAt(i)) {
				return s1.charAt(i)-s2.charAt(i);
			}
			else if(s1.charAt(i)<s2.charAt(i)) {
				return s1.charAt(i) -  s2.charAt(i);
			}
		}
		
		return s1.length()-s2.length();
				

	}

}
