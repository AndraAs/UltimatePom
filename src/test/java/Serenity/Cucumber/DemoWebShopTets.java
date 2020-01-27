package Serenity.Cucumber;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;

@RunWith(SerenityRunner.class)
public class DemoWebShopTets {
	@Managed
	WebDriver driver;
	HomePageNavLinks navLink;
	
	@Test
	public void testCase1() throws InterruptedException {
		navLink.selectCategory();
		Thread.sleep(3000);
	}

}
