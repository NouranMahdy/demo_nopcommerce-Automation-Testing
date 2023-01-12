@smoke

Feature: SC11 Create successful Order

  Scenario: User create an order

    Given user loggedin for making order
    When user clickedon shoppingcart
    And User fill data for make the order
    Then Order created successfully


