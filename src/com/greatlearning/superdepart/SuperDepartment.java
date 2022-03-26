package com.greatlearning.superdepart;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class SuperDepartment {

	public String departmentName() {
		return "Super Department";
	}
	public String getTodaysWork() {
		return "No work as of now";
	}
	public String getWorkDeadline() {
		return "Nil";
	}
	public String isTodayHoliday() {
		Calendar calendar = Calendar.getInstance();
		Date date = calendar.getTime();
		String day= new SimpleDateFormat("EEEE", Locale.ENGLISH).format(date.getTime());
		//System.out.println(new SimpleDateFormat("EE", Locale.ENGLISH).format(date.getTime()));
		//System.out.println("*"+new SimpleDateFormat("EEEE", Locale.ENGLISH).format(date.getTime())+"*");
		if(day.equalsIgnoreCase("Saturday")||day.equalsIgnoreCase("Sunday")) {
			return "Today is a Holiday";
		}else {
			return "Today is not a Holiday";
		}

	}
}
