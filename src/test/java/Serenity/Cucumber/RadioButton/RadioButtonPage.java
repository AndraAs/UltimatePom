package Serenity.Cucumber.RadioButton;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.webelements.RadioButtonGroup;
//@DefaultUrl("example=6")
public class RadioButtonPage extends PageObject{
	
	public void radioButton() {
		getDriver().get("http://html.cita.illinois.edu/nav/form/radio/index.php?example=6");
		List <WebElement> radBtn =getDriver().findElements(By.name("crust"));
		
		RadioButtonGroup rd= new RadioButtonGroup(radBtn);
		rd.selectByValue("thick");
		System.out.println(rd.getSelectedValue().get());
	}
	public void radioButton2() throws InterruptedException {
		open();
		 inRadioButtonGroup("crust").selectByValue("thin");
		 System.out.println(inRadioButtonGroup("crust").getSelectedValue().get());
		 Thread.sleep(3000);
	}

}
