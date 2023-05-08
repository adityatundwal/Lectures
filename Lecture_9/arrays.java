package Lecture_9;

public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 9; // normal variable and type is integer
		int []arr=new int[5];	  // arr is a type of array and its one dimensional
		//int arr[] //arr is the starting point of array and its a type of address
		System.out.println(a);
		System.out.println(arr);
		System.out.println(arr[0]);   //Used to get value
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		//setting value (Hardcode);
		
		arr[0] = 10;					// updating the value inside the array
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		System.out.println();
		System.out.println("*************");
		System.out.println(arr[0]);			//getting the updated value output
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		int []other = arr;  // this will not create another array
		
		System.out.println(arr[5]);  /* will return error 
		Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
		at Lecture_9.arrays.main(arrays.java:37)*/ 

		

		

	}

}
