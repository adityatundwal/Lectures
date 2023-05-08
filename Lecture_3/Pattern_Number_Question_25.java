package Lecture_3;
import java.util.Scanner;

public class Pattern_Number_Question_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		int row = 1;
		int space = n-1;
		int star = 1;
		int count = 1;
		
		while(row <= n) {
			
			int i = 1;						//here we have created a space counter and every time space is equal to n-1 this loop will run
			while(i <= space) {
				System.out.print("\t");
				i++;
				}
			
			
			int j = 1;					// here we have created a space counter and it will run until it matches the value of n
			while(j <= star) {
				System.out.print(count+"\t");
				j++;
				count++;
			}
			
			row++;								//	we are incrementing the value of row as usual
			System.out.println();				//printing a blank line 
			space--;							//decreasing the value of space everytime loop runs
			star+=2;							//increasing the value of loop by 2 everytime the loop runs
			
		}
	}

}

