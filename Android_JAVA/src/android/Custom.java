package android;

class Custom {  
	  
	static void validate(int age)throws InvalidAgeException{  
	     if(age < 18)  
	      throw new InvalidAgeException("not valid");  
	     else  
	      System.out.println("welcome to vote");  
	   }  
	     
		public static void main(String args[]){  
	      try{  
	      validate(2);  
	      }catch(InvalidAgeException m ){System.out.println("Exception occured: "+m);}  
	  
	      System.out.println("rest of the code...");  
	  }  
	}  