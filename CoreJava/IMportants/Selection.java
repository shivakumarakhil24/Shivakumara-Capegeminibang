class Selection
{
	public static void selct(int []arr)
	{
     int n=arr.length;
     for(int i=0;i<n-1;i++)
     {
     	int min=i;
     	for (int j=i+1;j<n ;j++ )
     	 {
     		if (arr[j]<arr[min])
     		 {
     			
     			min=j;
     			int temp=arr[min];
     			arr[min]=arr[i];
     			arr[i]=temp;

     		}
     	}
     }
     System.out.println("sorted array" );
		for(int k=0;k<arr.length;k++)
		{
			System.out.println(arr[k]);
		}
	}
	public static void main(String[] args) {
		int [] arr={23,67,198,32,65,2};
		selct(arr);
		
	}
}