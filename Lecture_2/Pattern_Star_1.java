package lecture_2;

//Nested LOOP

import java.util.Scanner;

public class Pattern_Star_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		int row = 1;
		int star = n;
		while(row <= n) {
			//Starloop
			
			int i = 1;
			while(i <= star) {
				System.out.print("*"+" ");
				i++;
			}
			//next row
			
			row++;
			System.out.println();
		}

	}

}
