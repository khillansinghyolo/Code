package pka1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;

import com.opencsv.CSVWriter;

public class FileHandlingAssignment {
	
static  FileInputStream fis ;
static FileOutputStream fos;
static Workbook workbook;
static Workbook web;
static org.apache.poi.ss.usermodel.Sheet sheet;
static Row row;
static Cell cell;

	public static void main(String[] args)throws Exception 
	{	
		
		File file=new File("D:\\JAVA\\CoreJava\\file10.csv");
		System.out.println(file.exists());
		
		file.createNewFile();
		System.out.println(file.exists());
	  FileWriter fw=new FileWriter(file);
	  BufferedWriter bw=new BufferedWriter(fw);
	  
	  
	  
		/*
		 * System.out.println("File is created "); FileWriter fw=new FileWriter(file);
		 * BufferedWriter writer=new BufferedWriter(fw);
		 * 
		 * HashMap<String,String> map=new HashMap<String,String>();
		 * 
		 * map.put("Username","password"); map.put("khillan","password1");
		 * map.put("bhawana","password2"); map.put("shiv","password3");
		 * map.put("rahul","password4");
		 * 
		 * System.out.println(map); Set set=map.keySet(); System.out.println(set);
		 * Collection collection =map.values(); System.out.println(collection);
		 */
		
		
		
	
		//writer.close();
	}

}
