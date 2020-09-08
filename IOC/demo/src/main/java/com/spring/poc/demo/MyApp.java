package com.spring.poc.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		
		//Load Spring configuration file
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from container
		
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		//call methods on bean
		
		System.out.println(theCoach.getDailyWorkout());
		
		//close the context
		
		context.close();
				

	}

}
