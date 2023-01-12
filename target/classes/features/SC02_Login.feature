@smoke

Feature: SC2 Login users could use login to use their accounts

  Scenario: user login with valid email and password

  Given user go to login page
  When user enter Valid email
  And user enter Valid password
    And click on login button
  Then user login to the system successfully

  Scenario: user could login with invalid email and password

  Given user go to login page
  When user enter invalid email
  And user enter invalid password
  And click on login button
  Then user could not login


