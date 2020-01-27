package Serenity.Cucumber.CheckBox;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.webelements.Checkbox;

@DefaultUrl("/checkboxes")
public class CheckBoxPage extends PageObject {

	@FindBy(xpath="//form[@id='checkboxes']/input[1]")
	private WebElementFacade xpathCheckBox1;
	@FindBy(xpath="//form[@id='checkboxes']/input[2]")
	private WebElementFacade xpathCheckBox2;
	public void selectCheckBox() throws InterruptedException {
		open();
		Checkbox checkbox = new Checkbox(xpathCheckBox1);
//		checkbox.setChecked(true);
//		Thread.sleep(3000);
		
		Checkbox checkbox2 = new Checkbox(xpathCheckBox2);
//		checkbox2.setChecked(false);
		System.out.println(checkbox.isChecked()); 
		System.out.println(checkbox2.isChecked());
	}
	public void selectCheckBox2() throws InterruptedException {
		open();
		setCheckbox(xpathCheckBox1, true);
		setCheckbox(xpathCheckBox2, false);
		
	}
	
}
