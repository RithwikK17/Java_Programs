package com.stringbuffer;

import java.util.HashMap;
import java.util.Map;

// write a program to find the first non repeating character in a string
public class Test8 {

	public static char nonRepeatingChar(String str) {
		if (str == null || str.isEmpty()) {
			return '\0';
		}

		Map<Character, Integer> charCounts = new HashMap<>();

		for (char c : str.toCharArray()) {
			charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
		}

		for (char c : str.toCharArray()) {
			if (charCounts.get(c) == 1) {
				return c;
			}
		}
		return '\0';
	}

	public static void main(String[] args) {
		String case1 = "javacode";
		String case2 = "lovejavacode";

		System.out.println("Input: \"" + case1 + "\" -> Output: " + nonRepeatingChar(case1));
		System.out.println("Input: \"" + case2 + "\" -> Output: " + nonRepeatingChar(case2));
	}
}