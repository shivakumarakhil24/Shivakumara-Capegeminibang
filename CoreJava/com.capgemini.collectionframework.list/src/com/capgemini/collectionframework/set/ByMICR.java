package com.capgemini.collectionframework.set;

import java.util.Comparator;

public class ByMICR implements Comparator<Bank>
{

	@Override
	public int compare(Bank o1, Bank o2) 
	{
	Long k=o1.micr;
	Long t=o2.micr;
	return k.compareTo(t);
	}

}
