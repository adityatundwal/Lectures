package Lecture_9;

public class array_swap3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stud
				int[] arr = { 10, 20, 30, 40, 50 };
				int[] other = { 100, 200, 300, 400 };
				System.out.println(arr[0] + " " + other[0]);// 10 100 
				Swap(arr, other);							//passing address from here is called reference
				System.out.println(arr[0] + " " + other[0]);// 

			}/*Java is call by value also this code won't work as the swap function is using local changes*/

			public static void Swap(int[] arr, int[] other) {

				int[] temp = arr;
				arr = other;
				other = temp;

	}

}
