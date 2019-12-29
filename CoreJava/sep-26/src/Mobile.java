
public class Mobile
{
public static void main(String[] args) 
{
	Gen3 sm=new Gen3();
	System.out.println("GEn3^^^^^^^^^^^^^^^^^^^^^^");
	sm.call();
	sm.msg();
	sm.radio();
	sm.camera();
	Gen2 sm1=new Gen2();
	System.out.println("GEn2#####################");
	sm1.call();
	sm1.msg();
	sm1.radio();

	Gen1 b=new Gen1();
	System.out.println("gen1********************");
	b.call();
	b.msg();
	
	
}
}
