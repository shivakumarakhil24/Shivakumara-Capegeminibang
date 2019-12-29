import java.util.HashMap;
class ImpprogTarget
{
	public static void test(int[] a,int tar)
	{
		HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
		int a1=0,b1=0;
		System.out.println("-------88888888-------");
		for(int i:a)
		{
			System.out.println(i);
		} System.out.println("=======8888888888=======");
		for(int i=0;i<a.length;i++)
		{
			if(h.get(tar-a[i])==null)
			{
				h.put(a[i],i);
			}
			else
			{
				a1=a[i];
				b1=a[h.get(tar-a[i])];
				break;

			}

		}
		System.out.println("target="+tar);
		System.out.println("first "+a1);
		System.out.println("sec "+b1);
	}
	public static void main(String[] args)
    {
    	int [] a={2,4,5,1,7,8,9};
    	test(a,-13);
		
	}
}