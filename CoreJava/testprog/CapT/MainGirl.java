class Gift
{
String msg;
public void gift()
{
	System.out.println(msg);
}
}
class Pass
{
	void pass()
	{
		Gift g=new Gift();
		g.msg="hello my dear it is precious GIFT";
		Girl gl=new Girl();
	
		gl.recive(g);
	}
}
class Girl
{
	void recive(Gift g)
	{
g.gift();
	}
}
class MainGirl
{
	public static void main(String[] args) {
		Pass p=new Pass();
		p.pass();
	}
}