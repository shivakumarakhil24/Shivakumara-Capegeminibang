
class	Prime
	{ 
	public	static	void	main	(String	[]	args)	
	{ 
	java.util.Scanner	sc=new	java.util.Scanner	(System.in);
	 System.out.println	("enter	number"); int	n=sc.nextInt();
	  System.out.println	("Prime	numbers	between	1	and	"	+	n);
	  int sum=0;
	  
	    for	(int	i=1;	i	<	n;	i++) 
	    	{
	    	 boolean	is	=	true; 
	   
	        for	(int	j=2;	j	<	i	;	j++) 
	          { 
	           if	(i	%	j	==	0) 
	           	
	         	   {
	     	          is =	false;
	                    break;
	                  } 
	          }
	         if	(is==true)
         	{
	          System.out.println	(i	+	"	");
	          sum=sum +i;
              }
	               
         	} System.out.println("sum"+sum);
	          }


	           