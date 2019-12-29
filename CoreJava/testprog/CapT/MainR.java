
 class Pencil 
{
Pencil(){
	System.out.println("heloo");
}
}
class Rubber extends Pencil
{
	Rubber()
	{
		System.out.println("world");
	}
	Rubber(int a)
	{
		System.out.println("number");
	}
}
class MainR
{
	public static void main(String[] args) {
		Rubber r=new Rubber(78);
		Rubber i=new Rubber();
	}
}
