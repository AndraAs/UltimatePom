Feature: DemoWebShop Register and Product CheckOut

Scenario: Home page default registration 
	Given User navigates to registration page 
	And User fills in Registration Form
	
	And User clicks on Register button to complete registration
	Then User clicks on Continue button to navigate to Home Page
	When User clicks on Apparel and Shoes Link 
	Then User is able to select products from Apparel and Shoes Category
