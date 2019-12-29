package objectclass.methods;

public class Student {
	int id;
	String name;
	Double percentage;
	public Student(int id, String name, Double percentage) {
		this.id = id;
		this.name = name;
		this.percentage = percentage;
		
	}
	public String toString() {
		return "My name"+name+"My id"+id+"My percent"+percentage;
	}

}
