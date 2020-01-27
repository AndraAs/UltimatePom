package Serenity.Cucumber.Tables;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;

@RunWith(SerenityRunner.class)
public class TableTest {
	
	@Managed
	WebDriver driver;
	
	TablePage tablepg;

	@Test
	public void tc1() {
		tablepg.extractFilteredRowsFromTable();
	}
}
