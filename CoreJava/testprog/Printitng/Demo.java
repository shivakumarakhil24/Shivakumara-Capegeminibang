class Demo
{
public static void rev(int [] arr) 
{
        int [] arr={10,200,30,400,50};
		int len=arr.length;
                 int [] brr=new int [len];
                 int j=len-1;
                 for(int i=0;i<=len-1;i++)
                 {
        	  brr[j]=arr[i];
        	   j--;
                 } 
                for(int k=0;k<=len-1;k++)
                {
                        System.out.println(brr[k]);
                } 
        }
        public static void main(String[] args)
         {
              rev={}  
        }
} 