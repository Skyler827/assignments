package com.smoothstack.assignments.day05;

import java.util.Date;

public class DateTimeQuestions {
	public String whatClassWouldYouUseToStoreYourBirthday() {
		return "LocalDateTime";
	}
	Date dateOfPreviousThursday(Date d) {
		int day = d.getDay();
		int dayOffset = ((day+2)%7)+1;
		int millisecondsPerDay = 1000*60*60*24;
		return new Date(d.getTime()-millisecondsPerDay*dayOffset);
	}
}
