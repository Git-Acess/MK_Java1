Feature: This is the login feature with data
Scenario: This is login Scenario in orangeHRM with data
Given navigating to OrangeHRM
When providing the credintails "Admin" and "admin123"
And clicking the submit button
Then verifying the login page