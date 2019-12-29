import java.util.*;
class Listt 
{
	public static void main(String[] args) 
	{
	
	List<Integer> ls= new ArrayList<Integer>();
	
	for (int i=3; i<=9;i++ )
	 {
	  if(i%2!=0)
	 	{
	 		ls.add(i);
	 	
	 
	     }
	 }
	 for(int j=0;j<ls.size();j++)
	 {
	 	System.out.println(ls.get(j));
	 }
	  } 
	}
