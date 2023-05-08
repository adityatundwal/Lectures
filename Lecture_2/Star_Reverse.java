package lecture_2;
import java.util.Scanner;


public class Star_Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int space = n-1;
		int star = 1;
		
		while(row <= n) {
			
			//Space
			int i = 1;
			while (i <= space) {
				System.out.print("  ");
				i++;
			}
			
			//Star
			int j =1;
			while(j <= star) {
				System.out.print("* ");
				j++;
			}
			
			//Next Row prep
			
			row++;
			System.out.println();
			space--;
			star++;
		}
		
		
		
	}

}
