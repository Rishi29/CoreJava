package staticNestedClass;

public class StaticNestedWithStaticMethod {
	
	static int data= 30;
	static class Inner{
		static void msg(){System.out.println("data "+data);}
	}
	
	public static void main(String[]args){
		
		//here we don't need to create object to access the Inner class as well as its method
		//because both of them are static 
		StaticNestedWithStaticMethod.Inner.msg();
	}

}
