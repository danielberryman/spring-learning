package com.luv2code.springdemo;

public class XGamesCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "10 runs on the half-pipe!!!";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "You'll complete that trick you've been working on!!";
	}
}
