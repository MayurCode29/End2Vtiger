Feature: Leads page functionality


Background: 
Given the user is on login page
When user user enters username "admin" and password "admin"
And clicks on Login button

Scenario: Clicking on leads page and entering firstname and searching member
Given the user is on leads page
When enters name in first name field
And clicks on search
Then user should see member with that name