class Prgm
{
	public static void main(String[] args)
	 {
	  int x=1;
	  int y=0;
	  for(int i=1;i<=3;i++)
	  {
	  	for(int j=1;j<=3;j++)
	  	{
	  		if((i%2!=0)&&(j%2!=0))
	  		{
	  			System.out.print(x);
	  		}
	  		else if((i%2==0)&&(j%2==0))
	  		{
	  			System.out.print(x);
	  		}
	  		else
	  		{
	  			System.out.print(y);
	  		}
	  	}
	  	System.out.println();
	  }	
	 }
}