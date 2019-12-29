class Prog6
{
	public static void main(String[] args) {
		int m=1;
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=3;j++)
			{
				if(m%2!=0)
				{
					System.out.print("1  ");
				}
				else 
				{
					System.out.print("0  ");
				}
				m=m+1;
			}
			System.out.println();
		}





	}
}