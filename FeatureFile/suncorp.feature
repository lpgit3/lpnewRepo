Feature: search google functionality
@sanity
Scenario: validate Google search functionality
Given user launch a chrome browser
When user enter an URL as "https://www.google.com/"
And enter a search text as "https://www.facebook.com/login/"

And close browser

@hrmLogin
Scenario: validate login to orangeHRM with valid credentials
Given user launch a chrome browser
When user enter an URL as "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
Then user should land on page title "OrangeHRM"
When user enter an username as "Admin"
And user enter an password as "admin123"
When click on Login button
Then user should land on orangeHRM home page title "OrangeHRM"
And capture orangeHRM homepage screenshot
And close browser