class MainClass 
{
	public static void test(int num)throws InterruptedException
	{
		System.out.println("enter");
		
		Thread.sleep(100);
	
		System.out.println("exit");
	} 
	public static void test(double num)
	{
		System.out.println("enter");
		
		
		int a=20/num;
		System.out.println(a);

		System.out.println("exit");
	}

		public static void main(String[] args) {
			System.out.println("main pro start");
			try
			
				test(0);
				test(0.0);
			
			catch(InterruptedException ie)
			{
				ie.printStackTrace();
			}
			System.out.println("end");

		}
	}


