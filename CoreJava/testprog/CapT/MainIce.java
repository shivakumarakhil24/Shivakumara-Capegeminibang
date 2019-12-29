class Ice
{
	void open()
	{
		System.out.println("icecrm is ready to eat");
	}

}
class Pass
{
	void pass(Ice i)
	{
		
		
			i.open();
		
	}
}
class Baby
{
	void eat()
	{
      Pass p=new Pass();
      Ice ic=new Ice();
      p.pass(ic); 
	}
}
class MainIce
{
	public static void main(String[] args) {
		Baby b=new Baby();
		b.eat();
	}
}