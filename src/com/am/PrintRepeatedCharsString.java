package com.am;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/*In a very large string, identify and 
* print the characters that appear more than 5 times. 
* Ignore white spaces.
*/

//https://www.geeksforgeeks.org/maximum-consecutive-repeating-character-string/
//https://beginnersbook.com/2014/07/java-program-to-find-duplicate-characters-in-a-string/

public class PrintRepeatedCharsString {

	public static void main(String[] args) {
		Map<Character, Integer> charMap = new HashMap<>();
		String str = "This is sivareddy.welcome to youtube channel sivajavatechie";
		for (Character ch : str.toCharArray()) {
			if (charMap.get(ch) == null) {
				charMap.put(ch, 1);
			} else {
				charMap.put(ch, charMap.get(ch) + 1);
			}

		}
		Character key = Collections.max(charMap.entrySet(), Map.Entry.comparingByValue()).getKey();

		if (charMap.get(key) >= 5) {
			System.out.println(
					"max occurance of character in given string :" + key + " repeated :" + charMap.get(key) + " times");

		}
	}

}
