import java.util.TreeSet;
import java.util.Iterator;

class Player implements Comparable
{
int rank;
String name;
String cnt;
int rating;
public Player(String name,String cnt,int rating)
{
	this.name=name;
	this.cnt=cnt;
    this.rating=rating;
}
@Override
public int hashCode()
{
	return rating;

}
@Override
public int compareTo(Object obj)
{
	return obj.hashCode()-this.hashCode();
	

}
@Override
public String toString()

{
	return rank+" "+name+" "+rating;
}
 }

class Mainclass2
{
public static void main(String[] args) 
{
System.out.println("start");

TreeSet t1= new TreeSet();
t1.add(new Player("Virat Kohli","ind",922));
t1.add(new Player("Nickols","nz",817));
t1.add(new Player("K S Williams","aus",722));
t1.add(new Player("M S Dhoni","ind",913));
Iterator i1=t1.iterator();
int i=1;
while(i1.hasNext()==true)
{
	Player plr=(Player)i1.next();
	plr.rank=i;
	System.out.println(plr);
	i++;
}
}
}






