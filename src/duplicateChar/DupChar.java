package duplicateChar;

import java.util.HashMap;
import java.util.Map;

public class DupChar {

	public static void main(String[] args) {
		String str ="malomo";
		//String []str1=str.split(" ");
		Map<Character, Integer> map = new HashMap<>();
		char[] charArray = str.toCharArray();
		 
        // Checking each character
        // of charArray
        for ( char c : charArray) {
 
            if (map.containsKey(c)) {

                // If character is present
                // in map incrementing it's
                // count by 1
                map.put(c, map.get(c) + 1);
            }
            else {
 
                // If character is not present
                // in map putting this
                // character into map with
                // 1 as it's value.
                map.put(c, 1);
            }
            
        }
        //System.out.println(map);
        // Traverse the HashMap, check
        // if the count of the character
        // is greater than 1 then print
        // the character and its frequency
        for (Map.Entry<Character, Integer> entry :
             map.entrySet()) {
 
            if (entry.getValue() > 1) {
            	
                System.out.println(entry.getKey()
                                   + " : "
                                   + entry.getValue());
                break;
            }
        }
    }

	}


