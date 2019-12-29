interface Run
{
	int a=20;
   public void test();

}
class Sample imeplements Run
{
	@Override
	public void test()
	{
		System.out.println("method is overruided");
	}
}
class Maincals
{
	public static void main(String[] args) {
	
 Sample s1 = new Sample();
System.out.println( Sample.a);
s1.test();
		
		
	}
}