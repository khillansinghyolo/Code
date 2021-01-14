import java.io
.File;
import java.io.IOException;

public class FileDemo1 {

	public static void main(String[] args) throws IOException
	{
	
		int count =0;
		File f=new File("D:\\JAVA\\CoreJava\\Durga");
		
		String[] s=f.list();
		for (String s1:s)
		{
			File f1=new File(f,s1);
			
			
			  if (f1.isDirectory()) { count++; System.out.println(s1); }
			 
			/*
			 * if(f1.isFile()) { count++; System.out.println(s1);
			 * 
			 * }
			 */
			//count++;
			//System.out.println(s1);
			
		}
		System.out.println(count);
		
		//System.out.println(f.exists());
		/*f.createNewFile();
		System.out.println(f.exists());
		
		System.out.println(f.isFile());
		
		File file=new File("D:\\JAVA\\CoreJava\\Durga");
		file.mkdir();
		
		File f1=new File(file ,"test1.txt");
		System.out.println(f1.exists());*/
		
		
		
		
		

	}

}
