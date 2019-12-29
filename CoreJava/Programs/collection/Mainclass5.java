import java.util.PriorityQueue;

class Mainclass5
{
	public static void main(String[] args) 
	{ System.out.println("Prog start----------");
		PriorityQueue pq=new PriorityQueue();
		pq.add("Android");
		pq.add("Front End");
		pq.add("C");
		pq.add("DotNet");
		pq.add("Android");
		pq.add("ERP");
		while(pq.size()!=0)
		{
			System.out.println(pq.poll());
		}
		System.out.println("Prog end------------");

		
	}
}