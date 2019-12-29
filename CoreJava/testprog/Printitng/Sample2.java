class Sample2
{
	public static  int [] max2( int [] a)
	{
      int len =a.length;
      int temp=0;
      for(int i=0;i<len-1;i++)
      {
      	for(int j=0;j<len-1;j++)
      	{
      		if(a[j]<a[j+1])
      		{
      			temp=a[j];
      			a[j]=a[j+1];
      			a[j+1]=temp;

      		}
      	} 
      } 
      return a;
	} 
	public static void main(String[] args)
	 {
		int [] m={10,20,90,13,80};
		int l =m.length;
		
		int [] brr=new int [l];
		brr=max2(m);
		for(int k=0;k<=l;k++)
			{
				System.out.println(brr[k]);
			}
	}
}