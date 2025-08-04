package org;

public class OddDigitReverser {

	public static void main(String[] args) {
		int n=1234567;
		int rs=reverseOddDigit(n);
		System.out.println(rs);
	}

	private static int reverseOddDigit(int n) {
         int rev=0;
         
         do {
        	int d=n%10;
        	if(d%2==1) {
        		rev=rev*10+d;
        	}
        	n=n/10;
         }while(n!=0);
		
		return rev;
	}
}
