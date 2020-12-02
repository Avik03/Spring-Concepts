package com.spring.poc.annotationdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("thatSillyCoach")
public class TennisCoach implements Coach {

	@Autowired
	private FortuneService fortuneService;
	
	public TennisCoach() {
		
	}
	
	/*
	@Autowired
	public TennisCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	*/
	/*
	@Autowired
	private void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	*/
	
	@Override
	public String getDailtyWorkout() {
		return "Practice backhand volley";
	}

	@Override
	public String getDailyFortume() {
		return fortuneService.getFortune();
	}

}
