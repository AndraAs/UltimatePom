Feature: Application Login 

@SanityTest 
Scenario Outline: Home page default registration 
	Given User navigates to "http://demowebshop.tricentis.com/" 
	Given User navigates to register page 
	When User registers with following details 
		|FirstName         | LastName       | Email                    | Password    | ConfirmPass|
		|dritte            | User         |dritteUser@test.com         | 123456      |123456      |
	When User selects <Products> 
	And User navigates to Shopping Cart 
	And User agrees with terms of sercive 
	And User clicks CheckOutBtn 
	When User fills in CheckOut details 
		|City|Address|PostalCode|PhoneNumber|
		|Cluj|Street1|1234567   |123456789  |
	Then User receives a succesfull payment process validation message 
	And Log out and Close browser 
	
	
	Examples: 
		|Products|
		|Digital downloads|	