package com.spring.poc.javaconfiguration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		TennisCoach coach = context.getBean("tennisCoach", TennisCoach.class);
		
		System.out.println(coach.getDailtyWorkout());
		
		System.out.println(coach.getTeam());
		System.out.println(coach.getDailyFortume());
		
		System.out.println(coach.getEmail());
		
		
		context.close();
	}

}
