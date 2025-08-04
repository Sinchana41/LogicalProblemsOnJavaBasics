package org;

import java.util.Arrays;
import java.util.Collections;

public class StudentRankList {

	public static void main(String[] args) {
		Integer[] ar= {10,40,20,80};
		
		Arrays.sort(ar);
		int f=0,l=ar.length-1;
		while(f<l) {
			int temp=ar[f];
			ar[f]=ar[l];
			ar[l]=temp;
			f++;
			l--;
		}
	
		for (int i = 0; i < ar.length; i++) {
			System.out.println((i+1)+"."+ar[i]);
		}
	}
}
