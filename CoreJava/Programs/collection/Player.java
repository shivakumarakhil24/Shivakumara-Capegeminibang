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
public int compareTo(object obj)
{

}
@Override
public String toString()

{
	return rank+" "+name+" "+rating;
}
public static void main(String[] args) 
{
System.out.println("start");








System.out.println("end");	
}

}