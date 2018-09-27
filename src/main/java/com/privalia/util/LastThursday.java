package com.privalia.util;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class LastThursday {

	public Date getLastThursday(int month, int year) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MMMMM yyyy");
		
		Calendar cal = Calendar.getInstance();
		cal.set(year, month , 1);
		cal.add(Calendar.DAY_OF_MONTH, -(cal.get(Calendar.DAY_OF_WEEK) % 7 + 2));
		return (Date) cal.getTime();
	}
}
