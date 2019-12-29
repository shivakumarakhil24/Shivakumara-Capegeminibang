class Pen 
{
	int cost=100;
	public static void write()
	{
		System.out.println("pen is writing");

	}
	class Mainclass
	{
		public static void main(String[] args) 
		{
			Pen p=new Pen();
			System.out.println(p.cost);
			p.write();
		}
	}
}