import java.util.*;
class EachChar
{
	public static void count(String str)
	{
     HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
     char [] ch=str.toCharArray();
     for(char c:ch)
     {
       if(hm.containsKey(c))
       {
       	hm.put(c,hm.get(c)+1);
       }
       else 
       	hm.put(c,1);
     }
     for(Map.Entry entry:hm.entrySet())
     {
     	System.out.println(entry.getKey()+"    "+entry.getValue());
     }
	}
	public static void main(String[] args) {
		String str="ramesha shivakumara";
		count(str);
	}
}