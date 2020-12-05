package com.spring.poc.javaconfiguration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		Coach coach = context.getBean("swimCoach", Coach.class);
		
		System.out.println(coach.getDailtyWorkout());

		System.out.println(coach.getDailyFortume());
		
		context.close();
	}

}
