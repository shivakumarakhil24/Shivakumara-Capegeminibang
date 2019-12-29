import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
class Mainclasss
{
	public static void main(String[] args) {
		
	
	System.out.println("start---------");
	HashMap hm= new HashMap();
	hm.put(1,"hello");
	hm.put(2,"hello");
	hm.put(3,"how");
	hm.put(4,"are u");
	hm.put(5,"mama");
	hm.put(3,"atthe");
	Set key=hm.keySet();
	Iterator i1=key.iterator();

	while(i1.hasNext()==true)
	{
		System.out.println(hm.get(i1.next()));
	} 
	System.out.println("end----------");
}
}
