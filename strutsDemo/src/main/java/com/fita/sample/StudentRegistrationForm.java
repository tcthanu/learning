package com.fita.sample;

import org.apache.struts.action.ActionForm;

public class StudentRegistrationForm extends ActionForm {
	String firstName;
	String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

}
