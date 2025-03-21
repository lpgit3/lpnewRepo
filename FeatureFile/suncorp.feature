Feature: search google functionality
@sanity
Scenario: validate Google search functionality
Given user launch a chrome browser
When user enter an URL as "https://www.google.com/"
And enter a search text as "https://www.facebook.com/login/"

And close browser
