class Test2
{
public static int check(int a,int b,int c)
{
 if((a%5==0) && (b%5==0) &&(c%5==0))
 {
 	return 10;
 }
 else {
 	return 0;
 }	
}
 	public static void main(String[] args) {
 		int i=check(10,20,30);
 		System.out.println("result is"+i);
 	}

}