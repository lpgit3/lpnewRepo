Feature: validate anz available header content

  Scenario: validate to apply home loan
    Given user launch anz chrome browser
    When user enter anz url "https://www.anz.com.au/personal/"
    And capture a anz header screenshot
    And clickon homeloan
    Then user should land on homeloan page title "Home loans, calculators, interest rates & offers | ANZ"
    And click on ApplyforpreAproval button
    And click on ApllyOnline
    And select Apply for pre approval for I want to..
    And select 1 for What do you owe on your current home loan(s) (if any)?
    And select 1 for How much do you want to borrow?
    And select 1 to 3 month for My buying timeframe is…
    And enter a firstname as "anzfirstname"
    And enter a lastname as "anzlastname"
    And enter a email as "anzfirstname@gmail.com"
    And enter a postcode as "1243"
    And enter a phone number as "+919084756796"
    And select anytime for Best time for us to call (optional)
    And select 3 for Number of dependants
    And select No for Are you an existing ANZ customer?
    And select 1 for Number of borrowers
    And select full-time for Applicant 1 employment status
    And select casual for Applicant 2 employment status
    And select 33 for Time in current employment applicant 1
    And select 3 for Time in current employment applicant 2
    And click on submit button
