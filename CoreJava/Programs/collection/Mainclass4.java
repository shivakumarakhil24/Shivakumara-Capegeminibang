import java.util.TreeSet;
import java.util.Comparator;
import java.util.Iterator;

class DescOrder implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		String str1=(String)obj1;
		String str2=(String)obj2;

		return str2.compareTo(str1);
	}
}
class LenOrder implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		String str1=(String)obj1;
		String str2=(String)obj2;

		return str2.length() - str1.length();
	}
}
class Mainclass4
{
	public static void main(String[] args)
    {
		System.out.println("Prog start");
		DescOrder d1=new DescOrder();
		LenOrder l1=new LenOrder();
		TreeSet t1=new TreeSet(l1);
		t1.add("dotnet");
		t1.add("erp");
		t1.add("android");
		t1.add("c");
		t1.add("frontEnd");
		t1.add("dotnet");
		Iterator i1=t1.iterator();
		while(i1.hasNext()==true)
		{
			System.out.println(i1.next());
		}
	}
	}
	

