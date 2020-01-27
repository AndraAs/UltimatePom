package Serenity.Cucumber;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;

@RunWith(SerenityRunner.class)
public class LocatorExamplesTest {
	@Managed
	WebDriver driver;
	
	LocatorExamplePage page;
	
	@Test
	public void tc1() throws InterruptedException {
		page.serenity_AllLinks();
		Thread.sleep(3000);
	}

}
