package pkg;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Read {

	public void readData(int initial ,int end) throws Exception
	{
		BufferedReader file=new BufferedReader(new FileReader(new File("../Project1/File.txt")));
		int k=1;
		String i="";
		while(( i=file.readLine())!=null)
		{
			if(k>=initial && k<=end) 
			{
				System.out.println(i);
			}
			k=k+1;
		}
	}
	public static void main(String[] args)throws Exception {
		new Read().readData(2,5);
	}
}
