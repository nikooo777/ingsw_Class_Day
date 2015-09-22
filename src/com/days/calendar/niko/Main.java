package com.days.calendar.niko;

import java.util.Calendar;

public class Main
{
	// Usage example
	/*
	 * expected output on the 22nd of September 2015 in the afternoon:
	 * 2018-5-17
	 * Days between today and later: 998
	 *
	 */
	public static void main(String[] args)
	{
		final Day today = new Day(Calendar.getInstance().getTime());
		final Day later = today.dayIn(999);
		System.out.println(later.getYear() + "-" + later.getMonth() + "-" + later.getDay());
		System.out.println("Days between today and later: " + Day.DaysBetween(today, later));
	}
}
