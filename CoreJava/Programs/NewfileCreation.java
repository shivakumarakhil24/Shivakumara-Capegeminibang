import java.io.File;
import java.io.IOException;

class NewfileCreation
{
	public static void main(String[] args)
	 {
		String str="D:/FILEHANDLING/OldFile/srFile.ser";
		File f1=new File(str);
		try
		{
		f1.createNewFile();
		System.out.print("file created");
	}
	catch(IOException ie)
	{
		ie.printStackTrace();
	}

	}
}
