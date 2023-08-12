package Lecture_33;

public class LInkedList_Client {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		ll.addFirst(10);
		ll.addFirst(20);
		ll.addFirst(30);
		ll.Display();
		ll.addatindex(-9,2);
		ll.Display();
		System.out.println(ll.getfirst());
		System.out.println(ll.removefirst());
		ll.Display();
		System.out.println(ll.removeatindex(2));
		ll.Display();
	}

}
