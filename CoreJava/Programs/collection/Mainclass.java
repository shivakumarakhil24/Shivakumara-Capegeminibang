import java.util.TreeSet;
import java.util.Iterator;
class Mainclass
{
	public static void main(String[] args)
	 {
		System.out.println("Ramesh crush names");
		TreeSet t1=new TreeSet();
		t1.add("Priyanka");
		t1.add("Namratha");
		t1.add("Arpitha");
		t1.add("Pooja  D T");
		t1.add("Shilpa");
		Iterator i1 =t1.iterator();
		while(i1.hasNext()==true)
		{
			System.out.println(i1.next());
		}
		System.out.println("End with 0wsome breakupP");
	} 
}