package com.luv2code.springdemo;

import java.util.Random;

public class SadFortuneService implements FortuneService {
	
	private String[] fortunes = {"It's gonna rain today...","Help me! This is the last day!","Oh bother...","What do ya do?"};

	public SadFortuneService() {
	}

	@Override
	public String getFortune() {
		System.out.println("Random fortunes being generated...");
		Random random = new Random();
		return fortunes[random.nextInt(fortunes.length)];
	}

}
