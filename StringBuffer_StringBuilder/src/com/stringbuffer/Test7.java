package com.stringbuffer;

//given 2 strings S1 and S2, the task is to find if S1 is a substring of S2. if yes return the index of the first occurrence, else return -1. input S1= "for", S2 = "abcforxyz"
public class Test7 {
	public static int findSubstring(String S1, String S2) {
		return S2.indexOf(S1);
	}

	public static void main(String[] args) {
		String S1 = "for";
		String S2 = "abcforxyz";

		int index = findSubstring(S1, S2);

		if (index != -1) {
			System.out.println("Substring found at index: " + index);
		} else {
			System.out.println("-1");
		}
	}
}