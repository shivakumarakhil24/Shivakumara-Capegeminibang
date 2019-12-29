
public class Product {
	String name;
	String brand;
	String type;
	double cost;
	public boolean equals(Object obj)

	{
		Product p=(Product)obj;
		if(this.name.equals(p.name))
		{
			if(this.type.equals(p.type))
			{
				if(this.brand.equals(p.brand))
				{
					if(this.cost==p.cost)
						return true;
					
				} 
				
				return false;
			} 
			
			return false;
		} 
		
		return false;
	}
	
	
	

}
