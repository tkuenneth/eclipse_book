package com.thomaskuenneth.eclipse_book;

public class StepTest {
	public StepTest() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
	}

	public static void main(String[] args) {
		System.out.println(System.currentTimeMillis());
		new StepTest();
		System.out.println(System.currentTimeMillis());
	}
}
