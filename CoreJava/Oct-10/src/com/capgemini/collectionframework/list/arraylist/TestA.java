package com.capgemini.collectionframework.list.arraylist;

import java.util.ArrayList;



public class TestA {
public static void main(String[] args) {
		
		ArrayList<Student> al=new ArrayList<Student>();
		Student s1=new Student(100,"ARUN","PES");
		Student s2=new Student(55,"Gokul","PESIT");
		Student s3=new Student(19,"Neelam","Daman");
		Student s4=new Student(32, "Kiran","Acharya IT");
		Student s5=new Student(89, "Sheela", "RvCE");
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		Helper h =new Helper();
		h.rec(al);
		Helper2 h2 =new Helper2();
		
		h2.passFail(al);
		

}
}
