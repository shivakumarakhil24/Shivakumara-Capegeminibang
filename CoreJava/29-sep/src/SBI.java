
public class SBI implements ATM
{

	@Override
	public void validate() {
		System.out.println("connecting to SBI DB...");
		System.out.println("validate success");
		
	}

	@Override
	public void getInfo() {
		System.out.println("connecting to SBI DB...");
		System.out.println("information getting successfully");
		
	}

}
