package lecture_1;

public class Post_Increment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 67;
//		System.out.println(a++);  //Post increment value will be changed at last for example in this the value will be printed first
//		System.out.println(a);
		
		int c = a++ -8 + a-- + a++;
		System.out.println(c);

	}

}
