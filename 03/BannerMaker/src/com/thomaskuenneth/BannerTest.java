package com.thomaskuenneth;

import java.io.IOException;

import com.github.lalyos.jfiglet.FigletFont;

public class BannerTest {

	public static void main(String[] args) {
		String asciiArt = "";
		try {
			asciiArt = FigletFont.convertOneLine("Hallo Eclipse");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(asciiArt);
	}
}
