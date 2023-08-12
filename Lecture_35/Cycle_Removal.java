package Lecture_35;

import Lecture_33.LinkedList.Node;

public class Cycle_Removal {

	public class Node {
		int val;
		Node next;
	}

	private Node head;
	private Node tail;

	private int size;

	public void addFirst(int item) {
		Node nn = new Node();
		nn.val = item; // First Node
		if (size == 0) {
			head = nn;
			tail = nn;
			size++;
		} else {
			nn.next = head;
			head = nn;
			size++;
		}
	}

	public void addLast(int item) {
		if (size == 0) {
			addFirst(item);
		} else {
			Node nn = new Node();
			nn.val = item;
			tail.next = nn;
			tail = nn;
			size++;
		}
	}

	public void Display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.val + " --> ");
			temp = temp.next;
		}
		System.out.println(".");
	}

	public Node getNode(int k) throws Exception {

		if (k < 0 || k >= size) {
			throw new Exception("Index Valid dedo bklol");
		}
		Node temp = head;
		for (int i = 1; i <= k; i++) {
			temp = temp.next;
		}
		return temp;
	}

	public void CreateCycle() throws Exception {
		tail.next = getNode(2);

	}

	public Node HasCycle() {
		Node fast = head;
		Node slow = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				return slow;
			}
		}
		return null;
	}

	public void removalCycle1() {
		Node meet = HasCycle();
		if (meet == null) {
			return;
		}
		Node slow = head;
		while (slow != null) {
			Node temp = meet;
			while (temp != meet) {
				if (temp.next == slow) {
					temp.next = null;
					return;
				}
				temp = temp.next;
			}
			slow = slow.next;
		}
	}
	
	
	public void removalCycle2() {
		Node meet = HasCycle();
		if(meet == null) {
			return;
		}
		
		//length of cycle
		int count = 1;
		Node temp = meet;
		while(temp.next!=meet) {
			count++;
			temp = temp.next;
			
		}
		
		//fast ko move kra do m distance
		Node fast = head;
		for (int i = 0; i < count; i++) {
			fast = fast.next;
		}
		
		
		//cycle removal
		
		Node slow = head;
		while(slow.next!=fast.next) {
			slow = slow.next;
			fast = fast.next;
		}
		
		fast.next = null;
	}
	
/** Importabt ++++++++++++++++++++++++++++++++++++*/	
	public void floyedCycle() {
		Node meet = HasCycle();
		if(meet == null) {
			return;
		}
		
		Node fast = meet;
		Node slow = head;
		while(slow.next!=fast.next) {
			slow = slow.next;
			fast = fast.next;
		}
		fast.next = null;
	}

	public static void main(String[] args) throws Exception {
		Cycle_Removal cy = new Cycle_Removal();
		cy.addLast(1);
		cy.addLast(2);
		cy.addLast(3);
		cy.addLast(4);
		cy.addLast(5);
		cy.addLast(6);
		cy.addLast(7);
		cy.addLast(8);
		cy.Display();
		System.out.println();
		cy.CreateCycle();
	
		cy.removalCycle1();
		cy.Display();
		System.out.println();
		cy.Display();

	}

}
