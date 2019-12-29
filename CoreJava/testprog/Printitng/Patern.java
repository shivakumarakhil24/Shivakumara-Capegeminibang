class Patern
{
	public static void main(String[] args)
    {
	 int k=64;
	 char ch=(char)k;
	 char c;
	 for(int i=0;i<=5;i++)
	 { 
	 	ch++;
	 	for(int j=0;j<=i;j=j)
	 	{ 
	 		c=ch;
	 		c++;
          System.out.print(c);
	 	} 
	 	System.out.println();
	 } 	
	}
}