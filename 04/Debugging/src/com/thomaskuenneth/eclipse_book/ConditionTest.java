package com.thomaskuenneth.eclipse_book;

public class ConditionTest {
	public static void main(String[] args) {
		int z1 = 0;
		int z2 = 0;
		int i;
		for (i = 0; i < 10; i++) {
			double zufall = Math.random();
			if (zufall < 0.5) {
				z1++;
			} else {
				z2++;
			}
		}
		System.out.print(String.format("Von %d Zufallszahlen" 
				+ " sind %d < 0.5 und %d größer", i, z1, z2));
	}
}
