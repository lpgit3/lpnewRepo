Feature: Login to Testmo

  Background: common login field
    Given user launch a testmoEdge browser
    When user enter Testmo login URL "https://bddcucumber.testmo.net/auth/login"
    Then user should land on login page title "Login - Testmo"
    And validate Email text field available
    And enter a valid email as "lppawar3396@gmail.com"
    And validate Password text field available
    And enter a valid Pass as "Lp@33909696"
    And validate checkbox of "Keep me logged in on this computer" available
    And select a checkbox
    And validate testmo login button available
    And click on TestmoLogin button
    Then user should land on testmo home pahe title "Projects - Testmo"

  Scenario: login to Testmo with valid credentials
    And click on LogoutButton
    Then user should land on login page title "Login - Testmo"
    And close testmo browser

  @NewProject
  Scenario: create a new project
    When click on project button
    Then get Title of add project
    And project name field should available under project
    And enter a project name as "NewProject"
    And project Summery text field should available under project
    And enter a summery for project as "Moves this project to the completed section of the project list"
    And select tester as default access
    When click on users
    Then project ttitle should available under users
    When click on createProject button
    And close testmo browser

  @addTest
  Scenario Outline: create a test cases for login facebook with valid credentials
    When select a new created NewProject project
    When click on repository
    And click on add test case button
    And enter a test case name as "<testcaseName>"
    And enter a test case description as "<testcaseDescription>"
    And enter a test case Expected result as "<testcaseExpectedResult>"
    And enter an Estimate as "<Estimate>"
    And select Case(steps) as Templete
    And select state as Active
    And select High priority
    And click on addCase
    And close testmo browser

    Examples: 
      | testcaseName                         | testcaseDescription         | testcaseExpectedResult                     | Estimate |
      | enter valid user name                | user enter a valid username | user should able to enter a valid username |        1 |
     