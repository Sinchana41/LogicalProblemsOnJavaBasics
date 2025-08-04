package org;

public class PallindromeSlotMachine {

	public static void main(String[] args) {
		int n=363;
		
		boolean rs=pallindromeSlotMachine(n);
		if(rs) {
			System.out.println("jackpot");
		}else {
			System.out.println("Try Again");
		}
	}

	private static boolean pallindromeSlotMachine(int n) {
		if(isThreeDigit(n) && isPallindrome(n) && isSumDivisibleByThree(n) ) {
			return true;
		}
		return false;
	}

	private static boolean isSumDivisibleByThree(int n) {
		int sum=0;
		do {
			int d=n%10;
			sum=sum+d;
			n=n/10;
		}while(n!=0);
		
		return (sum%3==0);
		
	}

	private static boolean isPallindrome(int n) {
		int rev=0,temp=n;
		do {
			int d=n%10;
			rev=rev*10+d;
			n=n/10;
		}while(n!=0);
		
		return rev==temp;
	}

	private static boolean isThreeDigit(int n) {
		int count=0;
		do {
			count++;
			n=n/10;
		}while(n!=0);
		return count==3;
	}
}
