//https://www.hackerrank.com/challenges/java-date-and-time


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;



public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int month = in.nextInt();
        int day = in.nextInt();
        int year = in.nextInt();
        
        Calendar calendar = Calendar.getInstance();// creating calender object
		calendar.set(year, (month-1), day);//method sets the values for the calendar fields YEAR, MONTH, and DAY_OF_MONTH.
											//month is month-1 because calender starting index is 0 i.e jan=0;

		System.out.println(new DateFormatSymbols().getWeekdays()[calendar.get(Calendar.DAY_OF_WEEK)].toUpperCase());
    }
}