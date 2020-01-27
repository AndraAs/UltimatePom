package Serenity.Cucumber.CheckBox;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;

@RunWith(SerenityRunner.class)
public class CheckBoxTest {
@Managed
WebDriver driver;
CheckBoxPage checkpg;
@Test
public void tc1() throws InterruptedException {
	checkpg.selectCheckBox2();
	Thread.sleep(3000);
}
	
}
