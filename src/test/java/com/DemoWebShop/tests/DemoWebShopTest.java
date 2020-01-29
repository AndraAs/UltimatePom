//package com.DemoWebShop.tests;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.openqa.selenium.WebDriver;
//
//import com.DemoWebShop.steps.DemoWebShopSteps;
//import com.github.javafaker.Faker;
//
//import net.serenitybdd.junit.runners.SerenityRunner;
//import net.thucydides.core.annotations.Managed;
//import net.thucydides.core.annotations.Steps;
//import net.thucydides.core.annotations.Title;
//
//@RunWith(SerenityRunner.class)
//public class DemoWebShopTest {
//	@Managed
//	WebDriver driver;
//	@Steps
//	DemoWebShopSteps webShopSteps;
//
//	@Test
//	@Title("Shopping Test")
//	public void navToRegisterPg() throws InterruptedException {
//
//		Faker faker = new Faker();
//		String FirstName = faker.name().firstName();
//		String LastName = faker.name().lastName();
//		String Email = faker.internet().emailAddress();
//		String Password = faker.internet().password();
//		String ConfirmPassw = Password;
//		
//		webShopSteps.registerUser();
//		webShopSteps.fillRegisterForm(FirstName, LastName , Email , Password, ConfirmPassw);
//		webShopSteps.registerClickBtn();
//		webShopSteps.clickContinue();
//		webShopSteps.navToApparelPg();
//		Thread.sleep(4000);
//		webShopSteps.serenityPickProd();
//
//	}
//
//}
