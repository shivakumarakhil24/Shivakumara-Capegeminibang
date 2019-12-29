import java.util.TreeSet;
import java.util.Iterator;
class New 
{
 public static void main(String[] args)
  { 
  	TreeSet tr=new TreeSet();
  	tr.add("helan");
  	tr.add("solley");
  	tr.add("peter");
  	tr.add("england");
  	tr.add("arrow");
  	tr.add("black bird");
  	tr.add("chavis");
  	tr.add("darkland");
  	Iterator i1=tr.iterator();
  	while(i1.hasNext()==true)
  	{
  		System.out.println(i1.next());
		
	}
  	}
}