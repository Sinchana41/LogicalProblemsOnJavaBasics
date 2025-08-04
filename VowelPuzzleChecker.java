package org;

import java.util.Scanner;

public class VowelPuzzleChecker {

	public static boolean isVowel(char ch) {
		return "aeiouAEIOU".indexOf(ch)!=-1;
	}
	
	public static String vowelPuzzleChecker(String st) {
		int len=st.length();
		
		if(len<4) {
			return "Invalid";
		}
		
		if(!isVowel(st.charAt(0)) || !isVowel(st.charAt(len-1))) {
			return "Invalid";
		}
		
		int count=0;
		for (int i = 1; i < st.length()-1; i++) {
			if(isVowel(st.charAt(i))) {
				count++;
			}
		}
		
		return (count==2)?"valid":"Invalid";
	}
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String input = sc.nextLine();

        String result = vowelPuzzleChecker(input);
        System.out.println(result);
    }
}
