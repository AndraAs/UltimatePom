package Serenity.Cucumber.WebElements.EditBox;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
@DefaultUrl("/login")
public class EditBoxPage extends PageObject{
	@FindBy(id="username")
	private WebElementFacade username;
	
	
	@FindBy(id="password")
	private WebElementFacade password;
	
	
	public void editBoxTest() {
		open();
		username.sendKeys("tomsmith");
		password.sendKeys("SuperSecretPassword!");
		
		username.clear();
		password.clear();
	}
	public void serenityTypeEditBoxTest() {
		open();
		username.sendKeys("asrbvfdb");
		username.type("andra");
		
	}
	public void serenityTypeAndTab() {
		open();
		
		username.typeAndTab("andra");
		
	}
	public void serenityTypeAndEnter() {
		open();
		username.typeAndTab("tomsmith");
		password.typeAndEnter("SuperSecretPassword!");
		
	}

}
