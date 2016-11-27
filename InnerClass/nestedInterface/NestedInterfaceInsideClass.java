package nestedInterface;

class A{
	interface Message{
		void msg();
	}
}

public class NestedInterfaceInsideClass implements A.Message {
	
	public void msg(){System.out.println("hello nested interface");}
	
	public static void main(String[]args){
		A.Message message= new NestedInterfaceInsideClass();//upcasting here
				message.msg();
	}

}
