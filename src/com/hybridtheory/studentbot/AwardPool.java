package com.hybridtheory.studentbot;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class AwardPool {

	private Award streak_day;
	private Award streak_week;
	private Award streak_month;
	private Award streak_year;
	
	private Award numberOFWordsLearnt8thStrength_100;
	private Award numberOFWordsLearnt8thStrength_1000;
	private Award numberOFWordsLearnt8thStrength_3000;
	private Award numberOFWordsLearnt8thStrength_5000;
	private Award numberOFWordsLearnt8thStrength_10000;
	
	private Award numberOFLanguagesLearnt_scenario1;
	private Award numberOFLanguagesLearnt_scenario2;
	private Award numberOFLanguagesLearnt_scenario3;
	private Award numberOFLanguagesLearnt_scenario4;
	private Award numberOFLanguagesLearnt_scenario5;
	private Award numberOFLanguagesLearnt_scenario6;
	private Award numberOFLanguagesLearnt_scenario7;
	private Award numberOFLanguagesLearnt_scenario8;
	private Award numberOFLanguagesLearnt_scenario9;
	private Award numberOFLanguagesLearnt_scenario10;
	private Award numberOFLanguagesLearnt_scenario11;
	private Award numberOFLanguagesLearnt_scenario12;
	private Award numberOFLanguagesLearnt_scenario13;
	private Award numberOFLanguagesLearnt_scenario14;
	private Award numberOFLanguagesLearnt_scenario15;
	private Award numberOFLanguagesLearnt_scenario16;
	private Award numberOFLanguagesLearnt_scenario17;
	private Award numberOFLanguagesLearnt_scenario18;
	private Award numberOFLanguagesLearnt_scenario19;
	private Award numberOFLanguagesLearnt_scenario20;
	private Award numberOFLanguagesLearnt_scenario21;
	private Award numberOFLanguagesLearnt_scenario22;
	private Award numberOFLanguagesLearnt_scenario23;
	private Award numberOFLanguagesLearnt_scenario24;
	private Award numberOFLanguagesLearnt_scenario25;
	private Award numberOFLanguagesLearnt_scenario26;
	private Award numberOFLanguagesLearnt_scenario27;
	private Award numberOFLanguagesLearnt_scenario28;
	private Award numberOFLanguagesLearnt_scenario29;
	private Award numberOFLanguagesLearnt_scenario30;
	private Award numberOFLanguagesLearnt_scenario31;
	private Award numberOFLanguagesLearnt_scenario32;
	private Award numberOFLanguagesLearnt_scenario33;
	private Award numberOFLanguagesLearnt_scenario34;
	private Award numberOFLanguagesLearnt_scenario35;
	private Award numberOFLanguagesLearnt_scenario36;
	private Award numberOFLanguagesLearnt_scenario37;
	private Award numberOFLanguagesLearnt_scenario38;
	private Award numberOFLanguagesLearnt_scenario39;
	private Award numberOFLanguagesLearnt_scenario40;
	private Award numberOFLanguagesLearnt_scenario41;
	private Award numberOFLanguagesLearnt_scenario42;
	private Award numberOFLanguagesLearnt_scenario43;
	private Award numberOFLanguagesLearnt_scenario44;
	private Award numberOFLanguagesLearnt_scenario45;
	
	private Award percentageOfCorrectAnswersInMonthPer500Word_25;
	private Award percentageOfCorrectAnswersInMonthPer500Word_50;
	private Award percentageOfCorrectAnswersInMonthPer500Word_75;
	private Award percentageOfCorrectAnswersInMonthPer500Word_100;
	
	private Award timeSpentWithLearning_50hours;
	private Award timeSpentWithLearning_100hours;
	private Award timeSpentWithLearning_500hours;
	private Award timeSpentWithLearning_1000hours;
	
	private Award otherStudentSubscribers_1;
	private Award otherStudentSubscribers_5;
	private Award otherStudentSubscribers_10;
	private Award otherStudentSubscribers_50;
	private Award otherStudentSubscribers_100;
	private Award otherStudentSubscribers_1000;
	
	private Award invitedStudents_1;
	private Award invitedStudents_5;
	private Award invitedStudents_10;
	private Award invitedStudents_50;
	private Award invitedStudents_100;
	
	private Award otherStudentJoinedDueToInvite_1;
	private Award otherStudentJoinedDueToInvite_5;
	private Award otherStudentJoinedDueToInvite_10;
	private Award otherStudentJoinedDueToInvite_50;
	private Award otherStudentJoinedDueToInvite_100;
	
	private Award sharedOnFacebook_firstShare;
	private Award sharedOnFacebook_consecutiveShare;
	private Award sharedOnTwitter_firstShare;
	private Award sharedOnTwitter_consecutiveShare;
	private Award sharedOnGoogleplus_firstShare;
	private Award sharedOnGoogleplus_consecutiveShare;
	
	
	
	public AwardPool() {
		this.streak_day = new Award("Day streak", false, 10, "none");
		this.streak_week = new Award("Week streak", false, 100, "none");
		this.streak_month = new Award("Month streak", false, 5000, "none");
		this.streak_year = new Award("Year streak", false, 1000000000, "CustomSkin1");
		
		this.numberOFWordsLearnt8thStrength_100 = new Award("100 words with 8 strength", false, 50, "none");
		this.numberOFWordsLearnt8thStrength_1000 = new Award("1000 words with 8 strength", false, 5000, "none");
		this.numberOFWordsLearnt8thStrength_3000 = new Award("3000 words with 8 strength", false, 20000, "none");
		this.numberOFWordsLearnt8thStrength_5000 = new Award("5000 words with 8 strength", false, 50000, "none");
		this.numberOFWordsLearnt8thStrength_10000 = new Award("10000 words with 8 strength", false, 100000, "none");
		
		this.numberOFLanguagesLearnt_scenario1 = new Award("1 language learnt on basic level", false, 5000, "none");
		this.numberOFLanguagesLearnt_scenario2 = new Award("1 language learnt on advanced level", false, 10000, "none");
		this.numberOFLanguagesLearnt_scenario3 = new Award("<will be filled>", false, 20000, "none");
		this.numberOFLanguagesLearnt_scenario4 = new Award("<will be filled>", false, 10000, "none");
		this.numberOFLanguagesLearnt_scenario5 = new Award("<will be filled>", false, 20000, "none");
		this.numberOFLanguagesLearnt_scenario6 = new Award("<will be filled>", false, 40000, "CustomItem1");
		this.numberOFLanguagesLearnt_scenario7 = new Award("<will be filled>", false, 15000, "none");
		this.numberOFLanguagesLearnt_scenario8 = new Award("<will be filled>", false, 30000, "none");
		this.numberOFLanguagesLearnt_scenario9 = new Award("<will be filled>", false, 60000, "CustomItem2");
		this.numberOFLanguagesLearnt_scenario10 = new Award("<will be filled>", false, 20000, "none");
		this.numberOFLanguagesLearnt_scenario11 = new Award("<will be filled>", false, 40000, "none");
		this.numberOFLanguagesLearnt_scenario12 = new Award("<will be filled>", false, 80000, "CustomSkin2");
		this.numberOFLanguagesLearnt_scenario13 = new Award("<will be filled>", false, 25000, "none");
		this.numberOFLanguagesLearnt_scenario14 = new Award("<will be filled>", false, 50000, "none");
		this.numberOFLanguagesLearnt_scenario15 = new Award("<will be filled>", false, 100000, "CustomSkin3");
		this.numberOFLanguagesLearnt_scenario16 = new Award("<will be filled>", false, 15000, "none");
		this.numberOFLanguagesLearnt_scenario17 = new Award("<will be filled>", false, 25000, "none");
		this.numberOFLanguagesLearnt_scenario18 = new Award("<will be filled>", false, 30000, "none");
		this.numberOFLanguagesLearnt_scenario19 = new Award("<will be filled>", false, 20000, "none");
		this.numberOFLanguagesLearnt_scenario20 = new Award("<will be filled>", false, 30000, "none");
		this.numberOFLanguagesLearnt_scenario21 = new Award("<will be filled>", false, 40000, "none");
		this.numberOFLanguagesLearnt_scenario22 = new Award("<will be filled>", false, 25000, "none");
		this.numberOFLanguagesLearnt_scenario23 = new Award("<will be filled>", false, 50000, "none");
		this.numberOFLanguagesLearnt_scenario24 = new Award("<will be filled>", false, 45000, "none");
		this.numberOFLanguagesLearnt_scenario25 = new Award("<will be filled>", false, 40000, "none");
		this.numberOFLanguagesLearnt_scenario26 = new Award("<will be filled>", false, 45000, "none");
		this.numberOFLanguagesLearnt_scenario27 = new Award("<will be filled>", false, 55000, "none");
		this.numberOFLanguagesLearnt_scenario28 = new Award("<will be filled>", false, 25000, "none");
		this.numberOFLanguagesLearnt_scenario29 = new Award("<will be filled>", false, 35000, "none");
		this.numberOFLanguagesLearnt_scenario30 = new Award("<will be filled>", false, 50000, "none");
		this.numberOFLanguagesLearnt_scenario31 = new Award("<will be filled>", false, 35000, "none");
		this.numberOFLanguagesLearnt_scenario32 = new Award("<will be filled>", false, 70000, "none");
		this.numberOFLanguagesLearnt_scenario33 = new Award("<will be filled>", false, 65000, "none");
		this.numberOFLanguagesLearnt_scenario34 = new Award("<will be filled>", false, 30000, "none");
		this.numberOFLanguagesLearnt_scenario35 = new Award("<will be filled>", false, 40000, "none");
		this.numberOFLanguagesLearnt_scenario36 = new Award("<will be filled>", false, 60000, "none");
		this.numberOFLanguagesLearnt_scenario37 = new Award("<will be filled>", false, 45000, "none");
		this.numberOFLanguagesLearnt_scenario38 = new Award("<will be filled>", false, 90000, "none");
		this.numberOFLanguagesLearnt_scenario39 = new Award("<will be filled>", false, 85000, "none");
		this.numberOFLanguagesLearnt_scenario40 = new Award("<will be filled>", false, 45000, "none");
		this.numberOFLanguagesLearnt_scenario41 = new Award("<will be filled>", false, 55000, "none");
		this.numberOFLanguagesLearnt_scenario42 = new Award("<will be filled>", false, 75000, "none");
		this.numberOFLanguagesLearnt_scenario43 = new Award("<will be filled>", false, 50000, "none");
		this.numberOFLanguagesLearnt_scenario44 = new Award("<will be filled>", false, 60000, "none");
		this.numberOFLanguagesLearnt_scenario45 = new Award("<will be filled>", false, 65000, "none");

		this.percentageOfCorrectAnswersInMonthPer500Word_25 = new Award("25% correct answers for a month for at least 500 words", false, 50, "none");
		this.percentageOfCorrectAnswersInMonthPer500Word_50 = new Award("50% correct answers for a month for at least 500 words", false, 1000, "none");
		this.percentageOfCorrectAnswersInMonthPer500Word_75 = new Award("75% correct answers for a month for at least 500 words", false, 3000, "none");
		this.percentageOfCorrectAnswersInMonthPer500Word_100 = new Award("100% correct answers for a month for at least 500 words", false, 500000, "CustomItem3");
		
		this.timeSpentWithLearning_50hours = new Award("50 hours spent learning", false, 1000, "none");
		this.timeSpentWithLearning_100hours = new Award("100 hours spent learning", false, 5000, "none");
		this.timeSpentWithLearning_500hours = new Award("500 hours spent learning", false, 20000, "none");
		this.timeSpentWithLearning_1000hours = new Award("1000 hours spent learning", false, 50000, "none");
		
		this.otherStudentSubscribers_1 = new Award("1 subscriber on Student's own learn item list", false, 1000, "none");
		this.otherStudentSubscribers_5 = new Award("5 subscriber on Student's own learn item list", false, 5000, "none");
		this.otherStudentSubscribers_10 = new Award("10 subscriber on Student's own learn item list", false, 10000, "none");
		this.otherStudentSubscribers_50 = new Award("50 subscriber on Student's own learn item list", false, 50000, "CustomItem4");
		this.otherStudentSubscribers_100 = new Award("100 subscriber on Student's own learn item list", false, 100000, "none");
		this.otherStudentSubscribers_1000 = new Award("1000 subscriber on Student's own learn item list", false, 1000000, "CustomSkin4");
		
		this.invitedStudents_1 = new Award("1 friend invited by Student", false, 500, "none");
		this.invitedStudents_5 = new Award("5 friend invited by Student", false, 2500, "none");
		this.invitedStudents_10 = new Award("10 friend invited by Student", false, 5000, "CustomItem5");
		this.invitedStudents_50 = new Award("50 friend invited by Student", false, 25000, "none");
		this.invitedStudents_100 = new Award("100 friend invited by Student", false, 50000, "CustomSkin5");
		
		this.otherStudentJoinedDueToInvite_1 = new Award("1 friend joined due to Student's invite", false, 5000, "none");
		this.otherStudentJoinedDueToInvite_5 = new Award("5 friend joined due to Student's invite", false, 25000, "CustomItem6");
		this.otherStudentJoinedDueToInvite_10 = new Award("10 friend joined due to Student's invite", false, 50000, "none");
		this.otherStudentJoinedDueToInvite_50 = new Award("50 friend joined due to Student's invite", false, 250000, "CustomItem7");
		this.otherStudentJoinedDueToInvite_100 = new Award("100 friend joined due to Student's invite", false, 500000, "CustomSkin6");
		
		this.sharedOnFacebook_firstShare = new Award("Shared on Facebook", false, 10, "CustomItem8");
		this.sharedOnFacebook_consecutiveShare = new Award("Another share on Facebook", false, 10, "none");
		this.sharedOnTwitter_firstShare = new Award("Shared on Twitter", false, 10, "CustomItem9");
		this.sharedOnTwitter_consecutiveShare = new Award("Another share on Twitter", false, 10, "none");
		this.sharedOnGoogleplus_firstShare = new Award("Shared on Google+", false, 10, "CustomItem10");
		this.sharedOnGoogleplus_consecutiveShare = new Award("Another share on Google+", false, 10, "none");
	}
	
	public String toString() {
		  return ToStringBuilder.reflectionToString(this);	
	}

	public Award getStreak_week() {
		return streak_week;
	}



	public void setStreak_week(Award streak_week) {
		this.streak_week = streak_week;
	}



	public Award getStreak_month() {
		return streak_month;
	}



	public void setStreak_month(Award streak_month) {
		this.streak_month = streak_month;
	}
	

	public Award getStreak_day() {
		return streak_day;
	}



	public void setStreak_day(Award streak_day) {
		this.streak_day = streak_day;
	}



	public Award getStreak_year() {
		return streak_year;
	}



	public void setStreak_year(Award streak_year) {
		this.streak_year = streak_year;
	}



	public Award getNumberOFWordsLearnt8thStrength_100() {
		return numberOFWordsLearnt8thStrength_100;
	}



	public void setNumberOFWordsLearnt8thStrength_100(Award numberOFWordsLearnt8thStrength_100) {
		this.numberOFWordsLearnt8thStrength_100 = numberOFWordsLearnt8thStrength_100;
	}



	public Award getNumberOFWordsLearnt8thStrength_1000() {
		return numberOFWordsLearnt8thStrength_1000;
	}



	public void setNumberOFWordsLearnt8thStrength_1000(Award numberOFWordsLearnt8thStrength_1000) {
		this.numberOFWordsLearnt8thStrength_1000 = numberOFWordsLearnt8thStrength_1000;
	}



	public Award getNumberOFWordsLearnt8thStrength_3000() {
		return numberOFWordsLearnt8thStrength_3000;
	}



	public void setNumberOFWordsLearnt8thStrength_3000(Award numberOFWordsLearnt8thStrength_3000) {
		this.numberOFWordsLearnt8thStrength_3000 = numberOFWordsLearnt8thStrength_3000;
	}



	public Award getNumberOFWordsLearnt8thStrength_5000() {
		return numberOFWordsLearnt8thStrength_5000;
	}



	public void setNumberOFWordsLearnt8thStrength_5000(Award numberOFWordsLearnt8thStrength_5000) {
		this.numberOFWordsLearnt8thStrength_5000 = numberOFWordsLearnt8thStrength_5000;
	}



	public Award getNumberOFWordsLearnt8thStrength_10000() {
		return numberOFWordsLearnt8thStrength_10000;
	}



	public void setNumberOFWordsLearnt8thStrength_10000(Award numberOFWordsLearnt8thStrength_10000) {
		this.numberOFWordsLearnt8thStrength_10000 = numberOFWordsLearnt8thStrength_10000;
	}



	public Award getNumberOFLanguagesLearnt_scenario1() {
		return numberOFLanguagesLearnt_scenario1;
	}



	public void setNumberOFLanguagesLearnt_scenario1(Award numberOFLanguagesLearnt_scenario1) {
		this.numberOFLanguagesLearnt_scenario1 = numberOFLanguagesLearnt_scenario1;
	}



	public Award getNumberOFLanguagesLearnt_scenario2() {
		return numberOFLanguagesLearnt_scenario2;
	}



	public void setNumberOFLanguagesLearnt_scenario2(Award numberOFLanguagesLearnt_scenario2) {
		this.numberOFLanguagesLearnt_scenario2 = numberOFLanguagesLearnt_scenario2;
	}



	public Award getNumberOFLanguagesLearnt_scenario3() {
		return numberOFLanguagesLearnt_scenario3;
	}



	public void setNumberOFLanguagesLearnt_scenario3(Award numberOFLanguagesLearnt_scenario3) {
		this.numberOFLanguagesLearnt_scenario3 = numberOFLanguagesLearnt_scenario3;
	}



	public Award getNumberOFLanguagesLearnt_scenario4() {
		return numberOFLanguagesLearnt_scenario4;
	}



	public void setNumberOFLanguagesLearnt_scenario4(Award numberOFLanguagesLearnt_scenario4) {
		this.numberOFLanguagesLearnt_scenario4 = numberOFLanguagesLearnt_scenario4;
	}



	public Award getNumberOFLanguagesLearnt_scenario5() {
		return numberOFLanguagesLearnt_scenario5;
	}



	public void setNumberOFLanguagesLearnt_scenario5(Award numberOFLanguagesLearnt_scenario5) {
		this.numberOFLanguagesLearnt_scenario5 = numberOFLanguagesLearnt_scenario5;
	}



	public Award getNumberOFLanguagesLearnt_scenario6() {
		return numberOFLanguagesLearnt_scenario6;
	}



	public void setNumberOFLanguagesLearnt_scenario6(Award numberOFLanguagesLearnt_scenario6) {
		this.numberOFLanguagesLearnt_scenario6 = numberOFLanguagesLearnt_scenario6;
	}



	public Award getNumberOFLanguagesLearnt_scenario7() {
		return numberOFLanguagesLearnt_scenario7;
	}



	public void setNumberOFLanguagesLearnt_scenario7(Award numberOFLanguagesLearnt_scenario7) {
		this.numberOFLanguagesLearnt_scenario7 = numberOFLanguagesLearnt_scenario7;
	}



	public Award getNumberOFLanguagesLearnt_scenario8() {
		return numberOFLanguagesLearnt_scenario8;
	}



	public void setNumberOFLanguagesLearnt_scenario8(Award numberOFLanguagesLearnt_scenario8) {
		this.numberOFLanguagesLearnt_scenario8 = numberOFLanguagesLearnt_scenario8;
	}



	public Award getNumberOFLanguagesLearnt_scenario9() {
		return numberOFLanguagesLearnt_scenario9;
	}



	public void setNumberOFLanguagesLearnt_scenario9(Award numberOFLanguagesLearnt_scenario9) {
		this.numberOFLanguagesLearnt_scenario9 = numberOFLanguagesLearnt_scenario9;
	}



	public Award getNumberOFLanguagesLearnt_scenario10() {
		return numberOFLanguagesLearnt_scenario10;
	}



	public void setNumberOFLanguagesLearnt_scenario10(Award numberOFLanguagesLearnt_scenario10) {
		this.numberOFLanguagesLearnt_scenario10 = numberOFLanguagesLearnt_scenario10;
	}



	public Award getNumberOFLanguagesLearnt_scenario11() {
		return numberOFLanguagesLearnt_scenario11;
	}



	public void setNumberOFLanguagesLearnt_scenario11(Award numberOFLanguagesLearnt_scenario11) {
		this.numberOFLanguagesLearnt_scenario11 = numberOFLanguagesLearnt_scenario11;
	}



	public Award getNumberOFLanguagesLearnt_scenario12() {
		return numberOFLanguagesLearnt_scenario12;
	}



	public void setNumberOFLanguagesLearnt_scenario12(Award numberOFLanguagesLearnt_scenario12) {
		this.numberOFLanguagesLearnt_scenario12 = numberOFLanguagesLearnt_scenario12;
	}



	public Award getNumberOFLanguagesLearnt_scenario13() {
		return numberOFLanguagesLearnt_scenario13;
	}



	public void setNumberOFLanguagesLearnt_scenario13(Award numberOFLanguagesLearnt_scenario13) {
		this.numberOFLanguagesLearnt_scenario13 = numberOFLanguagesLearnt_scenario13;
	}



	public Award getNumberOFLanguagesLearnt_scenario14() {
		return numberOFLanguagesLearnt_scenario14;
	}



	public void setNumberOFLanguagesLearnt_scenario14(Award numberOFLanguagesLearnt_scenario14) {
		this.numberOFLanguagesLearnt_scenario14 = numberOFLanguagesLearnt_scenario14;
	}



	public Award getNumberOFLanguagesLearnt_scenario15() {
		return numberOFLanguagesLearnt_scenario15;
	}



	public void setNumberOFLanguagesLearnt_scenario15(Award numberOFLanguagesLearnt_scenario15) {
		this.numberOFLanguagesLearnt_scenario15 = numberOFLanguagesLearnt_scenario15;
	}



	public Award getNumberOFLanguagesLearnt_scenario16() {
		return numberOFLanguagesLearnt_scenario16;
	}



	public void setNumberOFLanguagesLearnt_scenario16(Award numberOFLanguagesLearnt_scenario16) {
		this.numberOFLanguagesLearnt_scenario16 = numberOFLanguagesLearnt_scenario16;
	}



	public Award getNumberOFLanguagesLearnt_scenario17() {
		return numberOFLanguagesLearnt_scenario17;
	}



	public void setNumberOFLanguagesLearnt_scenario17(Award numberOFLanguagesLearnt_scenario17) {
		this.numberOFLanguagesLearnt_scenario17 = numberOFLanguagesLearnt_scenario17;
	}



	public Award getNumberOFLanguagesLearnt_scenario18() {
		return numberOFLanguagesLearnt_scenario18;
	}



	public void setNumberOFLanguagesLearnt_scenario18(Award numberOFLanguagesLearnt_scenario18) {
		this.numberOFLanguagesLearnt_scenario18 = numberOFLanguagesLearnt_scenario18;
	}



	public Award getNumberOFLanguagesLearnt_scenario19() {
		return numberOFLanguagesLearnt_scenario19;
	}



	public void setNumberOFLanguagesLearnt_scenario19(Award numberOFLanguagesLearnt_scenario19) {
		this.numberOFLanguagesLearnt_scenario19 = numberOFLanguagesLearnt_scenario19;
	}



	public Award getNumberOFLanguagesLearnt_scenario20() {
		return numberOFLanguagesLearnt_scenario20;
	}



	public void setNumberOFLanguagesLearnt_scenario20(Award numberOFLanguagesLearnt_scenario20) {
		this.numberOFLanguagesLearnt_scenario20 = numberOFLanguagesLearnt_scenario20;
	}



	public Award getNumberOFLanguagesLearnt_scenario21() {
		return numberOFLanguagesLearnt_scenario21;
	}



	public void setNumberOFLanguagesLearnt_scenario21(Award numberOFLanguagesLearnt_scenario21) {
		this.numberOFLanguagesLearnt_scenario21 = numberOFLanguagesLearnt_scenario21;
	}



	public Award getNumberOFLanguagesLearnt_scenario22() {
		return numberOFLanguagesLearnt_scenario22;
	}



	public void setNumberOFLanguagesLearnt_scenario22(Award numberOFLanguagesLearnt_scenario22) {
		this.numberOFLanguagesLearnt_scenario22 = numberOFLanguagesLearnt_scenario22;
	}



	public Award getNumberOFLanguagesLearnt_scenario23() {
		return numberOFLanguagesLearnt_scenario23;
	}



	public void setNumberOFLanguagesLearnt_scenario23(Award numberOFLanguagesLearnt_scenario23) {
		this.numberOFLanguagesLearnt_scenario23 = numberOFLanguagesLearnt_scenario23;
	}



	public Award getNumberOFLanguagesLearnt_scenario24() {
		return numberOFLanguagesLearnt_scenario24;
	}



	public void setNumberOFLanguagesLearnt_scenario24(Award numberOFLanguagesLearnt_scenario24) {
		this.numberOFLanguagesLearnt_scenario24 = numberOFLanguagesLearnt_scenario24;
	}



	public Award getNumberOFLanguagesLearnt_scenario25() {
		return numberOFLanguagesLearnt_scenario25;
	}



	public void setNumberOFLanguagesLearnt_scenario25(Award numberOFLanguagesLearnt_scenario25) {
		this.numberOFLanguagesLearnt_scenario25 = numberOFLanguagesLearnt_scenario25;
	}



	public Award getNumberOFLanguagesLearnt_scenario26() {
		return numberOFLanguagesLearnt_scenario26;
	}



	public void setNumberOFLanguagesLearnt_scenario26(Award numberOFLanguagesLearnt_scenario26) {
		this.numberOFLanguagesLearnt_scenario26 = numberOFLanguagesLearnt_scenario26;
	}



	public Award getNumberOFLanguagesLearnt_scenario27() {
		return numberOFLanguagesLearnt_scenario27;
	}



	public void setNumberOFLanguagesLearnt_scenario27(Award numberOFLanguagesLearnt_scenario27) {
		this.numberOFLanguagesLearnt_scenario27 = numberOFLanguagesLearnt_scenario27;
	}



	public Award getNumberOFLanguagesLearnt_scenario28() {
		return numberOFLanguagesLearnt_scenario28;
	}



	public void setNumberOFLanguagesLearnt_scenario28(Award numberOFLanguagesLearnt_scenario28) {
		this.numberOFLanguagesLearnt_scenario28 = numberOFLanguagesLearnt_scenario28;
	}



	public Award getNumberOFLanguagesLearnt_scenario29() {
		return numberOFLanguagesLearnt_scenario29;
	}



	public void setNumberOFLanguagesLearnt_scenario29(Award numberOFLanguagesLearnt_scenario29) {
		this.numberOFLanguagesLearnt_scenario29 = numberOFLanguagesLearnt_scenario29;
	}



	public Award getNumberOFLanguagesLearnt_scenario30() {
		return numberOFLanguagesLearnt_scenario30;
	}



	public void setNumberOFLanguagesLearnt_scenario30(Award numberOFLanguagesLearnt_scenario30) {
		this.numberOFLanguagesLearnt_scenario30 = numberOFLanguagesLearnt_scenario30;
	}



	public Award getNumberOFLanguagesLearnt_scenario31() {
		return numberOFLanguagesLearnt_scenario31;
	}



	public void setNumberOFLanguagesLearnt_scenario31(Award numberOFLanguagesLearnt_scenario31) {
		this.numberOFLanguagesLearnt_scenario31 = numberOFLanguagesLearnt_scenario31;
	}



	public Award getNumberOFLanguagesLearnt_scenario32() {
		return numberOFLanguagesLearnt_scenario32;
	}



	public void setNumberOFLanguagesLearnt_scenario32(Award numberOFLanguagesLearnt_scenario32) {
		this.numberOFLanguagesLearnt_scenario32 = numberOFLanguagesLearnt_scenario32;
	}



	public Award getNumberOFLanguagesLearnt_scenario33() {
		return numberOFLanguagesLearnt_scenario33;
	}



	public void setNumberOFLanguagesLearnt_scenario33(Award numberOFLanguagesLearnt_scenario33) {
		this.numberOFLanguagesLearnt_scenario33 = numberOFLanguagesLearnt_scenario33;
	}



	public Award getNumberOFLanguagesLearnt_scenario34() {
		return numberOFLanguagesLearnt_scenario34;
	}



	public void setNumberOFLanguagesLearnt_scenario34(Award numberOFLanguagesLearnt_scenario34) {
		this.numberOFLanguagesLearnt_scenario34 = numberOFLanguagesLearnt_scenario34;
	}



	public Award getNumberOFLanguagesLearnt_scenario35() {
		return numberOFLanguagesLearnt_scenario35;
	}



	public void setNumberOFLanguagesLearnt_scenario35(Award numberOFLanguagesLearnt_scenario35) {
		this.numberOFLanguagesLearnt_scenario35 = numberOFLanguagesLearnt_scenario35;
	}



	public Award getNumberOFLanguagesLearnt_scenario36() {
		return numberOFLanguagesLearnt_scenario36;
	}



	public void setNumberOFLanguagesLearnt_scenario36(Award numberOFLanguagesLearnt_scenario36) {
		this.numberOFLanguagesLearnt_scenario36 = numberOFLanguagesLearnt_scenario36;
	}



	public Award getNumberOFLanguagesLearnt_scenario37() {
		return numberOFLanguagesLearnt_scenario37;
	}



	public void setNumberOFLanguagesLearnt_scenario37(Award numberOFLanguagesLearnt_scenario37) {
		this.numberOFLanguagesLearnt_scenario37 = numberOFLanguagesLearnt_scenario37;
	}



	public Award getNumberOFLanguagesLearnt_scenario38() {
		return numberOFLanguagesLearnt_scenario38;
	}



	public void setNumberOFLanguagesLearnt_scenario38(Award numberOFLanguagesLearnt_scenario38) {
		this.numberOFLanguagesLearnt_scenario38 = numberOFLanguagesLearnt_scenario38;
	}



	public Award getNumberOFLanguagesLearnt_scenario39() {
		return numberOFLanguagesLearnt_scenario39;
	}



	public void setNumberOFLanguagesLearnt_scenario39(Award numberOFLanguagesLearnt_scenario39) {
		this.numberOFLanguagesLearnt_scenario39 = numberOFLanguagesLearnt_scenario39;
	}



	public Award getNumberOFLanguagesLearnt_scenario40() {
		return numberOFLanguagesLearnt_scenario40;
	}



	public void setNumberOFLanguagesLearnt_scenario40(Award numberOFLanguagesLearnt_scenario40) {
		this.numberOFLanguagesLearnt_scenario40 = numberOFLanguagesLearnt_scenario40;
	}



	public Award getNumberOFLanguagesLearnt_scenario41() {
		return numberOFLanguagesLearnt_scenario41;
	}



	public void setNumberOFLanguagesLearnt_scenario41(Award numberOFLanguagesLearnt_scenario41) {
		this.numberOFLanguagesLearnt_scenario41 = numberOFLanguagesLearnt_scenario41;
	}



	public Award getNumberOFLanguagesLearnt_scenario42() {
		return numberOFLanguagesLearnt_scenario42;
	}



	public void setNumberOFLanguagesLearnt_scenario42(Award numberOFLanguagesLearnt_scenario42) {
		this.numberOFLanguagesLearnt_scenario42 = numberOFLanguagesLearnt_scenario42;
	}



	public Award getNumberOFLanguagesLearnt_scenario43() {
		return numberOFLanguagesLearnt_scenario43;
	}



	public void setNumberOFLanguagesLearnt_scenario43(Award numberOFLanguagesLearnt_scenario43) {
		this.numberOFLanguagesLearnt_scenario43 = numberOFLanguagesLearnt_scenario43;
	}



	public Award getNumberOFLanguagesLearnt_scenario44() {
		return numberOFLanguagesLearnt_scenario44;
	}



	public void setNumberOFLanguagesLearnt_scenario44(Award numberOFLanguagesLearnt_scenario44) {
		this.numberOFLanguagesLearnt_scenario44 = numberOFLanguagesLearnt_scenario44;
	}



	public Award getNumberOFLanguagesLearnt_scenario45() {
		return numberOFLanguagesLearnt_scenario45;
	}



	public void setNumberOFLanguagesLearnt_scenario45(Award numberOFLanguagesLearnt_scenario45) {
		this.numberOFLanguagesLearnt_scenario45 = numberOFLanguagesLearnt_scenario45;
	}



	public Award getPercentageOfCorrectAnswersInMonthPer500Word_25() {
		return percentageOfCorrectAnswersInMonthPer500Word_25;
	}



	public void setPercentageOfCorrectAnswersInMonthPer500Word_25(Award percentageOfCorrectAnswersInMonthPer500Word_25) {
		this.percentageOfCorrectAnswersInMonthPer500Word_25 = percentageOfCorrectAnswersInMonthPer500Word_25;
	}



	public Award getPercentageOfCorrectAnswersInMonthPer500Word_50() {
		return percentageOfCorrectAnswersInMonthPer500Word_50;
	}



	public void setPercentageOfCorrectAnswersInMonthPer500Word_50(Award percentageOfCorrectAnswersInMonthPer500Word_50) {
		this.percentageOfCorrectAnswersInMonthPer500Word_50 = percentageOfCorrectAnswersInMonthPer500Word_50;
	}



	public Award getPercentageOfCorrectAnswersInMonthPer500Word_75() {
		return percentageOfCorrectAnswersInMonthPer500Word_75;
	}



	public void setPercentageOfCorrectAnswersInMonthPer500Word_75(Award percentageOfCorrectAnswersInMonthPer500Word_75) {
		this.percentageOfCorrectAnswersInMonthPer500Word_75 = percentageOfCorrectAnswersInMonthPer500Word_75;
	}



	public Award getPercentageOfCorrectAnswersInMonthPer500Word_100() {
		return percentageOfCorrectAnswersInMonthPer500Word_100;
	}



	public void setPercentageOfCorrectAnswersInMonthPer500Word_100(Award percentageOfCorrectAnswersInMonthPer500Word_100) {
		this.percentageOfCorrectAnswersInMonthPer500Word_100 = percentageOfCorrectAnswersInMonthPer500Word_100;
	}



	public Award getTimeSpentWithLearning_50hours() {
		return timeSpentWithLearning_50hours;
	}



	public void setTimeSpentWithLearning_50hours(Award timeSpentWithLearning_50hours) {
		this.timeSpentWithLearning_50hours = timeSpentWithLearning_50hours;
	}



	public Award getTimeSpentWithLearning_100hours() {
		return timeSpentWithLearning_100hours;
	}



	public void setTimeSpentWithLearning_100hours(Award timeSpentWithLearning_100hours) {
		this.timeSpentWithLearning_100hours = timeSpentWithLearning_100hours;
	}



	public Award getTimeSpentWithLearning_500hours() {
		return timeSpentWithLearning_500hours;
	}



	public void setTimeSpentWithLearning_500hours(Award timeSpentWithLearning_500hours) {
		this.timeSpentWithLearning_500hours = timeSpentWithLearning_500hours;
	}



	public Award getTimeSpentWithLearning_1000hours() {
		return timeSpentWithLearning_1000hours;
	}



	public void setTimeSpentWithLearning_1000hours(Award timeSpentWithLearning_1000hours) {
		this.timeSpentWithLearning_1000hours = timeSpentWithLearning_1000hours;
	}



	public Award getOtherStudentSubscribers_1() {
		return otherStudentSubscribers_1;
	}



	public void setOtherStudentSubscribers_1(Award otherStudentSubscribers_1) {
		this.otherStudentSubscribers_1 = otherStudentSubscribers_1;
	}



	public Award getOtherStudentSubscribers_5() {
		return otherStudentSubscribers_5;
	}



	public void setOtherStudentSubscribers_5(Award otherStudentSubscribers_5) {
		this.otherStudentSubscribers_5 = otherStudentSubscribers_5;
	}



	public Award getOtherStudentSubscribers_10() {
		return otherStudentSubscribers_10;
	}



	public void setOtherStudentSubscribers_10(Award otherStudentSubscribers_10) {
		this.otherStudentSubscribers_10 = otherStudentSubscribers_10;
	}



	public Award getOtherStudentSubscribers_50() {
		return otherStudentSubscribers_50;
	}



	public void setOtherStudentSubscribers_50(Award otherStudentSubscribers_50) {
		this.otherStudentSubscribers_50 = otherStudentSubscribers_50;
	}



	public Award getOtherStudentSubscribers_100() {
		return otherStudentSubscribers_100;
	}



	public void setOtherStudentSubscribers_100(Award otherStudentSubscribers_100) {
		this.otherStudentSubscribers_100 = otherStudentSubscribers_100;
	}



	public Award getOtherStudentSubscribers_1000() {
		return otherStudentSubscribers_1000;
	}



	public void setOtherStudentSubscribers_1000(Award otherStudentSubscribers_1000) {
		this.otherStudentSubscribers_1000 = otherStudentSubscribers_1000;
	}



	public Award getInvitedStudents_1() {
		return invitedStudents_1;
	}



	public void setInvitedStudents_1(Award invitedStudents_1) {
		this.invitedStudents_1 = invitedStudents_1;
	}



	public Award getInvitedStudents_5() {
		return invitedStudents_5;
	}



	public void setInvitedStudents_5(Award invitedStudents_5) {
		this.invitedStudents_5 = invitedStudents_5;
	}



	public Award getInvitedStudents_10() {
		return invitedStudents_10;
	}



	public void setInvitedStudents_10(Award invitedStudents_10) {
		this.invitedStudents_10 = invitedStudents_10;
	}



	public Award getInvitedStudents_50() {
		return invitedStudents_50;
	}



	public void setInvitedStudents_50(Award invitedStudents_50) {
		this.invitedStudents_50 = invitedStudents_50;
	}



	public Award getInvitedStudents_100() {
		return invitedStudents_100;
	}



	public void setInvitedStudents_100(Award invitedStudents_100) {
		this.invitedStudents_100 = invitedStudents_100;
	}



	public Award getOtherStudentJoinedDueToInvite_1() {
		return otherStudentJoinedDueToInvite_1;
	}



	public void setOtherStudentJoinedDueToInvite_1(Award otherStudentJoinedDueToInvite_1) {
		this.otherStudentJoinedDueToInvite_1 = otherStudentJoinedDueToInvite_1;
	}



	public Award getOtherStudentJoinedDueToInvite_5() {
		return otherStudentJoinedDueToInvite_5;
	}



	public void setOtherStudentJoinedDueToInvite_5(Award otherStudentJoinedDueToInvite_5) {
		this.otherStudentJoinedDueToInvite_5 = otherStudentJoinedDueToInvite_5;
	}



	public Award getOtherStudentJoinedDueToInvite_10() {
		return otherStudentJoinedDueToInvite_10;
	}



	public void setOtherStudentJoinedDueToInvite_10(Award otherStudentJoinedDueToInvite_10) {
		this.otherStudentJoinedDueToInvite_10 = otherStudentJoinedDueToInvite_10;
	}



	public Award getOtherStudentJoinedDueToInvite_50() {
		return otherStudentJoinedDueToInvite_50;
	}



	public void setOtherStudentJoinedDueToInvite_50(Award otherStudentJoinedDueToInvite_50) {
		this.otherStudentJoinedDueToInvite_50 = otherStudentJoinedDueToInvite_50;
	}



	public Award getOtherStudentJoinedDueToInvite_100() {
		return otherStudentJoinedDueToInvite_100;
	}



	public void setOtherStudentJoinedDueToInvite_100(Award otherStudentJoinedDueToInvite_100) {
		this.otherStudentJoinedDueToInvite_100 = otherStudentJoinedDueToInvite_100;
	}



	public Award getSharedOnFacebook_firstShare() {
		return sharedOnFacebook_firstShare;
	}



	public void setSharedOnFacebook_firstShare(Award sharedOnFacebook_firstShare) {
		this.sharedOnFacebook_firstShare = sharedOnFacebook_firstShare;
	}



	public Award getSharedOnFacebook_consecutiveShare() {
		return sharedOnFacebook_consecutiveShare;
	}



	public void setSharedOnFacebook_consecutiveShare(Award sharedOnFacebook_consecutiveShare) {
		this.sharedOnFacebook_consecutiveShare = sharedOnFacebook_consecutiveShare;
	}



	public Award getSharedOnTwitter_firstShare() {
		return sharedOnTwitter_firstShare;
	}



	public void setSharedOnTwitter_firstShare(Award sharedOnTwitter_firstShare) {
		this.sharedOnTwitter_firstShare = sharedOnTwitter_firstShare;
	}



	public Award getSharedOnTwitter_consecutiveShare() {
		return sharedOnTwitter_consecutiveShare;
	}



	public void setSharedOnTwitter_consecutiveShare(Award sharedOnTwitter_consecutiveShare) {
		this.sharedOnTwitter_consecutiveShare = sharedOnTwitter_consecutiveShare;
	}



	public Award getSharedOnGoogleplus_firstShare() {
		return sharedOnGoogleplus_firstShare;
	}



	public void setSharedOnGoogleplus_firstShare(Award sharedOnGoogleplus_firstShare) {
		this.sharedOnGoogleplus_firstShare = sharedOnGoogleplus_firstShare;
	}



	public Award getSharedOnGoogleplus_consecutiveShare() {
		return sharedOnGoogleplus_consecutiveShare;
	}



	public void setSharedOnGoogleplus_consecutiveShare(Award sharedOnGoogleplus_consecutiveShare) {
		this.sharedOnGoogleplus_consecutiveShare = sharedOnGoogleplus_consecutiveShare;
	}
}
