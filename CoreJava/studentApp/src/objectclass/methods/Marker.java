package objectclass.methods;

public class Marker {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		MainMark c=new MainMark(1,"my");
		
		System.out.println(c.id);
		System.out.println(c.name);
		
		Object r = c.clone();
		
		System.out.println(c.id);
		System.out.println(c.name);

} }
