package Lecture_9;

public class rough {
	
	   public static void main(String[] args) {

	        int []a = {7,100,1,62,57,33,46,32,15,95,80,83,70,90,65};

	        int item = 83;
	        Search(a, item);

	        
	    }

	    public static int Search(int []a , int item) {

	        for (int i = 0; i < a.length; i++) {

	            if(a[i]==item){
	                return i;
	            }
	        }

	        return 0;
	        
	    }
	    
	}

