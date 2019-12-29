import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.Serializable;
class Email implements Serializable
{
String subject;
String msg;

	public Email(String subject,String msg)
	{
	this.subject=subject;
	this.msg=msg;	
	}

}
class Mainclass
{
	public static void main(String[] args) {
		String path="D:/FILEHANDLING/OldFile/srFile.ser";
		Email e1=new Email("Greeting","Welcome to Shivu");
		try
		{
			FileOutputStream fo=new FileOutputStream(path);
			ObjectOutputStream os=new ObjectOutputStream(fo);
			os.writeObject(e1);
			System.out.print("succes");
		}
		catch(Exception e)
		{
			e.printStackTrace();

		}



	}
}