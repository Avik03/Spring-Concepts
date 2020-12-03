package com.spring.poc.annotationdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("thatSillyCoach")
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("databaseFortuneService")
	private FortuneService fortuneService;
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	
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
	
	public String getEmail() {
		return this.email;
	}
	
	public String getTeam() {
		return this.team;
	}

}
