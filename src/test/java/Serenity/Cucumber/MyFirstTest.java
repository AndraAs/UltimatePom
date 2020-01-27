package Serenity.Cucumber;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Title;

@RunWith(SerenityRunner.class)
public class MyFirstTest {
	@Managed
	WebDriver driver;
	@Title("This is my first serenity test")
	@Test
	public void navToGoogle() {
		
		driver.navigate().to("https://mvnrepository.com/artifact/org.apache.maven/maven-plugin-api/3.6.3");

	}

}
