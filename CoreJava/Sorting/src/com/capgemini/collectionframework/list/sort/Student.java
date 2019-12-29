package com.capgemini.collectionframework.list.sort;

public class Student  implements Comparable<Student>
{
	int id;
	String name;
	double percent;
	public Student(int id, String name, double percent) {
		super();
		this.id = id;
		this.name = name;
		this.percent = percent;
	}
	//Logic to sort student id
	/*@Override
	public int compareTo(Student s)
	{
if(this.id>s.id)
return 1;
else if(this.id<s.id)
	return -1;
else 
	return 0;*/
	//Logic to sort Student percent
	@Override
	public int compareTo(Student s) 
	{ 
		
		Double k=this.percent;
		Double t=s.percent;
		return k.compareTo(t);
		
	}
//		if(this.percent>s.percent)
//		return 1;
//		else if(this.percent<s.percent)
//			return -1;
//		else
//			return 0;
//	}
	//@Override
	//public int compareTo(Student s) 
	{ 
		/*String k=this.name;
		String t=s.name;
		int res=k.compareTo(t);
		return res;*/
		
		//return this.name.compareTo(s.name);
		
		//To sort descending order
		//return this.name.compareTo(s.name)*-1;
	}
		
		
		
		
	}
	


