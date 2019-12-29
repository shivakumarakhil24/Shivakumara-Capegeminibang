class Program
{
	public static String twoChar(String str,int index)
	{
		String res="";
		if(index >=str.length()-1 && index<0)
		{
		res=res+str.charAt(0)+str.charAt(1);
	    }
		else
		{
			res=res+str.charAt(index)+str.charAt(index+1);
		}
		return res;
	}
	public static void main(String[] args)
	 {
		String str="hello";
		String res=twoChar(str,3);
		System.out.println(res);
	}
}