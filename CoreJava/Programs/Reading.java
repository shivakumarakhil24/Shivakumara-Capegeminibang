import java.io.File;
import java.io.IOException;
import java.io.FileReader;


class Reading
{
	public static void main(String[] args)
	 {
		String str="D:/FILEHANDLING/NewFile/MyproFile.doc";
		File f1=new File(str);
		try
		{
			FileReader fw=new FileReader(f1);
			int len=(int)f1.length();
			char []ch=new char[182];
			System.out.print("len is"+f1.length());
		   fw.read(ch);
		   System.out.print(ch); 
		   System.out.println();
		   System.out.println();
		   System.out.println(ch[3]);
		System.out.print("file written");
	}
	catch(IOException ie)
	{
		ie.printStackTrace();
	}

	}
}
