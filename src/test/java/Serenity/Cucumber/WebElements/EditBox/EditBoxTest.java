package Serenity.Cucumber.WebElements.EditBox;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
@RunWith(SerenityRunner.class)
public class EditBoxTest {
	
	@Managed
	WebDriver driver;
	
	EditBoxPage editPage;
	
	@Test
	public void tc1() throws InterruptedException {
		editPage.serenityTypeAndEnter();
		Thread.sleep(4000);
		
	}

}
