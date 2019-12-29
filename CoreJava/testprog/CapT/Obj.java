class Obj
{
	int a=10;
}
class MainObj
{
	public static void main(String[] args) {
		Obj ob=new Obj();
		System.out.println(ob.hashcode());
	}
}