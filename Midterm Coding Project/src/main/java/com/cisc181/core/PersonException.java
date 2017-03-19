package com.cisc181.core;


public class PersonException extends Exception{
	
	private Person person;

	public PersonException(Person person) {
		this.person = person;
		System.out.println("Either the date of birth was over 100 years ago or the phone number is not in the correct format.");
	}


}
