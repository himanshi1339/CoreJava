package co.practice;
public class Employee implements Comparable<Employee>{
	
	int id;
	String name;
	int salary;
	
	public Employee(int id , String name , int salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	@Override
	public int compareTo(Employee o) {
		if (this.name==o.name)
		return this.salary-o.salary;
		return this.id-o.id ;
	}


	@Override
	public String toString() {
		return id + " " + name+ " " + salary;
	}
	

}
