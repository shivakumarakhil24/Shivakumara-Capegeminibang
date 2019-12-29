import java.util.HashSet;
import java.util.Iterator;
 class Student
 {
 	String name;
 	int     id;
 	double marks;

 	public Student(String name,int id,double marks)
 	{
 		this.name=name;
 	    this.id=id;
 	    this.marks=marks;

 	}
 	@Override  
 	public int hashcode()
 	{
 		return id;

 	}
 	@Override
 	public boolean equals(object obj)
 	{
 		return this.hashcode==obj.hashcode;
 	}
     @Override
     public String toString()
     {
     	return name+" "+id+" "+marks;
     } }
     class Mainclass3
     {


     public static void main(String[] args)
     {
     	System.out.println("prog start");Student s1=new Student("shiva",127,442);
     	hs1.add(s1);
     	hs1.add(new Student("anu",24,569));
     	hs1.add(new Student("appu",13,476));
     	hs1.add(new Student("suma",134,76));

     	Iterator z1 =hs1.iterator();

     	while(z1.hasNext()==true)
     	{
     	
     	
     		System.out.println(z1.next);
     	}
     	System.out.println("prog ends");

     }
 }




 


