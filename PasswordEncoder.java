package org;

import java.util.Scanner;

public class PasswordEncoder {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the password:");
		String st=sc.next();
		
		StringBuilder result=new StringBuilder();
		
		for (int i = 0; i < st.length(); i++) {
			char ch=st.charAt(i);
			
			ch=Character.toUpperCase(ch);
			
			if(ch=='A' ||ch=='E' ||ch=='I' ||ch=='O' ||ch=='u') {
				result.append("@");
			}
			else if(Character.isDigit(ch) && (ch-'0')%2==0) {
				result.append("*");
			}else {
				result.append(ch);
			}
			
		}
		System.out.println(result);
	}
}
