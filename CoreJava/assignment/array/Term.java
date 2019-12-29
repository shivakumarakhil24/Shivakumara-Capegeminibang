class Term1
{
	public static int[] test(int [] a1)
	{
		int [] b1= new int [a1.length-1];
		for( int i=1,j=0;(i<a1.length-1 || j<a1.length-2);i++,j++)
		{
			b1[j]=a1[i];
		}
	 return b1; }
	 public static void main(String[] args) {
	 	int[] a1={10,20,30,40,50};
	 	int[]b1=test (a1);
	 	for(int j=0;j<=a1.length-2;j++)
	 	{
	 		System.out.println(b1[j]);
	 	}
	 }
}