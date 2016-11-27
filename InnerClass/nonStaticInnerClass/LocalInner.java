package nonStaticInnerClass;

/**
 * Local Inner class is created inside a method. TO invike the methods of local Inner class, the local class must be
 * instantiate inside the method.
 * 
 * Rules: 
 * 
 * Local variable can be private , public or protected
 * Local variable cannot be invoked from outside the class
 * 
 * */

public class LocalInner {
	
	private int data=30;//instance variable
	void display(){
	class Local{
		void msg(){System.out.println(data);}
	}
	

	Local obj= new Local();
	obj.msg();
}
	
	public static void main(String[]args){
		LocalInner obj1= new  LocalInner();
		obj1.display();
	}
	
}
