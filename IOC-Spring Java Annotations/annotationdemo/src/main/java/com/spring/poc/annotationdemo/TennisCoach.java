package com.spring.poc.annotationdemo;

import org.springframework.stereotype.Component;

@Component("thatSillyCoach")
public class TennisCoach implements Coach {

	@Override
	public String getDailtyWorkout() {
		return "Practice backhand volley";
	}

}
