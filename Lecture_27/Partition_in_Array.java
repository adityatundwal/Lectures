package Lecture_27;

public class Partition_in_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []arr = {5,7,2,3,8,1,4};
		int idx = Partition(arr,0,arr.length-1);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println(idx);

	}

	private static int Partition(int[] arr, int si, int ei) {
		// TODO Auto-generated method stub
		int item = arr[ei];
		int pi = si;
		for (int i = si; i < ei; i++) {
			if(arr[i]<item) {
				int temp = arr[pi];
				arr[pi] = arr[i];
				arr[i] = temp;
				pi++;
			}
			
		}
		
		int temp = arr[pi];
		arr[pi] = arr[ei];
		arr[ei] = temp;
		
		return 0;
	}

}
