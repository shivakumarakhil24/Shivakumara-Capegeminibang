class Asend
{
	public static int test(int [] a)
	{
		int len =a.length;
		int temp=0;
		for(int i=0;i<len;i++)
		{
			for(int j=0;j<len-1;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;

				}
			}
		} return a[0];
	} 
	public static void main(String[] args){
	int []a={10,40,60,20};
	int  assend =test(a);
	
	System.out.println(assend);
	
	
	}
}