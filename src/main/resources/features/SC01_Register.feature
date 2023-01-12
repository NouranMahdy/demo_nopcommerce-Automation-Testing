@smoke

Feature: SC1 Register users could register with new account

  Scenario: guest user could register with valid data successfully

    Given user go to register page
    When user select the gender type
    And  user enter first name
    And user enter last name
    And user enter birth date
    And  user enter email
    And user enter company name
    And  user enter password
    And user enter confirmation
    And user clicks on register button
    Then user register successfully with the message
    And user clicks on continue button



