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
	

	public RegisterPageDemoWeb registerUser() {
		open();
		waitFor(Register_Link).$(Register_Link).click();

		return this.switchToPage(RegisterPageDemoWeb.class);
	}

//	public RegisterPageDemoWebFields registerUserFields() {
//
//		waitFor(First_Name_Input).$(First_Name_Input).sendKeys("andratest72");
//		waitFor(Last_Name_Input).$(Last_Name_Input).type("testing72");
//		waitFor(Email_Input).$(Email_Input).typeAndTab("andratest72.testing@gmail.com");
//		waitFor(Password_Input).$(Password_Input).typeAndTab("test172");
//		waitFor(Confirm_Password_Input).$(Confirm_Password_Input).type("test172");
//		waitFor(RegisterBtn_Submit).$(RegisterBtn_Submit).click();
//		return this.switchToPage(RegisterPageDemoWebFields.class);
//
//	}
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
	
//	String[] productItems = { "1.00" };
//
//	public ProductsPageWebShop serenityPickProd() {
//		int i = 0;
////		open();
//		List<WebElement> linkBtn = getDriver().findElements(By.cssSelector("span.price.actual-price"));
//		for (int j = 0; j < linkBtn.size(); j++) {
//			String numeProd = linkBtn.get(j).getText();
//			System.out.println(numeProd);
//			List prodItenL = Arrays.asList(productItems);
//			if (prodItenL.contains(numeProd)) {
//				i++;
//				
//				getDriver().findElements(By.cssSelector("input[value='Add to cart']")).get(j).click();
//				
//			}
////				
//		}
//		return this.switchToPage(ProductsPageWebShop.class);
	}
	
//	public SelectingProducts serenityPickProd() {
//		
//		return this.switchToPage(SelectingProducts.class);
//	}


