package Lecture_12;

public class Insertion_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []arr = {2, 3, 4, 5, 6, 1};
		System.out.println(Insert_Position(arr));
		

	}
	
	public static int Insert_Position(int[] arr) {
		int item = arr[arr.length-1];
		int i = arr.length-2;
		while(i>=0 && arr[i]>= item) {
			arr[i+1] = arr[i];
			i--;
		}
		i++;
		arr[i] = item;
		
		return i;
	}
}
