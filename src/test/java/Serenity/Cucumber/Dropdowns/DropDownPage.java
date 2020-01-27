package Serenity.Cucumber.Dropdowns;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.components.Dropdown;

@DefaultUrl("/dropdown")
public class DropDownPage extends PageObject {

	@FindBy(id="dropdown")
	private WebElementFacade dropdownId;
	public void selectVal() throws InterruptedException {
		open();
//		Dropdown.forWebElement(dropdownId).selectByValue("2");
//		Dropdown.forWebElement(dropdownId).select("Option 1");
		selectFromDropdown(dropdownId, "Option 2");
		System.out.println(getSelectedValueFrom(dropdownId));
		Thread.sleep(4000);
	}
	
}
