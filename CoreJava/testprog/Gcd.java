class Gcd
{
	public static void iTa(int a)
	{
	int count=0;
	int b=a;
	while(a>0)
	{
		int rem=a%10;
		a=a/10;
		count++;
	}
	System.out.println(count);

	int []ar=new int[count];
	int ct=0;
	while(b>0)
	{
		int rev=b%10;
		ar[ct]=rev;
		ct++;
		b=b/10;
	} 
	
	 for(int j=ar.length-1;j>=0;j--)
		{
			if(j%6==0)
				continue;
			System.out.print(ar[j]);
		}	
	}


	public static void main(String[] args) {
		int a=1234567890;
		iTa(a);
		
	}
}