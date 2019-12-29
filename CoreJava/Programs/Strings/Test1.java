class Test1{
public static String middleThree(String str) {
  String res="";
  int len=str.length()-1;
  int mid=len/2;
  for(int i=mid-1;i<=mid+1;i++)
  {
    res=res+str.charAt(i);
  } 
  	return res;
  }
  	public static void main(String[] args) {
  		String stor="solving";
  		String res1=middleThree(stor);
  		System.out.println(res1);
  	}
  		}