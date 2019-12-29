
public class MainType 
{
public static void main(String[] args) {
	TypeC tc=new TypeD();
	TypeD td=(TypeD)tc;
	System.out.println(td.a);
	System.out.println(td.t);
	td.read();
	tc.read();
	td.costing();
	int m=10221;
	byte y=(byte)m;
	System.out.println(y);
}
}
