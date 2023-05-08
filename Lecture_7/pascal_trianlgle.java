package Lecture_7;
import java.util.Scanner;

public class pascal_trianlgle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		int row = 0;
		int star = 1;
		// row will be n and i will be r in ncr formula
		
		//ncr formula = ncr+1 = ncr*(n-r)/r+1
		while(row<n) {
			int i = 0;
			int val = 1;
			while(i<star) {
				System.out.print(val+" ");
				val = (val*(row-i))/(i+1);
				i++;
			}
			row++;
			star++;
			System.out.println();
		}
		
		
		

	}

}
