package com.thomaskuenneth.eclipse_book;

import java.util.Arrays;

public class StepFilterTest implements Comparable<StepFilterTest> {

	public int wert;

	public StepFilterTest(int zahl) {
		this.wert = zahl;
	}

	public static void main(String[] args) {
		// Feld erzeugen
		StepFilterTest[] feld = new StepFilterTest[3];
		feld[0] = new StepFilterTest(10);
		feld[1] = new StepFilterTest(5);
		feld[2] = new StepFilterTest(20);
		// ausgeben
		ausgabe(feld);
		// sortieren
		Arrays.sort(feld);
		// erneut ausgeben
		ausgabe(feld);
	}

	public static void ausgabe(StepFilterTest[] feld) {
		for (int i = 0; i < feld.length; i++) {
			if (i > 0) {
				System.out.print(",");
			}
			System.out.print(feld[i]);
		}
		System.out.println();
	}

	public String toString() {
		return Integer.toString(wert);
	}

	public int compareTo(StepFilterTest o) {
		if (o.wert < wert) {
			return 1;
		} else if (o.wert > wert) {
			return -1;
		}
		return 0;
	}
}
