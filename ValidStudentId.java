package org;

public class ValidStudentId {

	public static void main(String[] args) {
		int[] ar= {23,45,60,89};
		
		isValidStudentIds(ar);
	}

	private static void isValidStudentIds(int[] ar) {
		for (int i = 0; i < ar.length-1; i++) {
			
			int lastDigit1=ar[i]%10;
			int lastDigit2=ar[i+1]%10;
			
			if(lastDigit1==lastDigit2) {
				System.out.println("Invlaild");
				return;
			}
		}
		System.out.println("valid");
	}
}
