package Lecture_29;
import java.util.*;
public class Stacks_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating a stack
		Stack<Integer> st = new Stack<>();
		//Inserting 
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		//Last value add kari hai wo print hoti hai
		System.out.println(st.peek());
		//Ye hamara pura stack print karega
		System.out.println(st);
		//Ye hmari jo last value added hai use delete
		System.out.println(st.pop());
		//Updated stack print karega,
		System.out.println(st);
		//Stack Size
		System.out.println(st.size());
		//
		System.out.println(st.isEmpty());
		

	}

}
