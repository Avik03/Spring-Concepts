package com.spring.poc.demo;

public class BaseballCoach implements Coach{
	
	private FortuneService fortuneService;
	
	public BaseballCoach() {
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
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
