class Jspiders
{
	 int count=0;
	 static int total=0;
	void swipecard()
	{
		count++;
		total++;

	}
}
class MainJspiders
{
	public static void main(String[] args) {
		Jspiders btr=new Jspiders();
		btr.swipecard();
		btr.swipecard();
		Jspiders btm=new Jspiders();
		btm.swipecard();
	
       Jspiders otr=new Jspiders();
		otr.swipecard();
		otr.swipecard();
		System.out.println(otr.count);
		System.out.println(Jspiders.total);
		System.out.println("btm is"+btm.count);


	}
}