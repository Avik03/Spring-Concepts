package com.spring.poc.demo;

public class BaseballCoach implements Coach{
	
	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Spend 30min in batting practice.";
	}

	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}
	

}
