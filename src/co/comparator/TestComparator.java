package co.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestComparator {
public static void main(String[] args) {
	List l = new ArrayList<Employee>();
	l.add(new Employee (1 , "Himanshi" , 1500));
	l.add(new Employee (3 , "raman" , 1000));
	l.add(new Employee (4 , "megha" , 2000));
	l.add(new Employee (2 , "shailja" , 3000));
	
	Collections.sort(l, new OrderByIdAsc());
	//Collections.sort(l, new OrderBySalaryDes());
	
	System.out.println(l);
	for(Object object:l) {
		System.out.println(object);
	}
}
}
