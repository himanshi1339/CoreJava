package sets;

public class TestEmployeeHashcode {
public static void main(String[] args) {
	
	Employee e1 = new Employee(1, " abcd " , 1000);
	
	Employee e2 = new Employee(1, " abcd " , 2000);
	
	System.out.println(e1);
	System.out.println(e2);
	System.out.println(e1.hashCode()==e2.hashCode());
}
}
