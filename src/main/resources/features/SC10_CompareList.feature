@smoke

Feature: SC10 Logged user add different products to compare list

  Scenario: user try to compare different products

    Given user logged in for compare list
    When user go to home page to shop any product
    And User Add products to compare
    And Successful message for added products to compare
    Then User find the products in compare list






