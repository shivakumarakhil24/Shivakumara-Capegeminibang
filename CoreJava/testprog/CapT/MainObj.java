class Marker
{
void open()
{
	System.out.println("heelo");
}
void close()
{
	System.out.println("close");
} }
class Student
{
	void rec(Marker m)
	{
		m.open();
		m.close();
	}
}

class Test
{
	void call()
	{
	Marker m=new Marker();
	Student s=new Student();
	s.rec(m);
}
}
class MainObj
{
	public static void main(String[] args)
	 {
		Test t=new Test();
		t.call();
	}
}