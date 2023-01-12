@smoke

Feature: SC9 Wishlist Logged user could add product to a wishlist successfully

  Scenario: User could be able to add products to wishlist

    Given User logged in successfully and User go to home page to shop any product
    When User clicks on wishlist button on the product
     And green message appear for successful add products to wishlist
    Then User open wishlist page and find the items has been selected






