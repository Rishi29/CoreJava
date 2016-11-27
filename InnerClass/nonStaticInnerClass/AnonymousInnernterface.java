package nonStaticInnerClass;

/**
 * Anonymous Inner class using Interface.
 * 
 * here the eat method of interface is overridden in the Anonymous class.
 * **/

interface Edible{
	void eat();
}

public class AnonymousInnernterface {
	
	public static void main(String[]args){
		Edible e= new Edible(){
			public void eat(){
				System.out.println("nice fruit");
			}
			
		};
		
		e.eat();
	}

}
