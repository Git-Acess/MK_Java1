Feature: This is to check google search operation
Scenario: Google search scenario
Given user is enteing the url "http://www.google.co.in"
When user is providing the search "Mukesh"
And  search result are visible to user
Then taking the screenshot of the search result