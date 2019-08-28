package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {

	public static void main(String[] args) {
//		load config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
//		retrieve bean
		Coach theCoach = context.getBean("myCoach", Coach.class);
		CricketCoach theCoach2 = context.getBean("myCoach2", CricketCoach.class);
		
//		call method on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach2.getDailyWorkout());
		System.out.println(theCoach2.getDailyFortune());
		System.out.println(theCoach2.getEmailAddress());
		System.out.println(theCoach2.getTeam());
		
//		close the context
		context.close();
	}
}
