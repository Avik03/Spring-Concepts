package com.spring.poc.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		
		//Load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		// Retrieve bean from the spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		
		//check if they are same
		
		boolean result = (theCoach == alphaCoach);
		
		System.out.println("\n Pointing to the same object" + result);
		
		System.out.println("\n Memory location theCoach:" + theCoach);
		
		System.out.println("\n Memory location alphaCoach:" + alphaCoach + "\n");

		context.close();
	}

}
