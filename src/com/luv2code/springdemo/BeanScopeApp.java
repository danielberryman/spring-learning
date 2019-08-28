package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		TrackCoach coach1 = context.getBean("myCoach", TrackCoach.class);
		TrackCoach coach2 = context.getBean("myCoach", TrackCoach.class);
		
		System.out.println("Coach1 team name: " + coach1.getTeam());
		System.out.println("Coach2 team name: " + coach2.getTeam());
		
		System.out.println("Resetting Coach2 team name...");
		coach2.setTeam("Lions");
		
		System.out.println("Coach1 team name: " + coach1.getTeam());
		System.out.println("Coach2 team name: " + coach2.getTeam());
		
		context.close();
	}

}
