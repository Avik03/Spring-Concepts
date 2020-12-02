package com.spring.poc.annotationdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("thatSillyCoach")
public class TennisCoach implements Coach {

	private FortuneService fortuneService;
	
	@Autowired
	public TennisCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailtyWorkout() {
		return "Practice backhand volley";
	}

	@Override
	public String getDailyFortume() {
		return fortuneService.getFortune();
	}

}
