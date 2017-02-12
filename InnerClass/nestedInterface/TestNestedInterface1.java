package nestedInterface;

/**
 * Nested Interface: Interface declared inside another interface or class. It is used to group the 
 * related interface so that they are easy to maintain. The nested interface must be referred by the outer 
 * interface or class. It cannot be accessed directly. 
 * 
 * point to remember:
 * 
 * Nested interface must be public if it is declared inside the interface but it can have any access modifier
 * if declared within the class.
 * customException
 * Nested interfaces are declared static implicitely
 * **/



public class TestNestedInterface1 implements Showable.Message{
	
	public void msg(){System.out.println("Hello nested Interface");}
	
	public static void main(String[]args){
		Showable.Message message= new TestNestedInterface1();//Upcasting here
		message.msg();
	}

}
