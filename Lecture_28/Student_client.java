package Lecture_28;


public class Student_client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Student s 	= 	new Student();
	/*	this is		|	this is an object 
	 * a reference  |
	 * variable		|
	 * 				|
	 */
		
		//Main method chalne se pehle class ka blueprint aata hai
		System.out.println("Helo");
		Student s = new Student();
		System.out.println(s);
		s.name = "Ka";
		s.age = 12;
		System.out.println(s.name);
		System.out.println(s.age);
		s.Introduce_yourSelf();
		Student s1 = new Student();
		s1.name = "Kamlesh";
		s1.age = 18;
		s1.Introduce_yourSelf();
		s1.SayHey("Raju");
		System.out.println(Student.count);
	}

}
