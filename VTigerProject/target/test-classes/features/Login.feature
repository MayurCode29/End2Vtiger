Feature: User Login
Background:
Given the user is on login page

Scenario: Login with valid username and password
When user user enters username "admin" and password "admin"
And clicks on Login button
Then user should be on homepage

Scenario Outline: Login with invalid username and invalid password


When user user enters username "<username>" and password "<password>"
And clicks on Login button
Then user should be see error message

Examples:
|username | password |
|admin1   | admin1   |
|admin2   | admin2   |
|admin3   |admin3    |



