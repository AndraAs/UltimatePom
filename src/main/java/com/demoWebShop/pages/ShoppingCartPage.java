package com.demoWebShop.pages;

import net.thucydides.core.webelements.Checkbox;

public class ShoppingCartPage extends BasePageWebShop {

	private static final String SelectCountry_DropDown = "//select[@id='CountryId']";
	private static final String AgreeTerms_RadioBtn = "//input[@id='termsofservice']";
	private static final String CheckOutBtn_Link = "//button[@id='checkout']";



	public ShoppingCartPage selectCountryDropDown(String country) {
		waitForTextToAppear("Estimate shipping");
		$(SelectCountry_DropDown).selectByVisibleText(country);
		return this;
	}

	public ShoppingCartPage agreeTermsOfService(boolean agree) {
		waitForTextToAppear("I agree with the terms of service and I adhere to them unconditionally (read)");

		Checkbox agreeCheckBox = new Checkbox( $(AgreeTerms_RadioBtn));
		agreeCheckBox.setChecked(agree);
		return this;
	}

	public ShoppingCartPage clickOnCheckOutBtn() {
		waitForTextToAppear("Sub-Total:");
		waitFor(CheckOutBtn_Link).$(CheckOutBtn_Link).click();
		return this;
	}
}
