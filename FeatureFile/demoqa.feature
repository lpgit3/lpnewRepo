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

  @alertpopUp
  Scenario: handled alert demo
    Given user launch browser
    When user enter an URL "https://www.hyrtutorials.com/p/alertsdemo.html"
    When click on clickMe button of alertMe
    Then alert pop up should open
    And alert box text should be "I am an alert box!"
    When click on Ok button of AlertBox
    Then alert box should close
    And pop up box output should be "You selected alert popup"
    And close browser

  @confirmAlert
  Scenario: handled confirm box
    Given user launch browser
    When user enter an URL "https://www.hyrtutorials.com/p/alertsdemo.html"
    When click on clck me button of Confirm box
    Then alert text should be "Press a button!"
    And click on Ok button of confirm box
    Then confirm pop up output should be "You pressed OK in confirmation popup"
    And close browser
