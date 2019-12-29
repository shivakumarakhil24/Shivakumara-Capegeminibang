class Program
{
	public static void main(String[] args)
   {
	int x=5;
	for(int i=1;i<=4;i++)
	{
		for(int j=1;j<=4;j++)
		{
			System.out.print(" ");
		}
		for(int k=4;k>=i;k--)
		{
			System.out.print(x );
			x=x+5;
		}
		System.out.println();		
	}
}
}