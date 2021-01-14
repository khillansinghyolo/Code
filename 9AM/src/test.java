
public class test {

	
	public static void main(String[] args) {
		
		String in="rohit singh";
		char []s1=in.toCharArray();
		String s2="";
		int l=in.length();
		for (int i = l-1; i >0; i--) 
		{
		s2=s2+s1[i];	
		System.out.println(s2);
		}
		
		String s3[]=s2.split(" ");	
		int l1=s3.length;
		String s4="";
		for (int j = l1-1; j >0; j--) {
		s4=s4+s3[j]+"";
		
		System.out.println(s4);
	}
		
		
		
	}
}
