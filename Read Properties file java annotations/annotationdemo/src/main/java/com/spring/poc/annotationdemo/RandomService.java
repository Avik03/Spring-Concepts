package com.spring.poc.annotationdemo;

import org.springframework.stereotype.Component;

@Component
public class RandomService implements FortuneService {

	@Override
	public String getFortune() {
		return "You have a crazy fortue.";
	}

}
