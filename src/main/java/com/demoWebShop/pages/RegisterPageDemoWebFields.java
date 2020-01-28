package com.demoWebShop.pages;

public class RegisterPageDemoWebFields extends BasePageWebShop {
	
	private static final String First_Name_Input = "//input[@id='FirstName']";
	private static final String Last_Name_Input = "//input[@id='LastName']";
	private static final String Email_Input = "//input[@id='Email']";
	private static final String Password_Input = "//input[@id='Password']";
	private static final String Confirm_Password_Input = "//input[@id='ConfirmPassword']";
	private static final String RegisterBtn_Submit = "//input[@id='register-button']";
	
	public RegisterPageDemoWeb fillRegisterForm(String FirstName, String LastName, String Email, String Password, String ConfirmPassw) {
		waitForTextToAppear("Your Personal Details");
		waitFor(First_Name_Input).$(First_Name_Input).type(FirstName);
		waitFor(Last_Name_Input).$(Last_Name_Input).type(LastName);
		waitFor(Email_Input).$(Email_Input).type(Email);
		waitFor(Password_Input).$(Password_Input).type(Password);
		waitFor(Confirm_Password_Input).$(Confirm_Password_Input).type(ConfirmPassw);
		return this.switchToPage(RegisterPageDemoWeb.class);
	}

}
