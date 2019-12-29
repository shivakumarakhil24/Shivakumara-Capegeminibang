class Missing
{
	public String sample(String str,int n)
	{   
		int len=str.length()-1;
		String s =str.substring(0,n);
		String r =str.substring(n+1,len);
		return s+r;
	}



	public static void main(String[] args)
	 {
     
    String str1 =sample("hello",2);
	System.out.println("str1=" +str1);
}
