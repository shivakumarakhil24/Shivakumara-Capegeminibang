import java.util.Scanner;
class Powerful
{
	public static long pow(long a,long b)

	{
		long res=1;
		for (int i=0;i<b ;i++ )
	    {
		res=res*a;
		
			
		} 
		
		
		return res;
	}
	public static long count(long a)
	{
		long ld=a%10;
		return ld;
	}
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		long x=sc.nextInt();
		long y=sc.nextInt();
	long p=pow(x,y);
		long r=count(p);
		System.out.print(r);

	}

}