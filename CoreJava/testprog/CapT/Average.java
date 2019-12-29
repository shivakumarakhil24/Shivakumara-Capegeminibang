class Average
{
	public static double avrg(int k,int e,int h )
	 {
		
		double av=(k+e+h)/3.0;
		System.out.println("average is "+av);
		return av;
	} 
	public static void main(String[] args) 
	{
		double a=avrg(25,35,45);
		System.out.println("...............");
		System.out.println(a);
	}
}