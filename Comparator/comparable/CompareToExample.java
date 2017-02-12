package comparable;

import java.util.ArrayList;
import java.util.Collections;

public class CompareToExample {
	
	public static void main(String[]args){
		ArrayList<Students>al= new ArrayList<Students>();
		al.add(new Students(101,"Rishi",24));
		al.add(new Students(102,"Priyanka",20));
		al.add(new Students(103,"Rishikesh",23));
		
		System.out.println("Before sorting");
		
		for(Students st: al){
			System.out.println(st.rollNo +" "+st.name+" "+st.age);
		}
		System.out.println();
		System.out.println();
		System.out.println("****************************");
		
		System.out.println("After sorting");
		
		Collections.sort(al);
		for(Students st:al){
			System.out.println(st.rollNo +" "+st.name+" "+st.age);
		}
	}

}
