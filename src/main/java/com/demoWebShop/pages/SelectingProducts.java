package com.demoWebShop.pages;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SelectingProducts extends BasePageWebShop {

	String[] productItems = { "1.00" };

	public ProductsPageWebShop serenityPickProd() {
		int i = 0;
//		open();
		List<WebElement> linkBtn = getDriver().findElements(By.cssSelector("span.price.actual-price"));
		for (int j = 0; j < linkBtn.size(); j++) {
			String numeProd = linkBtn.get(j).getText();
			System.out.println(numeProd);
			List prodItenL = Arrays.asList(productItems);
			if (prodItenL.contains(numeProd)) {
				i++;
				
				getDriver().findElements(By.cssSelector("input[value='Add to cart']")).get(j).click();
				
			}
//				
		}
		return this.switchToPage(ProductsPageWebShop.class);
	}
	
	
}


