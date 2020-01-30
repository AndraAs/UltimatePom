package com.demoWebShop.pages;

public class CheckOutPage extends BasePageWebShop {
	private static final String firstNameBillingAdd = "//input[@id='BillingNewAddress_FirstName']";
	private static final String lastNameBillingAdd = "//input[@id='BillingNewAddress_LastName']";
	private static final String emailBillingAdd = "//input[@id='BillingNewAddress_Email']";
	private static final String countryBillingAdd = "//select[@id='BillingNewAddress_CountryId']";
	private static final String cityBillingAdd = "//input[@id='BillingNewAddress_City']";
	private static final String addresss1BillingAdd = "//input[@id='BillingNewAddress_Address1']";
	private static final String zipBillingAdd = "//input[@id='BillingNewAddress_ZipPostalCode']";
	private static final String phoneBillingAdd = "//input[@id='BillingNewAddress_PhoneNumber']";
	private static final String ContinueBtnBillingAdd = "//input[@value='Continue']";
	private static final String ContinueBtnShippingAdd = "//div[@id='shipping-buttons-container']//input[@value='Continue']";
	private static final String ContnueBtnMethodShip = "//div[@id='shipping-method-buttons-container']//input[@type='button']";
	private static final String ContinuePaymentMethod="//div[@id='payment-method-buttons-container']//input[@value='Continue']";
	private static final String ContinuePaymentInformation="//div[@id='payment-info-buttons-container']//input[@value='Continue']";
	private static final String ConfirmOrderBtn = "//div[@id='confirm-order-buttons-container']//input[@value='Confirm']";
	private static final String OrderCompleteBtn = "//div[@class='buttons']//input[@value='Continue']";

	public CheckOutPage fillBillingAddress(String FirstNameBill, String LastNameBill, String EmailBill,
			String CountryBill, String CityBill, String Adress1Bill, String ZipBill, String PhoneNumBill) {
		waitForTextToAppear("Billing Address");
		waitFor(firstNameBillingAdd).$(firstNameBillingAdd).type(FirstNameBill);
		waitFor(lastNameBillingAdd).$(lastNameBillingAdd).type(LastNameBill);
		waitFor(emailBillingAdd).$(emailBillingAdd).type(EmailBill);
		waitFor(countryBillingAdd).$(countryBillingAdd).selectByVisibleText(CountryBill);
		waitFor(cityBillingAdd).$(cityBillingAdd).type(CityBill);
		waitFor(addresss1BillingAdd).$(addresss1BillingAdd).type(Adress1Bill);
		waitFor(zipBillingAdd).$(zipBillingAdd).type(ZipBill);
		waitFor(phoneBillingAdd).$(phoneBillingAdd).type(PhoneNumBill);
		waitFor(ContinueBtnBillingAdd).$(ContinueBtnBillingAdd).click();

		return this;
	}

	public CheckOutPage fillShippingAddress() {
		waitForTextToAppear("Shipping Address");
		waitFor(ContinueBtnShippingAdd).$(ContinueBtnShippingAdd).click();

		return this;
	}

	public CheckOutPage fillShippingMethod() {
		waitForTextToAppear("Shipping Method");

		waitFor(ContnueBtnMethodShip).$(ContnueBtnMethodShip).click();
		return this;
	}

	public CheckOutPage fillPaymentMethod() {
		waitFor(ContinuePaymentMethod).$(ContinuePaymentMethod).click();
		return this;
	}

	public CheckOutPage fillPaymentInfo() {
		waitForTextToAppear("Payment Information");
		waitFor(ContinuePaymentInformation).$(ContinuePaymentInformation).click();
		return this;
	}

	public CheckOutPage confirmOrder() {
		waitForTextToAppear("Confirm Order");
		waitFor(ConfirmOrderBtn).$(ConfirmOrderBtn).click();

		return this;

	}
	public ProductsPageWebShop orderSuccesContinue() {
		waitForTextToAppear("Your order has been successfully processed!");
		waitFor(OrderCompleteBtn).$(OrderCompleteBtn).click();
		return this.switchToPage(ProductsPageWebShop.class);
	}
}
