package com.jpetstore.pages;

import org.openqa.selenium.By;

import com.jpetstore.utils.PetCategories;

import net.serenitybdd.core.pages.PageObject;

public class BasePage extends PageObject{
	private static final String Enter_the_store_link= "//a[@href='actions/Catalog.action']";
	private static final String Sign_in_link="//*[@id='MenuContent']/a[contains(text(),'Sign In')]";
	private static final String Logo_link="//a[@href='/jpetstore/actions/Catalog.action']";
	private static final String Sign_out_link="//*[@id='MenuContent']/a[contains(text(),'Sign Out')]";
	private static final String My_Account_link="//*[@id='MenuContent']/a[contains(text(),'My Account')]";
	private static final String Help_link="//*[id='MenuContent']/a[contains(text(),'?')]";
	private static final String Shopping_Cart_link= "div[id='MenuContent'] a[href$='?viewCart=']";
	private static final String Search_Input_link= "//input[@name='keyword']";
	private static final String Search_Button= "//input[@name='searchProducts']";
	//Product quick links
	private static final String FISH_link = "div[id='QuickLinks'] a[href$='FISH']";
	private static final String DOGS_link = "div[id='QuickLinks'] a[href$='DOGS']";
	private static final String REPTILES_link = "div[id='QuickLinks'] a[href$='REPTILES']";
	private static final String CATS_link = "div[id='QuickLinks'] a[href$='CATS']";
	private static final String BIRDS_link = "div[id='QuickLinks'] a[href$='BIRDS']";
	private static final String BANNER_IMG= "//*[@id='Banner']/img";
	
	
	
	public LoginPage navToSingInPage() {
		open();
		 waitForTextToAppear("Welcome to JPetStore 6");
		waitFor(Enter_the_store_link).$(Enter_the_store_link).click();
		waitFor(Sign_in_link).$(Sign_in_link).click();
		return this.switchToPage(LoginPage.class);
		
	}
	
	public LoginPage clickOnLogin() {
		waitFor(Sign_in_link).find(By.xpath(Sign_in_link)).click();
		return this.switchToPage(LoginPage.class);
		
	}
//Navigate to dashboard
	public DashBoardPage navToDashBoard() {
	waitFor(Logo_link).$(Logo_link).click();
		return this.switchToPage(DashBoardPage.class);
				
	}
	//sign out of app
	public DashBoardPage SignOut() {
		
		waitFor(Sign_out_link).$(Sign_out_link).click();
		return this.switchToPage(DashBoardPage.class);
	}
	
	public AccountsPage navToAccPage() {
		waitFor(My_Account_link).$(My_Account_link).click();
		return this.switchToPage(AccountsPage.class);
	}
	//search for product method
	
	public ProductsPage searchForProduct(String searchValue) {
		waitFor(Search_Input_link).$(Search_Input_link).type(searchValue);
		waitFor(Search_Button).$(Search_Button).click();
		
		
		return this.switchToPage(ProductsPage.class);
	}
	//navigate to help page
	public HelpPage navigateToHelpPage() {
		waitFor(Help_link).$(Help_link).click();
		return this.switchToPage(HelpPage.class);
	}
	//navigate to Shopping cart Dashboard
	public ProductsPage navigateToShoppingCart() {
		waitFor(Shopping_Cart_link).$(Shopping_Cart_link).click();
		return this.switchToPage(ProductsPage.class);
	}
	//method to select product category
	public ProductsPage navigateToProductCateg(PetCategories productCategory) {
		switch(productCategory) {
		case FISH:
			waitFor(FISH_link).$(FISH_link).click(); 
		return this.switchToPage(ProductsPage.class);
		case DOGS:
			waitFor(DOGS_link).$(DOGS_link).click(); 
			return this.switchToPage(ProductsPage.class);
		case REPTILES:
			waitFor(REPTILES_link).$(REPTILES_link).click(); 
			return this.switchToPage(ProductsPage.class);
		case CATS:
			waitFor(CATS_link).$(CATS_link).click(); 
			return this.switchToPage(ProductsPage.class);
		case BIRDS:
			waitFor(BIRDS_link).$(BIRDS_link).click(); 
			return this.switchToPage(ProductsPage.class);
		
		
		default:
			break;
		
		}
		return null;
		
	}
	
}
