package com.cisc181.core;

import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * comment
 */
public abstract class Person implements java.io.Serializable {

	private Date DOB;
	private String FirstName;
	private String MiddleName;
	private String LastName;
	private String address;
	private String phone_number;
	private String email_address;

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String FirstName) {
		this.FirstName = FirstName;
	}

	public String getMiddleName() {
		return MiddleName;
	}

	public void setMiddleName(String MiddleName) {
		this.MiddleName = MiddleName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String LastName) {
		this.LastName = LastName;
	}

	public Date getDOB() {
		return DOB;
	}

	public void setDOB(Date DOB) throws PersonException {
		Date date = new Date();
		Calendar cal = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		cal.setTime(date);
		cal2.setTime(DOB);

		int yearOfBirth = cal2.get(Calendar.YEAR);
		int currentYear = cal.get(Calendar.YEAR);
		int yearDifference = currentYear - yearOfBirth;

		int monthOfBirth = cal2.get(Calendar.MONTH);
		int currentMonth = cal.get(Calendar.MONTH);
		int monthDifference = currentMonth - monthOfBirth;

		int dayOfBirth = cal2.get(Calendar.DATE);
		int currentDay = cal.get(Calendar.DATE);
		int dayDifference = currentDay - dayOfBirth;

		if ((yearDifference > 100) || ((yearDifference == 100) && (monthDifference >= 1))
				|| ((yearDifference == 100) && (monthDifference == 0) && (dayDifference >= 1))) {
			throw new PersonException(this);
		} else
			this.DOB = DOB;

	}

	public void setAddress(String newAddress) {
		address = newAddress;
	}

	public String getAddress() {
		return address;
	}

	public void setPhone(String newPhone_number) throws PersonException {
		Pattern pattern = Pattern.compile("[(]*(\\d{3})[)]*-(\\d{3})-(\\d{4})");
		Matcher matcher = pattern.matcher(newPhone_number);

		if (matcher.matches()) {
			phone_number = newPhone_number;
		} else
			throw new PersonException(this);
	}

	public String getPhone() {
		return phone_number;
	}

	public void setEmail(String newEmail) {
		email_address = newEmail;
	}

	public String getEmail() {
		return email_address;
	}

	/*
	 * Constructors No Arg Constructor
	 */
	public Person() {

	}

	/*
	 * Constructors Constructor with arguments
	 */

	public Person(String FirstName, String MiddleName, String LastName, Date DOB, String Address, String Phone_number,
			String Email) throws PersonException {
		this.FirstName = FirstName;
		this.MiddleName = MiddleName;
		this.LastName = LastName;
		this.setDOB(DOB);
		this.address = Address;
		this.setPhone(Phone_number);
		this.email_address = Email;

	}

	public void PrintName() {
		System.out.println(this.FirstName + ' ' + this.MiddleName + ' ' + this.LastName);
	}

	public void PrintDOB() {
		System.out.println(this.DOB);
	}

	public int PrintAge() {
		Calendar today = Calendar.getInstance();
		Calendar birthDate = Calendar.getInstance();

		int age = 0;
		birthDate.setTime(this.DOB);
		if (birthDate.after(today)) {
			throw new IllegalArgumentException("Can't be born in the future");
		}
		age = today.get(Calendar.YEAR) - birthDate.get(Calendar.YEAR);

		// If birth date is greater than todays date (after 2 days adjustment of
		// leap year) then decrement age one year
		if ((birthDate.get(Calendar.DAY_OF_YEAR) - today.get(Calendar.DAY_OF_YEAR) > 3)
				|| (birthDate.get(Calendar.MONTH) > today.get(Calendar.MONTH))) {
			age--;

			// If birth date and todays date are of same month and birth day of
			// month is greater than todays day of month then decrement age
		} else if ((birthDate.get(Calendar.MONTH) == today.get(Calendar.MONTH))
				&& (birthDate.get(Calendar.DAY_OF_MONTH) > today.get(Calendar.DAY_OF_MONTH))) {
			age--;
		}

		System.out.println("age is " + age);

		return age;

	}
}