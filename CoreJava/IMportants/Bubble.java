class Bubble
{
	public static void bubble(int [] arr)
	{
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
	}
	public static void main(String[] args) {
		int [] arr={23,67,198,32,65,2};
		bubble(arr);
		System.out.println("sorted array" );
		for(int k=0;k<arr.length;k++)
		{
			System.out.println(arr[k]);
		}
	}
}