class Test1
{
	public static String cmp(String str, String st)
	{
		String str1="";
		int len=str.length()-1;
		int len1=st.length()-1;
		
		for(int i=0;i<=len;i++)
		{
			if(str.charAt(i)==st.charAt(i))
			{
				System.out.println("strings are matched");

			}
			else System.out.println("not matched");
		} return str ;
		
		
	}
	public static void main(String[] args) 
	{
		
	String sr=cmp("appaji","amma");
		System.out.println(sr);
	}
}