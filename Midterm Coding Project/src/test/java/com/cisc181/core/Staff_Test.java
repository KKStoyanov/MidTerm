package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;


public class Staff_Test {

	@BeforeClass
	public static void setup() throws PersonException {
		ArrayList<Staff> staffs = new ArrayList();
		Calendar cal = Calendar.getInstance();
		cal.set(1965, 5, 13);
		Date d = cal.getTime();
		date = d;
		cal.set(1990, 7, 20);
		Date d2 = cal.getTime();
		date2 = d2;
		cal.set(1917, 2, 18);
		Date d3 = cal.getTime();
		date3 = d3;
		Staff one = new Staff("Tom", "Carter", "James", date, "2140 Marsh Road", "(302)-444-5555", "TJames@udel.edu",
				"2-4", 1, 50000.0, date2, eTitle.MR);
		Staff two = new Staff("Kevin", "Paul", "Phillips", date, "2142 Marsh Road", "(302)-443-5555", "KPhillips@udel.edu",
				"3-5", 2, 55000.0, date2, eTitle.MR);
		Staff three = new Staff("Filicea", "Candy", "Keys", date, "2144 Marsh Road", "(302)-442-5555", "FKeys@udel.edu",
				"12-1", 3, 30000.0, date2, eTitle.MRS);
		Staff four = new Staff("Emily", "Liz", "Sun", date, "2145 Marsh Road", "(302)-441-5555", "ESun@udel.edu",
				"10-12", 4, 53000.0, date2, eTitle.MS);
		Staff five = new Staff("Just", "In", "Time", date, "2148 Marsh Road", "(302)-440-5555", "JTime@udel.edu",
				"11-1", 5, 52000.0, date2, eTitle.MR);
		staffs.add(one);
		staffs.add(two);
		staffs.add(three);
		staffs.add(four);
		staffs.add(five);
		staffs2 = staffs;
	}
	static Date date;
	static Date date2;
	static Date date3;
	static ArrayList<Staff> staffs2;
	
	public double calculateAvgSalary(ArrayList<Staff> s) {
		double avgSalary = 0;
		for (Staff s2 : s) {
			avgSalary += s2.getSalary();
		}
		return avgSalary / 5;
	}

	@Test
	public void testAverage() throws PersonException {
		assertEquals(48000.00, calculateAvgSalary(staffs2), 0.001);
	}
	
	@Test(expected = PersonException.class)
	public void testDOB() throws PersonException{
		Staff one = new Staff("Tom", "Carter", "James", date3, "2140 Marsh Road", "(302)-444-5555", "TJames@udel.edu",
				"2-4", 1, 50000.0, date2, eTitle.MR);
	}
	
	@Test(expected = PersonException.class)
	public void testPhoneNumber() throws PersonException{
		Staff one = new Staff("Tom", "Carter", "James", date, "2140 Marsh Road", "3024445555", "TJames@udel.edu",
				"2-4", 1, 50000.0, date2, eTitle.MR);
	}

}
