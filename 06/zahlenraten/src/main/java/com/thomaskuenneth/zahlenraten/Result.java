package com.thomaskuenneth.zahlenraten;

public class Result {

	private final int min;
	private final int max;
	private final int guess;
	private final boolean correct;

	public Result(int min, int max, int guess, boolean correct) {
		this.min = min;
		this.max = max;
		this.guess = guess;
		this.correct = correct;
	}

	public int getMin() {
		return min;
	}

	public int getMax() {
		return max;
	}

	public int getGuess() {
		return guess;
	}

	public boolean isCorrect() {
		return correct;
	}
}
