package com.days.calendar.niko;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;

public class Day
{

	private final GregorianCalendar cal;

	/*
	 * ------------------------------------------------------------------
	 * Constructors
	 * ------------------------------------------------------------------
	 */
	/**
	 * @param day
	 * @param month
	 * @param year
	 */
	Day(int day, int month, int year)
	{
		this.cal = new GregorianCalendar(year, month, day);
	}

	/**
	 * @param day
	 */
	Day(Day day)
	{
		this.cal = new GregorianCalendar(day.getYear(), day.getMonth(), day.getDay(), day.getHour(), day.getMin(), day.getSec());
	}

	/**
	 *
	 */
	Day()
	{
		this.cal = new GregorianCalendar();
	}

	/**
	 * @param d
	 */
	Day(Date d)
	{
		this.cal = new GregorianCalendar();
		this.cal.setTime(d);
	}

	/*
	 * ------------------------------------------------------------------
	 * Static methods
	 * ------------------------------------------------------------------
	 */
	/**
	 * @param from
	 * @param to
	 * @return number of days
	 */
	static long DaysBetween(Day from, Day to)
	{
		return TimeUnit.DAYS.convert(to.getTimeInMillis() - from.getTimeInMillis(), TimeUnit.MILLISECONDS);
	}

	/*
	 * ------------------------------------------------------------------
	 * Public methods
	 * ------------------------------------------------------------------
	 */
	/**
	 * @param days
	 * @return day in given days
	 */
	public Day dayIn(int days)
	{
		return new Day(getDay() + days, getMonth(), getYear());
	}

	/**
	 * @return remaining days
	 */
	public int daysToYearEve()
	{
		return (this.cal.isLeapYear(getYear()) ? 366 : 365) - this.cal.get(Calendar.DAY_OF_YEAR);
	}

	/**
	 * @param days
	 *            to add
	 */
	public void addDays(int days)
	{
		this.cal.add(Calendar.DAY_OF_YEAR, days);
	}

	/**
	 * @return year
	 */
	public int getYear()
	{
		return this.cal.get(Calendar.YEAR);
	}

	/**
	 * @return day
	 */
	public int getDay()
	{
		return this.cal.get(Calendar.DAY_OF_MONTH);
	}

	/**
	 * @return month
	 */
	public int getMonth()
	{
		return this.cal.get(Calendar.MONTH);
	}

	/**
	 * @return hour
	 */
	public int getHour()
	{
		return this.cal.get(Calendar.HOUR_OF_DAY);
	}

	/**
	 * @return minute
	 */
	public int getMin()
	{
		return this.cal.get(Calendar.MINUTE);
	}

	/**
	 * @return second
	 */
	public int getSec()
	{
		return this.cal.get(Calendar.SECOND);
	}

	/*
	 * ------------------------------------------------------------------
	 * Private methods
	 * ------------------------------------------------------------------
	 */
	/**
	 * @return time in milliseconds
	 */
	private long getTimeInMillis()
	{
		return this.cal.getTimeInMillis();
	}

	@Override
	public String toString()
	{
		return this.cal.toString();
	}
}
