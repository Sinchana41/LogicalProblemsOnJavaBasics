package org;

import java.util.Scanner;

public class PatternLockNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		boolean rs=true;
		int count=0;
		while(rs) {
			
			System.out.println("Enter the password:");
			int password=sc.nextInt();
			if(password==1234) {
				System.out.println("Success");
				break;
			}else {
				count++;
				if(count==4) {
					System.out.println("Maximum attempts reached");
					rs=false;
				}
			}
		}
	}
}
