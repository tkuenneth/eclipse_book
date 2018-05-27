package com.thomaskuenneth.eclipse_book;

public class ClassLoadBreakpointTest {
	public static void main(String[] args) {
		InnereKlasse i = new InnereKlasse();
		System.out.println(i);
	}
}

final class InnereKlasse {

	static {
		int i = 42;
		System.out.println(i);
	}

	protected InnereKlasse() {
		System.out.println("InnereKlasse()");
	}
}
