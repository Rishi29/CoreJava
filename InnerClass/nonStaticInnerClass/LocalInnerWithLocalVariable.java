package nonStaticInnerClass;

public class LocalInnerWithLocalVariable {
	
	private int data=30;
	
	void display(){
		int value= 50;//local variable inside Local inner class allowed from java 1.7 only,
					//in previous version it was not allowed
		class Local{
			void msg(){ System.out.println("value = "+value);}
			
		}
		
		Local obj1= new Local();
		obj1.msg();
		
	}
	
	public static void main(String[]args){
		LocalInnerWithLocalVariable lc= new LocalInnerWithLocalVariable();
		lc.display();
		
	}

}
