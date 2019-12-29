package com.capgemini.collectionframework.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestBankTree {
	public static void main(String[] args) {
		ById bd=new ById(); 
		ByName bn=new ByName();
		ByMICR bmc=new ByMICR();
		TreeSet<Bank> tr=new TreeSet<Bank>(bmc);
		Bank b1=new Bank(571417, "SBI Banglore", 11332244l);
		Bank b2=new Bank(561009, "HDFC Banglore", 22113344l);
		Bank b3=new Bank(576000, "SYNDICATE Banglore", 99833675l);
		Bank b4=new Bank(572638, "ICICI Banglore", 24362819l);
		tr.add(b1);
		tr.add(b2);
		tr.add(b3);
		tr.add(b4);
		Iterator<Bank> i1=tr.iterator();
		while(i1.hasNext())
		{
			Bank s=i1.next();
			System.out.println("Bank name  "+s.name+"pin "+s.pin+" MICR  "+s.micr);
		}
		
		
		
		
		
	}

}
