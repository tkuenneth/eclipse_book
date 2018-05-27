package com.thomaskuenneth.eclipse_book;

import java.util.GregorianCalendar;

public class ForceReturnTest {
	public static void main(String[] args) {
		int i = test();
		System.out.println(i);
	}

	private static int test() {
		GregorianCalendar cal = new GregorianCalendar();
		int tag = cal.get(GregorianCalendar.DAY_OF_MONTH);
		return tag;
	}
}
