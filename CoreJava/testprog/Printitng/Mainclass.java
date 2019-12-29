class Mainclass3
{
	public static void main(String[] args) 
	{
		int [] arr={10,20,30,40,50};
		int len=arr.length;
        int [] brr=new int [len];
        int j=len-1;
        for(int i=0;i<=len-1;i++)
        {
        	brr[j]=arr[i];
        	j--;

        }

	}
}