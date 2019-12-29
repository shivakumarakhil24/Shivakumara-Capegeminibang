abstract class Sample
{
	static int a=50;
	double d=20.3;
	public void count()
	{
		System.out.println("this is the count method");

	}
	abstract public void test();
}
class Demo extends Sample
{
	@Override
	public void test()
	{
		System.out.println("the test method is overridede");
	}

}
class Mainclass0
{
	public static void main(String[] args) {
		Demo d1=new Demo();
		d1.test();
		d1.count();
		System.out.println(d1.a);
		System.out.println(d1.d);


	}
}