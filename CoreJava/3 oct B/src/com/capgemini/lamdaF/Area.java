package com.capgemini.lamdaF;

public interface Area {
	double area(int r);

}
class Lamarea
{
	public static void main(String[] args) 
	{
		Area a=(r)-> r*r*(3.142);
			double p=a.area(3);
			System.out.println(p);
			
		
	}
}
