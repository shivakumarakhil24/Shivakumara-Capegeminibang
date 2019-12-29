import java.util.*;
class Matchlist
{


public static String match(ArrayList<Integer> dd,int t)
{
	String str="yes";
	String str1="no";
	for(int u=0;u<dd.size();u++)
	{
		if(dd.get(u)==t)
		{
          return str;
		}
	}
	return str1;
}
	public static void main(String[] args) 
	{
	ArrayList<Integer> al=new ArrayList<Integer>();
	al.add(10);
	al.add(20);
	al.add(30);
	al.add(40);
	al.add(50);
	al.add(60);
	al.add(70);
	al.add(80);
	System.out.println(al);
	System.out.println("enter number to be check");	
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
		String s=match(al,a);
		System.out.println(s);

	}
}