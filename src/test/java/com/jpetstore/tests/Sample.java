package com.jpetstore.tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.jpetstore.steps.PetStoresSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;

@RunWith(SerenityRunner.class)
public class Sample {
	@Managed
	WebDriver driver;
	@Steps
	PetStoresSteps shopper;

	@Test
	@Title("Navigating to the sign in page")
	public void navToSignInPg() throws InterruptedException {
		
		shopper.navToSingInPage();
		Thread.sleep(4000);
		
	}
}
