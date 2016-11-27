package nonStaticInnerClass;

/**
 *  A Member inner class is created inside a class but outside a method.
 *  In this case compiler create two class file. The class file name of inner class is 
 *  "Outer$Inner".
 *  To instantiate the inner class, we need to create the instance of outer class. In 
 *  such case, instance of inner class is created inside the instance of outer class.
 * 
 * **/

public class MemberInnerClass {
	
	private int data=30;
	
	class Inner{
		void msg(){
			System.out.println("Data is "+data);
		}
	}
	 
	public static void main(String[]args){
		//MemberInnerClass.Inner in= new MemberInnerClass.Inner();
		// Since Inner class in not static , so it cannot be accessed by class name, It must be accessed by object .
	MemberInnerClass obj= new MemberInnerClass();
	MemberInnerClass.Inner in= obj.new Inner();
		
		
		//StaticNested.Inner obj= new StaticNested.Inner();
		 in.msg();
	
	}

}
