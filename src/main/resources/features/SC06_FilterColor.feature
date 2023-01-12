@smoke
Feature: SC6 Logged user could filter with color

  Scenario: User filter choosen item by color

    Given User should logged in successfully
    When User select an item to filter
    And User filter items by color
    Then User appear for him the filter items with color he choosed

