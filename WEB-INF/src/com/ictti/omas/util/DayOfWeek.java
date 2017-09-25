package com.ictti.omas.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DayOfWeek {
	public int getDayOfWeek(Date startDate) {
		Calendar c = Calendar.getInstance();
		c.setTime(startDate);
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);

		return dayOfWeek;

	}

	/*
	 * public int getScheduleDay(String startDate) { String dt = startDate;
	 * SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); Calendar c =
	 * Calendar.getInstance(); c.setTime(sdf.parse(dt)); c.add(Calendar.DATE,
	 * 1); dt = sdf.format(c.getTime());
	 * 
	 * }
	 */

	public String getScheduleDay(Date date,String multiboxvalue, int dayofweek) throws ParseException {

		int value = Integer.parseInt(multiboxvalue);
		int dow = dayofweek;

		int result = value - dow;
		if (result < 0) 
			result = result + 7;
			
		Calendar firstDate=Calendar.getInstance();
	    firstDate.setTime(date);
	    firstDate.add(Calendar.DATE,result);
	    Date scheDate=firstDate.getTime();	  
	     
	
	    SimpleDateFormat myformat = new SimpleDateFormat("yyyy-MM-dd");
		String date1 = myformat.format(scheDate);	    
	    
	    //System.out.println("scheDate======"+date1);
		return date1;  
	}
	
	public String getAllScheduleDays(String x,int c) throws ParseException{
		SimpleDateFormat formatter =  new SimpleDateFormat("yyyy-MM-dd");
	    //Date aDate = formatter.parse("25 02 2016");
	    Date bDate = formatter.parse(x);
	    Calendar firstDate=Calendar.getInstance();
	    firstDate.setTime(bDate);
	    firstDate.add(Calendar.DATE, c);
	    Date result=firstDate.getTime();
	    
	    SimpleDateFormat myformat = new SimpleDateFormat("yyyy-MM-dd");
		String date1 = myformat.format(result);	    
	    
	   // System.out.println("in other scheDate======"+date1);
		return date1;
	}

}
