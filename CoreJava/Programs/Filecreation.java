import java.io.File;
class Filecreation
{
	public static void main(String[] args)
	 {
		String str="D:/FILEHANDLING/OldFile";
		File f1= new File(str);
		f1.mkdir();
		System.out.print("fie is created");
	}
}