package test1;
import java.util.Arrays;
import java.util.HashMap; 
import java.util.Set; 
public class Strings_map { 
	public static void main(String[] args) { 
		duplicateCharacterCount("Learn Java Programming"); 
		dup("my name is sanjay");
		
	} 
	static void duplicateCharacterCount(String inputString) { 
		HashMap<Character, Integer> charCountMap = new HashMap<>(); 
		char[] strArray = inputString.toCharArray(); 
		System.out.println(Arrays.toString(strArray));
		for (char c : strArray) { 
			if (charCountMap.containsKey(c)) { 
				charCountMap.put(c, charCountMap.get(c) + 1); 
			} else { 
				charCountMap.put(c, 1); 
			} 
		} 
		Set<Character> charsInString = charCountMap.keySet(); 
		System.out.println("Duplicate Characters in : " + inputString); 
		for (Character ch : charsInString) { 
			if (charCountMap.get(ch) > 1) { 
				System.out.println(ch + " : " + charCountMap.get(ch)); 
			} 
		} 
	}
	public static void dup(String s1) {
		 HashMap<Character, Integer> map=new HashMap<>();
		 char[] chararray = s1.toCharArray();
		 for(char c:chararray) {
			 if(map.containsKey(c)) {
				 map.put(c, map.get(c)+1);
			 }
			 else {
				 map.put(c,1);
			 }
		 }
		 Set<Character> charinString = map.keySet();
		 for(Character  ch: charinString ) {
			 if(map.get(ch)>1) {
				 System.out.println(ch+" : "+map.get(ch));
			 }
		 }
	}
	
} 