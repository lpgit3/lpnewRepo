Feature: validate anz available header content

  Scenario: validate to apply home loan
    Given user launch anz chrome browser
    When user enter anz url "https://www.anz.com.au/personal/"
    And capture a anz header screenshot
    And clickon homeloan
    Then user should land on homeloan page title "Home loans, calculators, interest rates & offers | ANZ"
    And click on ApplyforpreAproval button
