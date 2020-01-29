package com.demoWebShop.pages;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

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
	private static final String ShoppinCart_Link ="//a[@href='/cart']";
	

	public RegisterPageDemoWeb registerUser() {
		open();
		waitFor(Register_Link).$(Register_Link).click();

		return this.switchToPage(RegisterPageDemoWeb.class);
	}


	public RegisterPageDemoWeb registerClickBtn() {
		waitFor(RegisterBtn_Submit).$(RegisterBtn_Submit).click();
		return this.switchToPage(RegisterPageDemoWeb.class);
		
	}

	public RegisterPageDemoWeb clickContinue() {
		waitFor(Button_Continue).$(Button_Continue).click();
		return this.switchToPage(RegisterPageDemoWeb.class);
	}

	public ProductsPageWebShop navToApparelPg() {
		waitFor(ApparelShoes_Link).$(ApparelShoes_Link).click();

		return this.switchToPage(ProductsPageWebShop.class);
	}
	
	public ProductsPageWebShop clickOnShoppingCart() {
		waitFor(ShoppinCart_Link).$(ShoppinCart_Link).click();
		return this.switchToPage(ProductsPageWebShop.class);
	}

	}
	



