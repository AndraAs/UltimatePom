package com.DemoWebShop.Cucumber.steps.Serenity;

import com.demoWebShop.pages.BasePageWebShop;
import com.demoWebShop.pages.CheckOutPage;
import com.demoWebShop.pages.ProductsPageWebShop;
import com.demoWebShop.pages.RegisterPageDemoWeb;
import com.demoWebShop.pages.RegisterPageDemoWebFields;
import com.demoWebShop.pages.SelectingProducts;
import com.demoWebShop.pages.ShoppingCartPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class DemoWebShopSteps extends ScenarioSteps {
	BasePageWebShop baseWebpg;
	SelectingProducts selectProd;
	RegisterPageDemoWebFields registerFields;
	ShoppingCartPage shoppingCartPage;
	CheckOutPage checkOutPage;

//Registering new user
	@Step("Register new user")
	public RegisterPageDemoWeb registerUser() {

		return baseWebpg.registerUser();
	}

	@Step("Filling in Registration Form with FirstName: {0}, LastName: {1}, Email: {2}, Password: {3}, ConfirmPassw: {4}")
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

	@Step("select produse")
	public ProductsPageWebShop serenityPickProd() {
		return selectProd.serenityPickProd();
	}

	@Step("Navigate to Shopping Cart Page")
	public ProductsPageWebShop clickOnShoppingCart() {
		return baseWebpg.clickOnShoppingCart();
	}

	@Step("Select Country on Shopping Cart Page")
	public ShoppingCartPage selectCountryDropDown(String country) {
		return shoppingCartPage.selectCountryDropDown(country);
	}

	@Step("Agree to the terms of service")
	public ShoppingCartPage agreeTermsOfService(boolean agree) {
		return shoppingCartPage.agreeTermsOfService(agree);
	}

	@Step("Click on CheckOut Button")
	public ShoppingCartPage clickOnCheckOutBtn() {
		return shoppingCartPage.clickOnCheckOutBtn();
	}

    @Step("Fill in Billing Address with FirstNameBill: {0}, LastNameBill: {1}, EmailBill: {3}, CountryBill: {4}, CityBill: {5}, Adress1Bill: {6}, ZipBill: {7}, PhoneNumBill: {8}")
    public CheckOutPage fillBillingAddress(String FirstNameBill,
		                               String LastNameBill,
		                               String EmailBill,
		                               String CountryBill,
		                               String CityBill, 
		                               String Adress1Bill, 
		                               String ZipBill, 
		                               String PhoneNumBill) {
	    return checkOutPage.fillBillingAddress(FirstNameBill, LastNameBill, EmailBill, CountryBill, CityBill, Adress1Bill, ZipBill, PhoneNumBill);
}
    @Step("Fill Shipping Adress")
    public CheckOutPage fillShippingAddress() {
    	return checkOutPage.fillShippingAddress();
    }
    @Step("Fill Shipping Method")
    public CheckOutPage fillShippingMethod() {
    	return checkOutPage.fillShippingMethod();
    }
    @Step("Fill payment method")
    public CheckOutPage fillPaymentMethod() {
    	return checkOutPage.fillPaymentMethod();
    }
    @Step("Fill Payment Information")
    public CheckOutPage fillPaymentInfo() {
    	return checkOutPage.fillPaymentInfo();
    }
    @Step("Confirm Order")
    public CheckOutPage confirmOrder() {
    	return checkOutPage.confirmOrder();
    	
    }
    @Step("Confirm Order Succesfull")
    public ProductsPageWebShop orderSuccesContinue() {
    	return checkOutPage.orderSuccesContinue();
    	
    }
}

