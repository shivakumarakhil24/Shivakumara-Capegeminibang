class Bmi
{
	public static void bmiV(double hi,int wi)
	 {
	
	double avg=wi/(hi*hi);
	if (avg<18.5) 
		System.out.println(avg+" Underweight");
	else if(avg>=18.5 && avg<=24.9)
		System.out.println(avg+" Normal");
	else if (avg>=25.0 && avg<=29.0)
		System.out.println(avg+" Over weight");
	else 
		System.out.println(avg+" Obese");
			
			
	}
	public static void main(String[] args) {
		bmiV(,160);
	}
}