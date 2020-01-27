package Serenity.Cucumber;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LocatorExamplePage extends PageObject {

	public LocatorExamplePage(WebDriver driver) {
		super();
	}

	public void serenity_clickOnLink() {
		open();

//		WebElementFacade link = find(By.xpath("//a[@href='/abtest']"));
//		WebElementFacade link = find(By.cssSelector("//a[href='/windows']"),By.xpath("//a[@href='/abtest']"));
//		WebElementFacade link= findBy("//a[@href='/abtest']");
		WebElementFacade link=$("//a[@href='/abtest']");
//		link.getWrappedElement();
		link.click();
	}

	public void serenity_AllLinks() {
		open();
//		List<WebElement> links = getDriver().findElements(By.xpath("//div[@id='content']//a"));
//		for (WebElement link : links) {
//			System.out.println(link.getText().toUpperCase());
		List<WebElementFacade> links =findAll(By.tagName("a"));
		
//		for(WebElement link:links) {
//			System.out.println(link.getText().toUpperCase());
		links.forEach(e -> System.out.println(e.getText()));
		
		}
		
		
		}

	

