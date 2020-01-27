package Serenity.Cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class HomePageNavLinks extends PageObject{
	
	public HomePageNavLinks(WebDriver driver) {
super();		
	}
	
	public void selectCategory() {
		open();
		WebElementFacade link=$("//ul[@class='top-menu']/li[4]/a");
		

				
		
		link.click();
	}

}
