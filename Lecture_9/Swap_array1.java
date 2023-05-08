package Lecture_9;

public class Swap_array1 {
	
	/*swap will happen but it wont reflect*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []array1= {10,20,30,40,50};  //hardcoded array
		
		System.out.println(array1[0]+" "+array1[1]);
		
		Swap(array1[0],array1[1]);
		System.out.println(array1[0]+" "+array1[1]);

	}
	
	public static void Swap(int a , int b) {
		int c = a;
		a = b;
		b = c;
	}

}
