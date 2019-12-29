class Program
{
	public static int[] test(int []a1)
	 {
		int[]b1=new int[a1.length];
		int j=a1.length-1;
		for(int i=0;(i<a1.length||j>=0);i++,j--)
		{
			b1[i]=a1[j];
		}
		return b1;
	 }
	 public static void main(String[] args)
	  {
	 	int[]a1={10,20,30,40};
	 	for(int i=0;i<a1.length;i++)
	 	{
	 		System.out.print(a1[i]);
	 	}
	 	int [] b1=test(a1); System.out.println();
	 	for(int j=0;j<a1.length;j++)
	 	{
	 		System.out.print(b1[j]);
	 	}
	  }
}
