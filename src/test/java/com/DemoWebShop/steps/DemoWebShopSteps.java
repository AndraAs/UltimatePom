package com.DemoWebShop.steps;

import com.demoWebShop.pages.BasePageWebShop;
import com.demoWebShop.pages.ProductsPageWebShop;
import com.demoWebShop.pages.RegisterPageDemoWeb;
import com.demoWebShop.pages.RegisterPageDemoWebFields;
import com.demoWebShop.pages.SelectingProducts;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class DemoWebShopSteps extends ScenarioSteps{
BasePageWebShop baseWebpg;
//SelectingProducts selectProd;



@Step("Register new user")
public RegisterPageDemoWeb registerUser() {
	return baseWebpg.registerUser();
}
@Step("register user form")
public RegisterPageDemoWebFields registerUserFields(){
	return baseWebpg.registerUserFields();
}
@Step("Continue to HomePage")
public RegisterPageDemoWeb clickContinue() {
	return baseWebpg.clickContinue();
}
@Step("Navigate to Apparel and Shoes Category")
public ProductsPageWebShop navToApparelPg() {
	return baseWebpg.navToApparelPg();
}
//@Step("select produse")

//public ProductsPageWebShop serenityPickProd() {
	
//	return selectProd.
}

}
