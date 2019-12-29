
public class MainAtm {
public static void main(String[] args) {
	
	
	Machine m= new Machine();
	HDFC h=new HDFC();
	SBI s=new SBI();
	m.rec(s);
	System.out.println("*****************************");
	m.rec(h);
		
}
}
