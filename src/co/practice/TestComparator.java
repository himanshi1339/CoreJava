package co.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import co.comparator.Employee;

public class TestComparator {
public static void main(String[] args) {
	List l =new ArrayList<Employee>();
	l.add(new Employee (3, "Himanshi" , 1500));
	l.add(new Employee (1 , "mini" , 1800));
	l.add(new Employee (2 , "Himanshi" , 1000));
	l.add(new Employee (5 , "megha" , 1600));
	
	System.out.println(l);
	Collections.sort(1, new OrderByIdAsc());
	
	for(Object object : l) {
		System.out.println(object);
	}
}
}
