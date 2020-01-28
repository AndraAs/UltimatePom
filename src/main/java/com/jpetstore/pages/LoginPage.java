package com.jpetstore.pages;

public class LoginPage extends BasePage {

	private static final String Username_Input_Field = "//input[@name='username']";
	private static final String Password_Input_Field = "//input[@name='password']";
	private static final String LogIn_Btn = "//input[@value='Login']";
	private static final String Register_Link = "//*[@id='Catalog']//a[contains(text()),'Register Now!')]";
	private static final String Invalid_Login_Label = "//*[@id='Content']/ul/li";

	// Method used to Log in to the store
	public DashBoardPage doLogIn(String userName, String Password) {
		waitForTextToAppear("Please enter your username and password.");
		waitForTextToAppear("Need a user name and password? Register Now!");
		waitFor(Username_Input_Field).$(Username_Input_Field).type(userName);
		waitFor(Password_Input_Field).$(Password_Input_Field).type(Password);
		waitFor(LogIn_Btn).$(LogIn_Btn).click();
		return this.switchToPage(DashBoardPage.class);
	}
//Navigate to the Registration Page
	public AccountsPage navigateToRegistrationPage() {
		waitForTextToAppear("Please enter your username and password.");
		waitForTextToAppear("Need a user name and password? Register Now!");
		waitFor(Register_Link).$(Register_Link).click();
		return this.switchToPage(AccountsPage.class);
	}
	//method to return invalid message
	public String getMessageInvalidLogIn() {
		return waitFor(Invalid_Login_Label).$(Invalid_Login_Label).getText();
	}
}
