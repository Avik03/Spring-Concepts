package com.spring.poc.javaconfiguration;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
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
	
	// Define initi method
	
	@PostConstruct
	public void init() {
		System.out.println("Inside the init method");
	}
	
	// Define destroy mthod
	
	@PreDestroy
	public void destroy() {
		System.out.println("Inside the destroy method");
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
