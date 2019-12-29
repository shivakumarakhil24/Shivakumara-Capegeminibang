package objectclass.methods;

public class MainMark implements Cloneable 
{
	int id;
	String name;

	public MainMark(int id, String name) {
		
		this.id = id;
		this.name = name;
	}
	@Override
		protected Object clone() throws CloneNotSupportedException {
			// TODO Auto-generated method stub
			return super.clone();
		}

}
