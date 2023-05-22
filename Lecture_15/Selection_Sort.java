package Lecture_15;

public class Selection_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 2, 3, 1, 8, 4, 7 };
		SelectionSot(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void SelectionSot(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int minindex = i;

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[minindex]) {
					minindex = j;
				}
			}

			if (minindex != i) {
				int temp = arr[i];
				arr[i] = arr[minindex];
				arr[minindex] = temp;
			}
		}

	}

}
