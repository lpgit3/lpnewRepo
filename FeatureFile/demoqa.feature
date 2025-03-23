Feature: handle functionality of DemoQA

Scenario: validate all alert functionality
Given user launch browser
When user enter an URL "https://demoqa.com/alerts"
And validate user should be land on page title "DEMOQA"
And click on click me button of see alert
Then user should open a see alert pop-up
When click on Ok button of alert
Then Alert should close
And close browser


















