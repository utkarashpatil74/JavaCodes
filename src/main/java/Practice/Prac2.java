package Practice;

import java.util.HashMap;
import java.util.Map;

public class Prac2 {

	public static void getCharCount(String name2) {
		
		String name=name2.toLowerCase();
		
		char arr[]=name.toCharArray();
		
		Map<Character, Integer> charMap=new HashMap<Character, Integer>();
		
		for(char c:arr) {
			
			if(!String.valueOf(c).isBlank()) {
			if(charMap.containsKey(c)) {
				charMap.put(c,charMap.get(c)+1);
				
			}
			else {
				
				charMap.put(c,1);
			}
		}
		}
		System.out.println(name+ ":" +charMap);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		getCharCount(" Vaibhav");

	}

}
