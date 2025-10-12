Feature: Account creation


Background: 
Given the user is on login page
When user user enters username "admin" and password "admin"
And clicks on Login button

Scenario: Clicking on save without filling mandatory field details
Given the user is on Accounts page
When user user enters clicks on save
Then popup should appear