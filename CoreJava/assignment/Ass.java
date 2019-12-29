class Ass
{
	public static boolean find(int [] a1)
	{
		if (a1[0]==a1[a1.length-1]) 
		{ 
			return true;
			
		} 
		else 
		{
			return false;
		}
	}
	public static void main(String[] args)
	 {
		int []a1={6,2,3,4,5,6};
		boolean b1=find(a1);
		System.out.println(b1);
	}
}