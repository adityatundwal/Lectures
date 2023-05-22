package Lecture_17;

import java.util.ArrayList;

public class ArrayList_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> ll = new ArrayList<>();
		System.out.println(ll);

		ll.add(10);
		ll.add(20);
		ll.add(30);
		System.out.println(ll);

		// To get size
		System.out.println(ll.size());
		
		ll.add(1, 40);  // this will add the value and increase the size of ll as welll
		//index ki range 0 to size;
		System.out.println(ll);
		System.out.println(ll.size());
		
		//Get
		System.out.println(ll.get(3));
		
		
		//Remove
		System.out.println(ll.remove(2));
		System.out.println(ll);
		System.out.println(ll.size());
		
		//Update
		System.out.println(ll.set(1, -1));
		System.out.println(ll);
		
		for (int i = 0; i < ll.size(); i++) {
			System.out.println(ll.get(i)+" ");
			System.out.println();
			
		}
		System.out.println();
		
		for(Integer i:ll) {
			System.out.println(i+" ");
		}

	}

}
