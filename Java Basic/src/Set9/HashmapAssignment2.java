package Set9;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.*;

//copy
public class HashmapAssignment2 {
	public static Map<String, Integer> mergeMaps(Map<String, Integer> mapOne, Map<String, Integer> mapTwo){
        //Implement your logic here and change the return statement accordingly
		
		Map<String, Integer> retMap=new HashMap<String, Integer>();
		Set<String> s1=new HashSet<String>(mapOne.keySet());
		Set<String> s2=new HashSet<String>(mapTwo.keySet());
		s1.retainAll(s2);
		for(String s:mapOne.keySet())
		{
			retMap.put(s, mapOne.get(s));
		}
		for(String s:mapTwo.keySet())
		{
			if(s1.contains(s) && mapOne.get(s)!=mapTwo.get(s))
			{
				retMap.put(s+"New", mapTwo.get(s));
			}
			else
			{
				retMap.put(s, mapTwo.get(s));
			}
		}
		
		return retMap;
	}

	public static void main(String args[]) {
		Map<String, Integer> mapOne = new HashMap<String, Integer>();
		mapOne.put("Kelly", 10);
		mapOne.put("Micheal", 20);
		mapOne.put("Ryan", 30);
		
		Map<String, Integer> mapTwo = new HashMap<String, Integer>();
		mapTwo.put("Jim", 15);
		mapTwo.put("Jim", 45);

		Map<String, Integer> mergedMap = mergeMaps(mapOne, mapTwo);

		System.out.println("Merged Map\n===========");
		for (Entry<String, Integer> entry : mergedMap.entrySet()) {
			System.out.println(entry.getKey()+" -- "+entry.getValue());
		}
	
	}
}
