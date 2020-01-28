package Serenity.Cucumber;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class RegisterPage extends PageObject {
	@FindBy(xpath="//a[@href='/register']")
	private WebElementFacade regBtn;
	@FindBy(id="FirstName")
	private WebElementFacade firstName;
	@FindBy(id="LastName")
	private WebElementFacade lastName;
	@FindBy(id="Email")
	private WebElementFacade emailAdd;
	@FindBy(id="Password")
	private WebElementFacade passAdd;
	@FindBy(id="ConfirmPassword")
	private WebElementFacade confPassAdd;
	@FindBy(id="register-button")
	private WebElementFacade registerBtn;
	@FindBy(xpath="//input[@value='Continue']")
	private WebElementFacade continueBtn;
	
	public void registerProcess() {
		open();
		regBtn.click();
		firstName.sendKeys("andra2");
		lastName.sendKeys("test2");
		emailAdd.sendKeys("andra2.test@gmail.com");
		passAdd.typeAndTab("test123");
		confPassAdd.typeAndEnter("test123");
		registerBtn.click();
	}
	
	public void regCompletedBtn() {
		continueBtn.click();
	}

}
