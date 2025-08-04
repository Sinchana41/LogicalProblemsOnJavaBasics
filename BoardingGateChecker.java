package org;

import java.util.Arrays;

public class BoardingGateChecker {

	
	public static int countOrder(int[] ar) {
		
		int[] a=Arrays.copyOf(ar, ar.length);
		Arrays.sort(a);
		
		int missMatchCount=0;
		
		for (int i = 0; i < ar.length; i++) {
			if(ar[i]!=a[i]) {
				missMatchCount++;
			}
		}
		return missMatchCount/2;
	}
	
	 public static void main(String[] args) {
	        int[] boardingOrder = {101, 103, 102, 104};
	        int result = countOrder(boardingOrder);
	        System.out.println(result); //1
	    }
}
