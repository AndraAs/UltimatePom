package com.DemoWebShop.Cucumber.steps;

import com.DemoWebShop.Cucumber.steps.Serenity.DemoWebShopSteps;
import com.github.javafaker.Faker;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;



public class UserRegistrationProductCheckoutSteps {
	@Steps
	DemoWebShopSteps shopper;
	@Given ("User navigates to registration page")
	public void User_navigates_To_Registration_Page(){
		shopper.registerUser();
	}
	
	@And ("User fills in Registration Form")
	public void User_fills_in_Registration_Form() {
		Faker faker = new Faker();
		String FirstName = faker.name().firstName();
		String LastName = faker.name().lastName();
		String Email = faker.internet().emailAddress();
		String Password = faker.internet().password();
		String ConfirmPassw = Password;
		
		
		shopper.fillRegisterForm(FirstName, LastName, Email, Password, ConfirmPassw);
	}
	
	@And ("User clicks on Register button to complete registration")
	public void User_clicks_on_Register_button_to_complete_registration() {
		shopper.registerClickBtn();
	}
	@Then ("User clicks on Continue button to navigate to Home Page")
	public void User_clicks_on_Continue_button_to_navigate_to_Home_Page() {
		shopper.clickContinue();
	}
	@When ("User clicks on Apparel and Shoes Link")
	public void User_clicks_on_Apparel_and_Shoes_Link() {
		shopper.navToApparelPg();
	}
	
	@Then ("User is able to select products from Apparel and Shoes Category")
	public void User_is_able_to_select_products_from_Apparel_and_Shoes_Category() {
		shopper.serenityPickProd();
	}
	

}
