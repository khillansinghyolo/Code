package november;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class classDemo {
	public static void main(String[] args) {
		
		HashMap<String ,Integer> map=new HashMap<String ,Integer>();
		
		map.put("Noida", 5000);
		map.put("Gurgaon", 6000);
		map.put("Faridabad", 8000);
		map.put("Delhi", 10000);
		map.put("Pune", 9000);
		map.put("Channai", 9900);
		
		Set<String> keys=map.keySet();
	
		Integer sum =0;
		
		for(String s:keys)
		{
			System.out.println(s);
			if(s.equals("Noida") ||s.equals("Gurgaon") || s.equals("Faridabad")  || s.equals("Delhi") )
			{
				sum=sum+map.get(s);
			}
		}
		System.out.println("sum of Ncr population:  "+sum);
	}
}
