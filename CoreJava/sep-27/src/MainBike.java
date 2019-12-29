
public class MainBike {
	public static void main(String[] args) 
	{
	Father f=new Son();
	f.bike();
	System.out.println("********FATHER**********");
	Father fr=new Father();
	fr.bike();
	fr.home();
	System.out.println("********SON**********");
	Son s=new Son();
	s.bike();
	}

}
