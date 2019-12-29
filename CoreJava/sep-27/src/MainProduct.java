
public class MainProduct {
	public static void main(String[] args) {
		Product pr=new Product();
		pr.brand="sony";
		pr.name="Experia";
		pr.cost=12000;
		pr.type="Mobile";
		
		Product pq=new Product();
		pq.brand="Samsung";
		pq.name="Galaxy";
		pq.cost=10000;
		pq.type="Mobile";
		
		Product pw=new Product();
		pw.brand="sony";
		pw.name="Experia";
		pw.cost=12000;
		pw.type="Mobile";
		System.out.println(pw.equals(pr));
	}

}
