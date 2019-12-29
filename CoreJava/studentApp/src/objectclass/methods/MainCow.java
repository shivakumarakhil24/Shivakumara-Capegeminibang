package objectclass.methods;

public class MainCow {
	public static void main(String[] args) {
		
		Cow d=new Cow();
		d.id=10;
		d.ltr=5;
		d.name="rani";
		
		Cow e=new Cow();
		e.id=10;
		e.ltr=5;
		e.name="rani";
		Cow f=new Cow();
		f.id=12;
		f.ltr=7;
		f.name="Gowri";
		 System.out.println( d.equals(f));
		
		
		
	}

}
