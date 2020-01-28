package com.demoWebShop.pages;

import net.serenitybdd.core.pages.PageObject;

public class BasePageWebShop extends PageObject {
	private static final String Register_Link = "//a[@href='/register']";
	private static final String First_Name_Input = "//input[@id='FirstName']";
	private static final String Last_Name_Input = "//input[@id='LastName']";
	private static final String Email_Input = "//input[@id='Email']";
	private static final String Password_Input = "//input[@id='Password']";
	private static final String Confirm_Password_Input = "//input[@id='ConfirmPassword']";
	private static final String RegisterBtn_Submit = "//input[@id='register-button']";
	private static final String Button_Continue = "//input[@value='Continue']";
	private static final String ApparelShoes_Link = "//a[@href='/apparel-shoes']";
	

	public RegisterPageDemoWeb registerUser() {
		open();
		waitFor(Register_Link).$(Register_Link).click();

		return this.switchToPage(RegisterPageDemoWeb.class);
	}

	public RegisterPageDemoWebFields registerUserFields() {

		waitFor(First_Name_Input).$(First_Name_Input).sendKeys("andratest75");
		waitFor(Last_Name_Input).$(Last_Name_Input).type("testing75");
		waitFor(Email_Input).$(Email_Input).typeAndTab("andratest75.testing@gmail.com");
		waitFor(Password_Input).$(Password_Input).typeAndTab("test1234456567");
		waitFor(Confirm_Password_Input).$(Confirm_Password_Input).type("test1234456567");
		waitFor(RegisterBtn_Submit).$(RegisterBtn_Submit).click();
		return this.switchToPage(RegisterPageDemoWebFields.class);

	}

	public RegisterPageDemoWeb clickContinue() {
		waitFor(Button_Continue).$(Button_Continue).click();
		return this.switchToPage(RegisterPageDemoWeb.class);
	}

	public ProductsPageWebShop navToApparelPg() {
		waitFor(ApparelShoes_Link).$(ApparelShoes_Link);

		return this.switchToPage(ProductsPageWebShop.class);
	}
	
//	public SelectingProducts serenityPickProd() {
//		
//		return this.switchToPage(SelectingProducts.class);
//	}

}
