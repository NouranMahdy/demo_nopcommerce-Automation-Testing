@smoke

Feature: SC12 User reset password


  Scenario: User want to reset his/her password


    Given User go to login page
    When User clicked reset password button
    And User enter email to send the key to reset the password
    And User clicked the reset button
    Then The website send to email has been register
