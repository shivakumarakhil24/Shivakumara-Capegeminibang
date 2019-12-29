class Ramesh
{
	public static void main(String[] args) 
	{
	 int k=1,n=5;
	 for(int i=1;i<=n;i++)
	 {
	 	
	 	for(int j=1;j<=n;j++)
	 	{ 
	 		if((i+j>n-1)||(i+j<n-1)||(i<=j)||(j<=i))
	 		System.out.print("*");
	 		

	 	} System.out.println();	
	}
	 } 
}