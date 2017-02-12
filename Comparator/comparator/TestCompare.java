package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestCompare {
	
	public static void main(String[]args){
		ArrayList al= new ArrayList();
		al.add(new Students(1,"Rishi",25 ));
		al.add(new Students(2,"Priyanka",21));
		al.add(new Students(3,"Rishikesh",28));
		al.add(new Students(4,"Anuj",29));
		
		
		System.out.println("Before Sorting");
		Iterator itr= al.iterator();
		while(itr.hasNext()){
			Students st=(Students)itr.next();
			System.out.println(st.rollNo+" "+st.name+" "+st.age);
		}
		System.out.println();
		System.out.println();
		System.out.println("************************************");
		System.out.println("After Sorting by Age");
		
		Collections.sort(al, new AgeComparator());
		
		Iterator itr1= al.iterator();
		while(itr1.hasNext()){
			Students st=(Students)itr1.next();
			System.out.println(st.rollNo+" "+st.name+" "+st.age);
			
		}
			System.out.println();
			System.out.println();
			System.out.println("************************************");
			System.out.println("After Sorting by Name");
			
			Collections.sort(al, new NameComparator());
			
			Iterator itr2= al.iterator();
			while(itr2.hasNext()){
				Students st=(Students)itr2.next();
				System.out.println(st.rollNo+" "+st.name+" "+st.age);

		}  
		
		
		}
		

}
