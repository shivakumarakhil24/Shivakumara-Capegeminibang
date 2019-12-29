package objectclass.methods;

public class Cow {
	int id;
	String name;
	int ltr;
	
	
	public boolean equals(Object b)
	{
	Cow c=(Cow)b;
	if(this.id==c.id)
	{
		if(this.ltr==c.ltr)
		{
			if(this.name.equals(c.name))
			{
				return true;
			}
		} return false;
		
	} return false;
	}
	
	
	

}
