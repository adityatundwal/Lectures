package Lecture_12;

public class Insertion_Sort_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []arr = {2, 3, 4, 5, 6, 1};
		
		

	}
	
	public static void sort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			Insert_Position(arr, i);
			
		}
	}
	
	public static void Insert_Position(int[] arr, int j) {
		int item = arr[j];
		int i = j-1;
		while(i>=0 && arr[i]>= item) {
			arr[i+1] = arr[i];
			i--;
		}
		i++;
		arr[i] = item;
	}
}
