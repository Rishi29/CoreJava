package staticNestedClass;

/**
 *A static class created in a class is called nested static class. It cannot access 
 *non-static data members and methods. It can be accessed by outer class name.
 *
 * It can access static data members of outer class including private.
 * Static nested class cannot access non-static (instance)data member or method
 **/

public class StaticNested {

	static int data=30;
	static class Inner{
		void msg(){System.out.println(" data "+data);}
	}
	
	public static void main(String[]args){
		
		//here Inner class is static so we can access the Inner class by Outer class name , no 
		//need to create instance. But to access the method of Inner class we need to create instance
		//as its method is not static.
		
		StaticNested.Inner obj= new StaticNested.Inner();
		obj.msg();
	}

}
