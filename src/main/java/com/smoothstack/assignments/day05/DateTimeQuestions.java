package com.smoothstack.assignments.day05;

import java.util.Date;

public class DateTimeQuestions {
	static long millisecondsPerDay = 1000*60*60*24;
	static public String whatClassWouldYouUseToStoreYourBirthday() {
		return "LocalDateTime";
	}
	static Date dateOfPreviousThursday(Date d) {
		int day = d.getDay();
		int dayOffset = ((day+2)%7)+1;
		return new Date(d.getTime()-millisecondsPerDay*dayOffset);
	}
	public static void main(String[] args) {
		Date d = new Date();
		long time_ = d.getTime()+500*millisecondsPerDay;
		Date d2 = new Date(time_);
		System.out.println(dateOfPreviousThursday(d2));
	}
}
