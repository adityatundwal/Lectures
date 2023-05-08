package Lecture_3;

import java.util.Scanner;

public class Patttern_Question_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 21
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int star = 1;
		int space = 2 * n - 3;
		int row = 1;

		while (row <= n) {  //Always remeber to take the value n here for comparison not star or something else

			// Star
			int i = 1;
			while (i <= star) {
				System.out.print("* ");
				i++;
			}

			int j = 1;
			while (j <= space) {
				System.out.print("  ");
				j++;
			}

			int k = 1;
			if (row == n) { // Used to stop extra output
				k = 2;
			}
			while (k <= star) {
				System.out.print("* ");
				k++;
			}
			System.out.println();
			row++;
			space -= 2;
			star++;
		}

	}

}
