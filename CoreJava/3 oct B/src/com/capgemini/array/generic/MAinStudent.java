package com.capgemini.array.generic;

public class MAinStudent 
{
	public static void main(String[] args) {
		
		Student st1=new Student(12, "pappu", 89.91);
		Student st2=new Student(13, "pammi", 79.91);
		Student st3=new Student(14, "paandu", 39.91);
		Student st4=new Student(15, "punda", 60.91);
		Student [] s=new Student[4];
		s[0]=st1;
		s[1]=st2;
		s[2]=st3;
		s[3]=st4;
		rec(s);
		
		
	}
	public static void rec(Student [] st)
	{
		for(Student d:st)
		{
		System.out.println(d.name+"  "+d.id+"   "+d.percent);	
		}
	}

}
