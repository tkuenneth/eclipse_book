package com.thomaskuenneth.zahlenraten;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuessController {

	@RequestMapping("/guess")
	public Result guess(@RequestParam(value = "min", defaultValue = "0") int min,
			@RequestParam(value = "max", defaultValue = "10") int max, 
			@RequestParam(value = "guess") int guess) {
		double range = max - min + 1;
		int rnd = min + (int) (Math.random() * range);
		return new Result(min, max, guess, rnd == guess);
	}
}
