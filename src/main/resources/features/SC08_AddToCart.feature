@smoke
Feature: SC8 Logged user could add different products to Shopping cart

  Scenario: User add product to shopping cart

    Given User logged in successfully
    When User go to home page to shop any product
    And User add products to cart
    Then User find the products in shopping cart

