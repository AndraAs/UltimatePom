package Serenity.Cucumber.Tables;

import java.util.List;
import java.util.Map;

import org.hamcrest.Matcher.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static net.thucydides.core.matchers.BeanMatcher.*;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import static org.hamcrest.Matchers.*;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.components.HtmlTable;
import net.thucydides.core.pages.components.HtmlTable.*;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;


@DefaultUrl("/tables")
public class TablePage extends PageObject {

	@FindBy(how = How.ID, using = "table2")
	protected WebElementFacade table;

	public void readCompleteTable() {
		open();
		List<Map<Object, String>> tabel = HtmlTable.rowsFrom(table);
		System.out.println(tabel);
	}

	public void extractFilteredRowsFromTable() {
		open();
//		List<WebElement> rowVal = filterRows(table, the("Email", endsWith("yahoo.com") ) );
//	for (WebElement e:rowVal) {
//		System.out.println(e.getText() );
	}
	

	public void extractHeadings() {
		open();
//		inTable(table).
	}

	public void extractAllRows() {
		open();
	}

}
