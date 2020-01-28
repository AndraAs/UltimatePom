package com.jpetstore.steps;

import com.jpetstore.pages.AccountsPage;
import com.jpetstore.pages.BasePage;
import com.jpetstore.pages.DashBoardPage;
import com.jpetstore.pages.HelpPage;
import com.jpetstore.pages.LoginPage;
import com.jpetstore.pages.ProductsPage;
import com.jpetstore.utils.PetCategories;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class PetStoresSteps extends ScenarioSteps {
	
	BasePage basepg;
	LoginPage logpg;
	@Step("Signing out from the store")
	public DashBoardPage SignOut() {
		return basepg.SignOut();
	}
	@Step("Navigate to sign in")
	public LoginPage navToSingInPage()  {
		return basepg.navToSingInPage();
	}
	@Step("Navigate to Login Page")
	public LoginPage clickOnLogin() {
		return basepg.clickOnLogin();
	}
	@Step("Navigate to Products Page by clicking on : {0} link on header")
	public ProductsPage navigateToProductCateg(PetCategories productCategory) { 
		return basepg.navigateToProductCateg(productCategory);
	}
	@Step("Navigate to Products Page by clicking on shopping cart")
	public ProductsPage navigateToShoppingCart() { 
		return basepg.navigateToShoppingCart();
	}
	@Step("Navigate to Help page")
	public HelpPage navigateToHelpPage()  { 
		return basepg.navigateToHelpPage();
	}
	@Step("Click on Company logo and navigate to th Dashboard")
	public DashBoardPage navToDashBoard(){ 
		return basepg.navToDashBoard();
	}
	@Step("Navigate to Acoounts page")
	public AccountsPage navToAccPage() { 
		return basepg.navToAccPage();
	}
	@Step("Searching for product: {0}")
	public ProductsPage searchForProduct(String searchValue) { 
		return basepg.searchForProduct(searchValue);
	}

	
	
	@Step("Invalid LogIn Message")
	public String getMessageInvalidLogIn() {
		return logpg.getMessageInvalidLogIn();
		 
	}
}
