package com.acme.utils;

import java.util.ArrayList;

public class MyDate {
	public int day;
	public int year;
	public int month;
	static ArrayList<Integer> leapYears = new ArrayList<Integer>();

	public MyDate() {

	}

	{
		day = 1;
		month = 1;
		year = 2020;
	}

	public MyDate(int m, int d, int y) {
		setDate(m, d, y);
	}

	public String toString() {
		return "" + month + "/" + day + "/" + year;
	}

	public void setDate(int m, int d, int y) {
		day = d;
		year = y;
		month = m;
	}
	
	public static void leapYears() {
		for (int i = 1752; i <= 2020; i = i + 4) {
			if(i % 100 != 0 || i % 400 == 0) {
				leapYears.add(i);
				System.out.println("The year " + i + " is a leap year.");
			}
		}
	}

}
