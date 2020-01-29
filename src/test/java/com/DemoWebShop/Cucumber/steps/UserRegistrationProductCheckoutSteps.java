package com.DemoWebShop.Cucumber.steps;

import com.DemoWebShop.Cucumber.steps.Serenity.DemoWebShopSteps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import net.thucydides.core.annotations.Steps;



public class UserRegistrationProductCheckoutSteps {
	@Steps
	DemoWebShopSteps shopper;
	@Given ("User navigates to registration page")
	public void User_navigates_To_Registration_Page(){
		shopper.registerUser();
	}
	
//	@And ("User fills in Registration Form")
//	public void User_fills_in_Registration_Form() {
//		shopper.fillRegisterForm(FirstName, LastName, Email, Password, ConfirmPassw);
//	}

}
