package Serenity.Cucumber.Dropdowns;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;

@RunWith(SerenityRunner.class)
public class DropDownTest {
	@Managed
	WebDriver driver;
	DropDownPage dPage;
	@Test
	public void tc1() throws InterruptedException {
		dPage.selectVal();
	}

}