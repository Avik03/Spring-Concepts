package com.spring.poc.annotationdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach coach = context.getBean("thatSillyCoach", Coach.class);
		
		System.out.println(coach.getDailtyWorkout());
		
		context.close();
	}

}
