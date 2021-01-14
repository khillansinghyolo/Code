package selenium;

public class DuplicateStringCharacter {

	public static void main(String[] args) {

		String ss="khillansingh verma";
		char ch[] =ss.toCharArray();
		int length=ch.length;
		System.out.println(length);
		
		int count=0;
		char c=0;
		
		for(int i=0;i<ch.length;i++)
		{
			for(int j=0;j<i;j++) 
			{
				if((c=ch[i])==ch[j])
				{
					System.out.println(c);
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
















