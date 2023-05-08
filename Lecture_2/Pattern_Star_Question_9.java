package lecture_2;
import java.util.Scanner;

public class Pattern_Star_Question_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);   //Input
		int n = sc.nextInt(); 
		int row = 1;
		int space = n-1;
		int star = 1;
		
		while (row<=n) {
			
			//Space
			int i = 1;
			while (i <= space) {
				System.out.print("  ");
				i++;
			}
			
			//star
			int j = 1;
			while(j<= star) {
				System.out.print("* ");
				j++;
			}
			
			//Next row Prep
			row++;
			System.out.println();
			space--;
			star+=2;
		}
	}

}
