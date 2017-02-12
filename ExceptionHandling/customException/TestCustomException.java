package customException;

public class TestCustomException {
	
	 static void validate(int age)throws InvalidAgeException{
		 if(age<18){ throw new InvalidAgeException("not Valia age");}
		 else 
			 System.out.println("Welcom to vote");
	 }
	 
	 public static void main(String[]args){
		 try{
			 validate(13);
		 }catch( Exception m){System.out.println("Exception occured " +m);}
		 
		 System.out.println("rest of the code");
	 }

}
