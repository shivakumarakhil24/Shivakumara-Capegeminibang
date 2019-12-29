class Test
{
	public static void main(String[] args)
	 {  
	 	
		for(int i=1;i<101;i++)
		{   
			if(i%3==0 && i%5==0 )
				{ 
				System.out.println(i+"divisible by both 3 and 5");
			}
			else if(i%3==0)
				System.out.println(i+"divisible by only 3");
			else if (i%5==0)
				System.out.println(i+" divisible by only 5");
			

		} 
		
	}
}