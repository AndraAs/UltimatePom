package Serenity.Cucumber.RadioButton;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;

@RunWith(SerenityRunner.class)
public class RadioButtonTest {
@Managed
WebDriver driver;
RadioButtonPage radiop;
@Test
public void tc1() throws InterruptedException {
	radiop.radioButton2();
	Thread.sleep(3000);
}
	
}
