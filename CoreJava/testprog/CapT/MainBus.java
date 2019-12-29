class Bus
{
	String name;
	int seat;
	
	void move()
	{
		System.out.println("its moving");
	}
}
class MainBus
{
	public static void main(String[] args) {
		Bus b=new Bus();
		b.seat=10;
		b.name="redbus";
		System.out.println(b.seat);
		System.out.println(b.name);
		b.move();
	}
}