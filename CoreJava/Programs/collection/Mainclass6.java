import java.util.LinkedList;

class Mainclass6
{
	public static void main(String[] args) 
	{ System.out.println("Prog start----------");
		LinkedList pq=new LinkedList();
		pq.add("Android");
		pq.add("Board");
		pq.add("Clone");
		pq.add("Devloper");
		pq.add("Former");
		pq.add("ERP");
		pq.add("ERP");
		System.out.println(pq.size());
		while(pq.size()!=0)
		{
			System.out.println(pq.get());//poll remove the data from the list
		}
		/*for(int i=0;i<pq.size();i++)// get method not remove data in the list
		{
			System.out.println(pq.get(i));
		}*/
		System.out.println(pq.size());
		System.out.println("Prog end------------");

		
	}
}