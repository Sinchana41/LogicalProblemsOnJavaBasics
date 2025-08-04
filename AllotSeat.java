package org;

import java.util.HashSet;

public class AllotSeat {

	public static void main(String[] args) {
		int[] ar= {3,5,3,98};
		allotSeat(ar);
	}

	private static void allotSeat(int[] ar) {
		HashSet<Integer> hs=new HashSet<Integer>();
		
		for (Integer seat : ar) {
			
			if(seat<1 || seat>40) {
				System.out.println("Invalid seat number");
			}
			else if(hs.contains(seat)) {
				System.out.println(seat+" Already booked ");
			}
			else {
				hs.add(seat);
				System.out.println(seat +" seat is booked");
			}
		}
		
	}
}
