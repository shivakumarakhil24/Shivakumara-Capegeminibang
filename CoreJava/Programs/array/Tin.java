class Tin
{
	public static void findThis(int [] a1)
	{
		int mid= (a1.length-1)/2;
		int last= a1.length-2;
		System.out.print("sum is");
		System.out.println(a1[1]+a1[mid]+a1[last]);
	}
	 public static void main(String[] args) {
		int [] m1={10,20,30,40,50,60};
		findThis(m1);
	}


}