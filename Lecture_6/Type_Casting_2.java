package Lecture_6;

public class Type_Casting_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x =  90;
		
		x +=1; //x = (int)(x+1); implicit typecasting
		byte b = 9;
		b+=1; //b = (byte)(b+1);
		b = (byte)(b+1);
		b++; // this is also implicit typecasting
		long l = 68435468616l; //after nine numbers you have to write l same as float to convert it to literal long; //Explicit

	}

}
