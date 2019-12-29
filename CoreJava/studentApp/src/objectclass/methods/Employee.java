package objectclass.methods;

public class Employee {
	String name;
	int id;
	double salary;
	String company;
	public Employee(String name, int id, double salary, String company) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.company = company;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + ", company=" + company + "]";
	}
	
}
