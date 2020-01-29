package com.DemoWebShop.Cucumber.steps.Serenity;

import com.demoWebShop.pages.BasePageWebShop;
import com.demoWebShop.pages.ProductsPageWebShop;
import com.demoWebShop.pages.RegisterPageDemoWeb;
import com.demoWebShop.pages.RegisterPageDemoWebFields;
import com.demoWebShop.pages.SelectingProducts;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class DemoWebShopSteps extends ScenarioSteps {
	BasePageWebShop baseWebpg;
	SelectingProducts selectProd;
	RegisterPageDemoWebFields registerFields;

//Registering new user
	@Step("Register new user")
	public RegisterPageDemoWeb registerUser() {
		return baseWebpg.registerUser();
	}

	@Step("Filling in Registration Form with FirstName: {0}, LastName: {1}, Email: {3}, Password: {4}, ConfirmPassw: {5}")
	public RegisterPageDemoWebFields fillRegisterForm(String FirstName, String LastName, String Email, String Password,
			String ConfirmPassw) {
		return registerFields.fillRegisterForm(FirstName, LastName, Email, Password, ConfirmPassw);
	}
	@Step("Click Register Btn after filling in form")
	public RegisterPageDemoWeb registerClickBtn() {
		return baseWebpg.registerClickBtn();
	}
	

	@Step("Continue to HomePage")
	public RegisterPageDemoWeb clickContinue() {
		return baseWebpg.clickContinue();
	}

	@Step("Navigate to Apparel and Shoes Category")
	public ProductsPageWebShop navToApparelPg() {
		return baseWebpg.navToApparelPg();
	}

//Selecting the products
	@Step("select produse")
	public ProductsPageWebShop serenityPickProd() {
		return selectProd.serenityPickProd();
	}

}
