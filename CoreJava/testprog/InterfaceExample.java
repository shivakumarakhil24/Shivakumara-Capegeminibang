interface  Sample
{
	static int a=50;
	double d=20.3;
	
	public void test();
}


class Demo impelments Sample

{
	@Override
	public void test()
	{
		System.out.println("the test method is overridede");
	}

}

class InterfaceExample
{
	public static void main(String[] args)
	 {
		Demo d1=new Demo();
		d1.test();
		
		System.out.println(Sample.a);
		System.out.println(Sample.d);


	}
}