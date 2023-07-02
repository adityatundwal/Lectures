package Lecture_28;

public class Person {
	
	//int age;
	//String name;
	
	private int age = 20;
	private String name = "Kamlesh";
	
	
	//This is a parameterized constructer
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		
	}
	
	
	//This is a non parameterized constructer
	//Java apne behalf pe class bana raha tha
	public Person() {
		
	}

	//Source se generate
	//throws batata hai ki method 
	//ke andar abnormal behaviour maybe aa sakta hai
	public int getAge() {
		
		return age;
	}


//	public void setAge(int age)throws Exception {
//		if(age<0) {
//			throw new Exception("Warning ! Age cannot be -ve");
//		}
//		this.age = age;
//	}
	
	public void setAge(int age) {
		
		try {
			//Danger code goes here
			if(age<0) {
				throw new Exception("Warning ! Age cannot be -ve");
			}
			this.age = age;
		}catch (Exception e) {
			e.printStackTrace();
		}
		//this always runs
		finally {
			System.out.println("In finally block");
		}
	}



	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
//	public void SetAge(int age) {
//		this.age = age;
//	}
//	
//	public void SetName(String name) {
//		this.name = name;
//	}
//	
//	public int GetAge() {
//		return age;
//	}
//	public String GetName() {
//		return name;
//	}
	

}
