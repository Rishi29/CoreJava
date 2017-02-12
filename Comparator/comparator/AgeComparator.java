package comparator;

import java.util.Comparator;

public class AgeComparator implements Comparator {

	@Override
	public int compare(Object obj1, Object obj2) {
		
		Students s1= (Students) obj1;
		Students s2= (Students)obj2;
		
		if(s1.age==s2.age) return 0;
		else if(s1.age>s2.age) return 1;
		else return -1;
	}

}
