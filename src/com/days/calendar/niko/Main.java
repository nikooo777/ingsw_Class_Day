package com.days.calendar.niko;

import java.util.Calendar;

public class Main
{

	public static void main(String[] args)
	{
		final Day today = new Day(Calendar.getInstance().getTime());
		final Day later = today.dayIn(999);
		System.out.println(later.getYear() + "-" + later.getMonth() + "-" + later.getDay());
		System.out.println("Days between today and later: " + Day.DaysBetween(today, later));

	}
}
