import java.io.File;
import java.io.IOException;
import java.io.FileWriter;


class Writing
{
	public static void main(String[] args)
	 {
		String str="D:/FILEHANDLING/OldFile/ProFile.doc";
		File f1=new File(str);
		try
		{
			FileWriter fw=new FileWriter(f1);
			fw.write("Seeking a suitable career, with an esteemed Organisation.");
		   fw.flush();
		System.out.print("file written");
	}
	catch(IOException ie)
	{
		ie.printStackTrace();
	}

	}
}
