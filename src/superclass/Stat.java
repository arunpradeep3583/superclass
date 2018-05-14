package superclass;

import java.util.HashMap;
import java.util.Map;

public class Stat {
	
	public static void letter() {
		String ab = "tree";
		
		char[] ch = ab.toCharArray();
		Map<Character, Integer> maps = new HashMap<Character, Integer>();
		for (Character chs : ch) {
			
			if (maps.containsKey(chs)) {
				
				maps.put(chs, maps.get(chs+1));
					
						}else {
							maps.put(chs, 1);
			}
				
		}
		
		System.out.println(maps);
		
	}
	public static void main(String[] args) {
		letter();
	}
	

}
