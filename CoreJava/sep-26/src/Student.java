
public class Student 
{
String name;
int id;
double percent;
public Student(String name, int id, double percent) {
	this.name = name;
	this.id = id;
	this.percent = percent;
}

void show() 
{
	System.out.println(name+"  "+id+"  "+percent);
}
}