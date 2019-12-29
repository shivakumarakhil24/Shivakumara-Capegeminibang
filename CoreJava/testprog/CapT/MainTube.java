class Tube
{
	int a=30;
	static int b=200;
	void on()
	{
		System.out.println("it on method non static");
	}
	static void off()
	{
		System.out.println("it is off method of static");
	}
}
class MainTube
{
	public static void main(String[] args) {
		Tube tb=new Tube();
		
		tb.on();
		System.out.println(tb.a);
		System.out.println(Tube.b);
		Tube.off();

	}
}