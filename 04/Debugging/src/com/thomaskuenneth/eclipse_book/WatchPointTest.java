package com.thomaskuenneth.eclipse_book;

public class WatchPointTest {
	private static int test1;
	private int test2;

	public WatchPointTest() {
		test1 = 1;
		test2 = test1;
		System.out.println(test2);
	}

	public static void main(String[] args) {
		new WatchPointTest();
	}
}
