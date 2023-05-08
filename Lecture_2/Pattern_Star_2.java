package lecture_2;
import java.util.Scanner;
public class Pattern_Star_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // took input for the value of n to print star
		
		
		int row = 1;
		int star = 1;
		while(row <= n) {
			int i = 1;
			while(i<=star) {
				System.out.print("* ");
				i++;
			}
			//next row
			
			row++;
			System.out.println();
			star++;
		}

	
	
	}
	

}