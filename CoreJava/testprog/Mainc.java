import java.util.Scanner;
class Mainc
{
public static void main(String [] args)
  {
Scanner sc= new Scanner(System.in);
    int d=sc.nextInt();
int c=d%10;
int b=d/10;

int [] s= new int[2];
s[0]=c;
s[1]=b;
if(s[0]!=0 && s[1]!=0)
{
 c=c*10;
 
 int v=c+b;

  System.out.println(v);
}
  }
     } 
