package co.practice;

public class Person {
    private String name;
	private int age;
	private int salary;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}public static void main(String[] args) {
		Person p=new Person();
		p.setName("himanshi");
		p.setAge(23);
		p.setSalary(200000);
		System.out.println(p.getName());
		System.out.println(p.getAge());
		System.out.println(p.getSalary());
	}
}
