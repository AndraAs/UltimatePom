package com.DemoWebShop.tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.DemoWebShop.steps.DemoWebShopSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;

@RunWith(SerenityRunner.class)
public class DemoWebShopTest {
	@Managed
	WebDriver driver;
	@Steps
	DemoWebShopSteps webShopSteps;

	@Test
	@Title("Shopping Test")
	public void navToRegisterPg() throws InterruptedException {
		webShopSteps.registerUser();
		webShopSteps.fillRegisterForm("andraAs", "stalus", "AsT@gmail.com", "testat1234", "testat1234");
		webShopSteps.registerClickBtn();
		webShopSteps.clickContinue();
		webShopSteps.navToApparelPg();
		Thread.sleep(4000);
		webShopSteps.serenityPickProd();
//		webShopSteps.selProd();
		


	}



}
