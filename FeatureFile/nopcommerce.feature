Feature: nopcommerce register new user and login

  Scenario Outline: validate register new user to nopcommerce
    Given user launch a browser
    When user enter an URL "<url>"
    Then user should land on nopcommerce login"<pagettitle>"
    And click on Register
    Then register title should available
    And select male as gender
    And enter a personal details "<fname>"
    And enter a personal details "<lname>"
    And enter a personal details "<email>"
    And enter a company details like "<companyName>"
    And under options under select newsletter checkbox
    And enter a password like "<password>"
    And Reenter a password like "<confipassword>"
    And click on register button
    And close browser

    Examples: 
      | url                           | pagettitle                              | fname | lname    | email                 | companyName | password   | confipassword |
      | https://demo.nopcommerce.com/ | nopCommerce demo store. Home page title | bdd   | cucumber | lppawar3396@gmail.com | Infosys     | Pawar@1234 | Pawar@1234    |
