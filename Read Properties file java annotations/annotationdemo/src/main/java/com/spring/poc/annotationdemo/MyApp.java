package com.spring.poc.annotationdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		TennisCoach coach = context.getBean("thatSillyCoach", TennisCoach.class);
		
		System.out.println(coach.getDailtyWorkout());
		
		System.out.println(coach.getDailyFortume());
		
		System.out.println(coach.getEmail());
		
		System.out.println(coach.getTeam());
		
		context.close();
	}

}
