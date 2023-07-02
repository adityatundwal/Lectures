package Lecture_28;

public class Person_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		Person p = new Person();
						//Thiss is a method calling
//		System.out.println(p.name);
//		System.out.println(p.age);
//		Person p1 = new Person();
//		p1.name = "Kaju";
//		System.out.println(p1.name);
//		System.out.println(p.name);
		Person p2 = new Person("Hardik",28);
		//p2.age = 90;
		p2.setAge(-78);
		p2.setName("Raj");
		System.out.println(p2.getName());
		System.out.println(p2.getAge());
	}

}
