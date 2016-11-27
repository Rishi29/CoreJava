package nonStaticInnerClass;

/**
 * Anonymous class have no name. It is used to override the method of class or Interface 
 * of a class. It can be created in two ways: 1) Class 2)Interface
 * 
 * A class is created but its name is provided by the compiler which extends the person 
 * class and provides the implementation of the eat() method.
 * 
 * Object of Anonymous class is created that is referred by p reference variable of person Type.
 * **/

abstract class Person{
	abstract void eat();
}

public class AnonymousInnerClass {
	
public static void main(String[]args){
	Person p= new Person(){
		void eat(){
			System.out.println("Nice fruit");
		}
	};
	
	p.eat();
}


}
