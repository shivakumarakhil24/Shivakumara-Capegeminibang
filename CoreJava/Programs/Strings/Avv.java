class Avv
{
	public static String demo(String str)
	{
		String res="";
		for( int i=1;i<=str.length()-2;i++)
		{
			res=res+str.charAt(i);
		} return res;
	} 
	public static void main(String[] args)
	 {
	 	String stor="amma";
		String str1= demo(stor);
		System.out.println(str1);
	}
}