Feature: DemoWebShop Register and Product CheckOut 

Scenario Outline: 
    Home page default registration 
	Given User navigates to registration page 
	And User fills in Registration Form with thse details <FirstName>,<LastName>,<Email>,<Password>,<ConfirmPass>
	
	And User clicks on Register button to complete registration 
	Then User clicks on Continue button to navigate to Home Page 
	When User clicks on Apparel and Shoes Link 
	Then User is able to select products from Apparel and Shoes Category 
	When User clicks on Shopping Cart Link 
	Then User is redirected to Shopping Cart Page and can select Country for Checkout 
	And User agrees to terms of sercive 
	And User clicks on CheckOut button 
	Then User fills in Billing Address 
	And User fills Shipping Address and clicks continue 
	And User fills Shipping Method 
	And User fills Payment method 
	And User fills Payment Information 
	Then User confirms order 
	And User clicks continue to confirm successfull order 
	And User logs out
	
	Examples:
	|FirstName|LastName|Email               |Password |ConfirmPass|
	|tesa3n4d5|ultimate2|tesa3n4d5@gmail.com|tesa3n4d5|tesa3n4d5  |
	|tesa4n5d6|final2   |tesa4n5d6@gmail.com|tesa4n5d6|tesa4n5d6  |
	
