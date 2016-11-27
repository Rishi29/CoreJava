package nestedInterface;




public class TestNestedInterface1 implements Showable.Message{
	
	public void msg(){System.out.println("Hello nested Interface");}
	
	public static void main(String[]args){
		Showable.Message message= new TestNestedInterface1();//Upcasting here
		message.msg();
	}

}
