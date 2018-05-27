package com.thomaskuenneth.eclipse_book;

public class ExceptionBreakpointTest {
	public static void main(String[] args) {
		try {
			for (int i = 10; i >= 0; i--) {
				System.out.println(i + " / " + i + " = " + i / i);
			}
		} catch (Throwable thr) {
			thr.printStackTrace();
		}
	}
}
