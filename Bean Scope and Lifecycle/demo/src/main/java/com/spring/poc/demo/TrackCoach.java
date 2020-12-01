package com.spring.poc.demo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService theFortuneService) {
		System.out.println("Inside constructor TrackCoach");
		fortuneService = theFortuneService;
	}

	
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}


	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}
	
	//add an init method
	
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: inside method doMyStartupStuff");
	}
	
	//add a destroy method
	
	public void doMyDestroyStuff() {
		System.out.println("TrackCoach: inside method doMyDestroyStuff");
	}

}
