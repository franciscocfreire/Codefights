package br.com.codefights.arrays;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNotRepeatingCharacter {

	public char test(String s){
		
		LinkedHashMap<Character, Integer> hmap = new LinkedHashMap<Character, Integer>();
		
		for(int i = 0; i < s.length(); i++){
			
			Integer test = hmap.get(s.charAt(i));
			if(test == null){
				test = 1;
			}
			else{
				test++;
			}
			hmap.put(s.charAt(i), test);			
		}
		
		Iterator it = hmap.entrySet().iterator();
		while(it.hasNext()){
			Map.Entry pair = (Map.Entry)it.next();
			if(Integer.valueOf(pair.getValue().toString()) == 1){
				return (char)pair.getKey();
			}
		}
		
		
		return '_'; 
	}
	
	char goodSolution(String s) {
	    // Count how many times we've seen each character. Crucially, LinkedHashMap preserves
	    // insertion order while being an O(1) data structure
	    Map<Character, Integer> seen = new LinkedHashMap<>(26);
	    
	    for (int i = 0; i < s.length(); ++i) {
	        final char c = s.charAt(i);
	        
	        // Put the character into the map, either initialising with 0 or incrementing 
	        // the existing count
	        seen.compute(c, (key, value) -> {
	            if (value == null) {
	                return 0;
	            } else {
	                return value + 1;
	            }
	        });
	    }
	    
	    // Two separate loops still leaves this solution as O(N)
	    // We can safely iterate across the entry set due to use of LinkedHashMap (see above)
	    for (Map.Entry<Character, Integer> entry : seen.entrySet()) {
	        if (entry.getValue() == 0) {
	            return entry.getKey();
	        }
	    }
	    
	    return '_';
	}
}
