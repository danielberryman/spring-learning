package com.luv2code.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	private String team;
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	@Override
	public String getDailyWorkout() {
		return "lift 60 lbs 5x daily";
	}

	@Override
	public String getDailyFortune() {
		return "Just do it: " + fortuneService.getFortune();
	}
	
//	add init method
	public void doStartUpStuff() {
		System.out.println("TrackCoach: inside method doStartUpStuff");
	}
	
//	add destroy method
	public void doCleanUpStuff() {
		System.out.println("TrackCoach: inside method doCleanUpStuff");
	}
	
}
