class Student
{
	public static void main(String[] args) {
		int per=19;
		if(per>=70 && per<=100)
			System.out.println("Student got A grade");
		else if(per>=60 && per<=70)
			System.out.println("Student got B grade");
		else if(per>=50 && per<=60)
			System.out.println("Student got C grade");
		else if(per<40)
			System.out.println("FAIL");
		else
		System.out.println("incorrect percentage");

	}
}
