package com.thomaskuenneth.eclipse_book;

public class ExceptionBreakpointTest2 {
	private static int[] werte = { 1, 2, 3 };

	public static void main(String[] args) {
		for (int i = 0; i <= werte.length; i++) {
			System.out.println(werte[i]);
		}
	}
}
