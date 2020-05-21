package com.cognixia.jump.salesforce.dates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		getDate();
		dateFormat();
		stringToDate();
		getLocalDateTime();
		

	}
	
	public static void getDate() {
		// Create today's date
		
		Date today = new Date();
		
		System.out.println(today);
	}
	
	public static void dateFormat() {
		Date today = new Date();
		
		SimpleDateFormat sdf1, sdf2;
		
		// add the desired date fomat into the simpleDateFormat constructor
		sdf1 = new SimpleDateFormat("MM/dd/yy");
		sdf2 = new SimpleDateFormat("MMMM dd yyyy");
		
		// do the formatting
		String formattedDate1 = sdf1.format(today);
		String formattedDate2 = sdf2.format(today);
		
		System.out.println(formattedDate1);
		System.out.println(formattedDate2);
	}
	
	public static void stringToDate() throws ParseException {
		
		String dateStr = "15/10/2020";
		
		Date date = new SimpleDateFormat("dd/MM/yyyy").parse(dateStr);
		
		System.out.println("date = " + date);
		
	}
	
	public static void getLocalDateTime() {
		
		LocalDate july3 = LocalDate.of(2020, 7, 3);
		System.out.println(july3);
		
		LocalDate ld = LocalDate.parse("2020-07-03");
		
		System.out.println(ld);
		
		LocalDate july6 = july3.plusDays(3);
		
		System.out.println(july6);
		
		System.out.println("July 6, 2020 will be on a " + july6.getDayOfWeek());
		
		LocalTime now = LocalTime.now();
		LocalTime eightFortyFive = LocalTime.of(8, 45);
		LocalTime stringParse = LocalTime.parse("08:45");
		System.out.println(now);
		System.out.println(eightFortyFive);
		System.out.println(stringParse);
		LocalDateTime ldt = LocalDateTime.of(july3, eightFortyFive);
		
		ZoneId id = ZoneId.of("Europe/Paris");
	
		System.out.println(ldt);
		
		ZonedDateTime zdt = ZonedDateTime.of(ldt, id);
		
		System.out.println(zdt);
		
		
	}
	

}
