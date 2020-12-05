package com.spring.poc.javaconfiguration;

public class SwimCoach implements Coach {

	private FortuneService fortuneService;
	
	public SwimCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailtyWorkout() {
		return "Swim 1000 meters as a warm up";
	}

	@Override
	public String getDailyFortume() {
		return fortuneService.getFortune();
	}

}
