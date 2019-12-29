class Test1
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=100;i++)
		{
			if(i%7==0)
			{
				if(i%2==0)
					System.out.println(i+" is even");

				
				else
					System.out.println(i+" is odd");
			}
		}
	}
}