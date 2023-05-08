package Lecture_4;

import java.util.Scanner;

public class Break_Statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		//if number is divisble 
		int i = 2;
		int count = 0;
		
		while(i<n) {
			if (n%i==0) {
				count++;	
				break;  //break will always be inside if condition
			}
			i++;
		}
		if (count==0) {
			System.out.println("Prime");
		}
		else {
			System.out.print("Not prime");
		}

	}

}
