class StaNon
{
	static int a=10;
	int b=20;
	static void run()
	{
		System.out.println(b);
		System.out.println("it is a static method");
	}
	void exec()
	{
		System.out.println("it is a non static exec method");
	}
	public static void main(String[] args) 
	{    StaNon st=new StaNon();
		System.out.println(a+"it is a");
		System.out.println(st.b);
		run();
		st.exec();
	}
}