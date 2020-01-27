package Serenity.Cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.FindElements;

import net.serenitybdd.core.pages.WebElementFacade;

import java.util.Arrays;
import java.util.List;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("/apparel-shoes")
public class ApparelAndShoesPage extends PageObject {
	
	String[] productItems = {"1.00"};
	public void serenityPickProd() throws InterruptedException {
		int i=0;
		open();
		List<WebElement> linkBtn = getDriver().findElements(By.cssSelector("span.price.actual-price"));
		for (int j=0;j<linkBtn.size();j++) {
		String numeProd= linkBtn.get(j).getText();
		System.out.println(numeProd);
		List prodItenL = Arrays.asList(productItems);
				if(prodItenL.contains(numeProd)) {
					i++;
					Thread.sleep(4000);
				getDriver().findElements(By.cssSelector("input[value='Add to cart']")).get(j).click();
Thread.sleep(5000);
				}
//				i++;
		 }
	}
}
