package Lecture_33;

import org.w3c.dom.NodeList;

public class LinkedList {

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

	private Node getNode(int k) {
		Node temp = head;
		for (int i = 0; i < k; i++) {
			temp = temp.next;
		}
		return temp;
	}

	public void addatindex(int item, int k) throws Exception {
		if (k < 0 || k > size) {
			throw new Exception("Good Job out of the size");
		}

		if (k == 0) {
			addFirst(item);
		} else if (k == size) {
			addLast(item);
		} else {
			Node k_1 = getNode(k - 1);
			Node nn = new Node();
			nn.val = k;
			nn.next = k_1.next;
			k_1.next = nn;
			size++;
		}
	}

	public int removefirst() {
		Node temp = head;
		if (size == 1) {
			head = null;
			tail = null;
		}
		{
			head = head.next;
			temp.next = null;
		}
		size--;
		return temp.val;
	}

	public void Display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.val + " --> ");
			temp = temp.next;
		}
		System.out.println(".");
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

	public int getfirst() {
		return head.val;
	}

	public int getlast() {
		return tail.val;
	}

	public int getatindex(int k) {
		return getNode(k).val;
	}
	
	public  int removelast() {
		if(size==1) {
			return removefirst();
		}
		else {
			Node sn = getNode(size-2);
			Node temp = tail;
			tail = sn;
			tail.next = null;
			size--;
			return temp.val;
		}
	}
	
	public int size() {
		return size;
	}
	
	public int removeatindex(int k) {
		if(k==0) {
			return removefirst();
		}
		if(k==-1) {
			return removelast();
		}
		else {
			Node prev = getNode(k-1);
			Node curr = getNode(k);
			prev.next = curr.next;
			curr.next = null;
			size--;
			return curr.val;
		}
	}

}
