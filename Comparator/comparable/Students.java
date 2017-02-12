package comparable;

public class Students implements Comparable <Students>{
	
	int rollNo;
	String name;
	int age;
	
	Students(int rollNo, String name, int age){
		this.rollNo=rollNo;
		this.name=name;
		this.age=age;
	}

	@Override
	public int compareTo(Students st) {
		if(this.age==st.age) return 0;
		else if(this.age>st.age)return 1;
		else return -1;
	}

}
