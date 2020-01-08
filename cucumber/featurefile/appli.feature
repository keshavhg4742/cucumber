Feature: Login and Branches

@smoke
Scenario: Validate the login functionality with valid data
Given Launch the site
When  Enter the username with "Admin" and password with "M1ndqLp" and click on login btn
Then  Branches btn should be displayed
Then  close site

Scenario: Validate the login functionality with invalid data
Given Launch the site
When  Enter the username with "Admin" and password with "ndqLp" and click on login btn
Then  Handle the alert message
Then  close site
#@smoke
Scenario: Validate the branches btn
Given Launch the site
When  Enter the username with "Admin" and password with "M1ndqLp" and click on login btn
Then  Branches btn should be displayed and click on Branches btn
Then  close site
#@smoke
Scenario Outline: Validate the Branch creation with multiple data set
Given Launch the site
When  Enter the username with "Admin" and password with "M1ndqLp" and click on login btn
Then  Branches btn should be displayed and click on Branches btn
When  enter the Branchname "<branchname>" ,adress "<adress>" ,zipcode "<zipcode>" ,country "<country>" ,state "<state>" ,city "<city>"

Examples:
|branchname|adress|zipcode|country|state|city|
|MARHLI|btmlayout|44444|INDIA|Karnataka|Bangalore|
|MR|btm|444|INDIA|Karnataka|Bang|



