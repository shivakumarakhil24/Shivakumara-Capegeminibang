import java.util.Scanner;
class Match
{
	public static String match(int []arr,int a)
	{
		String str="";
		for (int i=0;i<arr.length ;i++ )
		 {
			if(arr[i]==a)
			{
				str="YES";
				return str;
			}
		}
		str="no match found";
		return str;
	}

public static void main(String[] args) 
{
	int arr[]={10,20,30,40,50,60,70};
System.out.println("enter number to be check");	
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
String str1=match(arr,a);
System.out.println(str1);
}




}
